package day03;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;
import java.util.Optional;

public class PersonDao {
    private JdbcTemplate jdbcTemplate;

    public PersonDao(DataSource dataSource) {
        jdbcTemplate =new JdbcTemplate(dataSource);
    }
    public void savePerson(Person personToSave){
        jdbcTemplate.update("INSERT INTO person (name_of_person,date_of_birth,height,weight) VALUES(?,?,?,?);",personToSave.getName(), Date.valueOf(personToSave.getDateOfBirth()),personToSave.getHeight(),personToSave.getWeight());
   }
    public void savePeople(List<Person> peopleToSave){
        for(Person personToSave:peopleToSave){
            savePerson(personToSave);
        }
    }
    private PreparedStatement preparedStatementForinsert(Connection con, Person personToSave) throws SQLException {
        String sql = "INSERT INTO person (name_of_person,date_of_birth,height,weight) VALUES(?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, personToSave.getName());
        ps.setDate(2, Date.valueOf(personToSave.getDateOfBirth()));
        ps.setInt(3, personToSave.getHeight());
        ps.setDouble(4, personToSave.getWeight());
        return ps;
    }
    public long savePersonAndGetId(Person personToSave) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> preparedStatementForinsert(con,personToSave), keyHolder);
        return keyHolder.getKey().longValue();
    }

    public Optional<List<Person>> findPeopleByNameStartWith(String prefix) {
        return Optional.of(jdbcTemplate.query("SELECT * FROM person WHERE name_of_person LIKE ? ORDER BY id DESC", new PersonMapper(),prefix+'%'));
    }

    public Optional<String> findPersonNameById(int id) {
        List<String> result=jdbcTemplate.query("SELECT name_of_person FROM person WHERE id = ?",(rs, i) -> rs.getString("name_of_person"), id);
        if(result.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(result.get(0));
    }
    public List<String> listPeopleNames() {
        return jdbcTemplate.query("SELECT name_of_person FROM person", (rs, i) -> rs.getString("name_of_person"));
    }
    public Person findPersonById(int id) {
        List<Person> result=jdbcTemplate.query("SELECT * FROM person WHERE id = ?", new PersonMapper(),id);
        if(result.isEmpty()){
            throw new IllegalArgumentException("There is mo user with id: "+id);
        }
        return result.get(0);
    }
    public List<Person> findAllPeople() {
        return jdbcTemplate.query("SELECT * FROM person ORDER BY id DESC", new PersonMapper());
    }
    public void increaseWeight(long id, double weight){
        //long actualPieces=jdbcTemplate.queryForObject("SELECT pieces FROM books WHERE id = ?", Integer.class,id);
        jdbcTemplate.update("UPDATE person SET weight=weight+? WHERE id=?",weight,id);
    }

    public void deletePersonById(int id){
        jdbcTemplate.update("DELETE FROM person WHERE id=?",id);
    }



    public String findPersonNameByIdOptional(int id) {
        List<String> result=jdbcTemplate.query("SELECT name_of_person FROM person WHERE id = ?",(rs, rowNum) -> rs.getString("name_of_person"), id);
        if(result.isEmpty()){
            throw new IllegalArgumentException("There is mo user with id: "+id);
        }
        return result.get(0);
    }

    public List<String> findPersonNameById2(int id) {
        Optional<List<String>> optional=Optional.of(jdbcTemplate.query("SELECT name_of_person FROM person WHERE id = ?",(rs, rowNum) -> rs.getString("name_of_person"), id));
        return optional.get();
    }
}
