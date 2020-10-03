package mikroblod.kinoxp.demo.repository;

import mikroblod.kinoxp.demo.model.Movie;

import java.util.List;

public interface IMovieRepository {
    void create(Movie m);
    Movie read(int id);
    List<Movie> readAll();
}