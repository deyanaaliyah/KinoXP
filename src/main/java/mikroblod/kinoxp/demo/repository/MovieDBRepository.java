package mikroblod.kinoxp.demo.repository;

import mikroblod.kinoxp.demo.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieDBRepository implements IMovieRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;
    SqlRowSet sqlRowSet;

    @Override
    public void create(Movie m) {

    }

    @Override
    public Movie read(int id) {
        return null;
    }

    @Override
    public List<Movie> readAll() {
        List<Movie> movies = new ArrayList<>();

        String sql = "SELECT * FROM Movies";
        sqlRowSet = jdbcTemplate.queryForRowSet(sql);

        while(sqlRowSet.next()){
            movies.add(new Movie(
                    sqlRowSet.getString("title"),
                    sqlRowSet.getString("genre"),
                    sqlRowSet.getString("runningTime"),
                    sqlRowSet.getString("releaseDate"),
                    sqlRowSet.getInt("seatings"),
                    sqlRowSet.getString("bio"),
                    sqlRowSet.getInt("ageLimit"),
                    sqlRowSet.getString("imageLink"))
            );
        }
        return movies;
    }
}
