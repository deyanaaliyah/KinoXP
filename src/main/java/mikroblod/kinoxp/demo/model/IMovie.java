package mikroblod.kinoxp.demo.model;

import mikroblod.kinoxp.demo.model.Movie;

import java.util.List;

public interface IMovie {

    Movie read(int id);
    List<Movie> readAll();
}