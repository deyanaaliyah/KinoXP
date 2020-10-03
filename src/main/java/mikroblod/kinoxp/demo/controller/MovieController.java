package mikroblod.kinoxp.demo.controller;

import mikroblod.kinoxp.demo.model.IMovie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

    IMovie movieRepository;

    public MovieController(IMovie movieRepository){
        this.movieRepository = movieRepository;
    }


    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("movies",movieRepository.readAll());

        return "index";
    }



}
