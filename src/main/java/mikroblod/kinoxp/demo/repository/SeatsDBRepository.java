package mikroblod.kinoxp.demo.repository;
import mikroblod.kinoxp.demo.model.Seats;
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
    public void create(Seats seats) {

        String sql ="INSERT INTO seats(seat_id) VALUES(?)";
        jdbcTemplate.update(sql,seats.getId());

    }

    @Override
    public Seats read(int id) {
        return null;
    }

    @Override
    public List<Seats> readAll() {

        List<Seats> seats= new ArrayList<>();

        String sql = "SELECT * FROM seats";
        sqlRowSet = jdbcTemplate.queryForRowSet(sql);

        while(sqlRowSet.next()){
            seats.add(new Seats(
                    sqlRowSet.getInt("Id")
            ));
        }
        return seats;

    }
}
