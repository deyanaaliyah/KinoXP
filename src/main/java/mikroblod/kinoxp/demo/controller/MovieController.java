package mikroblod.kinoxp.demo.controller;

import mikroblod.kinoxp.demo.model.Movie;
import mikroblod.kinoxp.demo.repository.IMovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MovieController {

    IMovieRepository movieRepository;

    public MovieController(IMovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }


    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("movies",movieRepository.readAll());

        return "index";
    }

    //Create a Movie request
    @GetMapping("create-movie")
    public String createMovie(Model model)
    {
        Movie movie = new Movie();
        model.addAttribute("newMovie", movie);
        return "createMovie";
    }
    //Allows input request about creating a movies
    @PostMapping("create-movie")
    public String createdMovie(@ModelAttribute Movie newMovie)
    {
        //Adds the created movie to the database
        movieRepository.create(newMovie);
        return "index";
    }
}
