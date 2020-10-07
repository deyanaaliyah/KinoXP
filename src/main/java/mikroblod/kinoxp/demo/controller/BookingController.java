package mikroblod.kinoxp.demo.controller;

import mikroblod.kinoxp.demo.model.Customer;
import mikroblod.kinoxp.demo.model.Seat;
import mikroblod.kinoxp.demo.repository.ICustomerRepository;
import mikroblod.kinoxp.demo.repository.ISeatsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookingController {

ISeatsRepository seatsRepository;
ICustomerRepository customerRepository;

    public BookingController(ISeatsRepository seatsRepository, ICustomerRepository customerRepository) {
        this.seatsRepository = seatsRepository;
        this.customerRepository = customerRepository;
    }

    @GetMapping("/booking")
    public String Booking(){
        return "booking";
    }

    @GetMapping("/create-booking")
    public String createSeats(Model model)
    {
        Seat seat = new Seat();
        model.addAttribute("newSeats", seat);
        Customer customer = new Customer();
        model.addAttribute("newCustomer", customer);
        return "booking";
    }
    //Allows input request about creating a booking
    @PostMapping("/create-booking")
    public String createdSeat(@ModelAttribute Seat newSeat, Customer newCustomer)
    {
        //Adds the created seat to the database
        seatsRepository.create(newSeat);
        //Adds the created customer to the database
        customerRepository.create(newCustomer);
        return "customer_reciept";
    }

}
