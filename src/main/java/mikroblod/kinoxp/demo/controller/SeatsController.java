package mikroblod.kinoxp.demo.controller;

import mikroblod.kinoxp.demo.model.Movie;
import mikroblod.kinoxp.demo.model.Seats;
import mikroblod.kinoxp.demo.repository.ISeatsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SeatsController {

ISeatsRepository seatsRepository;

    public SeatsController(ISeatsRepository seatsRepository) {
        this.seatsRepository = seatsRepository;
    }

    @GetMapping("/booking")
    public String Booking(){
        return "booking";
    }

    @GetMapping("/create-seat")
    public String createSeats(Model model)
    {
        Seats seats = new Seats();
        model.addAttribute("newSeats", seats);
        return "booking";
    }
    //Allows input request about creating a movies
    @PostMapping("/create-seat")
    public String createdSeat(@ModelAttribute Seats newSeat)
    {
        //Adds the created movie to the database
        seatsRepository.create(newSeat);
        return "index";
    }

}
