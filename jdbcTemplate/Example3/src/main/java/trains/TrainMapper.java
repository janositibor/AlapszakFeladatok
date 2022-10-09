package trains;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TrainMapper implements RowMapper<Train> {
    @Override
    public Train mapRow(ResultSet rs, int rowNum) throws SQLException {
        Train train=new Train(
                rs.getInt("id"),
                rs.getString("destination"),
                rs.getTimestamp("departure").toLocalDateTime(),
                rs.getInt("max_capacity"),
                rs.getInt("number_of_passengers")
        );
        return train;
    }
}
