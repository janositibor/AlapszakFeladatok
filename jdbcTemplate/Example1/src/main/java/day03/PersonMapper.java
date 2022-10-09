package day03;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person(
                rs.getInt("id"),
                rs.getString("name_of_person"),
                rs.getDate("date_of_birth").toLocalDate(),
                rs.getInt("height"),
                rs.getFloat("weight") );
        return person;
    }
}
