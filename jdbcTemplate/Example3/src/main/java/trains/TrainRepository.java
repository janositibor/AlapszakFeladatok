package trains;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class TrainRepository {
    private JdbcTemplate jdbcTemplate;

    public TrainRepository(DataSource dataSource) {
        jdbcTemplate =new JdbcTemplate(dataSource);
    }

    public void updateNumberOfPassengersById(long id, int amount){
        jdbcTemplate.update("UPDATE trains SET number_of_passengers=number_of_passengers+?, departure=departure WHERE id=?",amount,id);

    }

    public List<Train> getTrainsByDestination(String destination){
        Optional<List<Train>> optional=Optional.of(jdbcTemplate.query("SELECT * FROM trains WHERE destination = ? ORDER BY departure",new TrainMapper(), destination));
        return optional.get();
    }

    public Train findById(long id){
        List<Train> result=jdbcTemplate.query("SELECT * FROM trains WHERE id = ?", new TrainMapper(),id);
        if(result.isEmpty()){
            throw new IllegalArgumentException("There is mo train with id: "+id);
        }
        return result.get(0);
    }

    public long insertTrain(String destination, LocalDateTime departure, int maxCapacity){
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> preparedStatementForinsert(con,destination, departure, maxCapacity), keyHolder);
        return keyHolder.getKey().longValue();
    }
    private PreparedStatement preparedStatementForinsert(Connection con, String destination, LocalDateTime departure, int maxCapacity) throws SQLException {
        String sql = "INSERT INTO trains (destination, departure, max_capacity, number_of_passengers) VALUES(?,?,?,0);";
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, destination);
        ps.setTimestamp(2, Timestamp.valueOf(departure));
        ps.setInt(3, maxCapacity);
        return ps;
    }
}
