package mikroblod.kinoxp.demo.controller;

import mikroblod.kinoxp.demo.repository.IMovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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



}
