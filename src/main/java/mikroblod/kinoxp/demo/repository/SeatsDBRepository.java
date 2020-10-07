package mikroblod.kinoxp.demo.repository;
import mikroblod.kinoxp.demo.model.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class SeatsDBRepository implements ISeatsRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;
    SqlRowSet sqlRowSet;

    @Override
    public void create(Seat seat) {

        String sql ="INSERT INTO Seats(seat_id,seat_name) VALUES(?,?)";
        jdbcTemplate.update(sql, seat.getId(), seat.getSeatName());

    }

    @Override
    public Seat read(int id) {
        return null;
    }

    @Override
    public List<Seat> readAll() {

        List<Seat> seats= new ArrayList<>();

        String sql = "SELECT * FROM Seats";
        sqlRowSet = jdbcTemplate.queryForRowSet(sql);

        while(sqlRowSet.next()){
            seats.add(new Seat(
                    sqlRowSet.getInt("id"),
                    sqlRowSet.getString("seatName")
            ));
        }
        return seats;
    }
}
