package mikroblod.kinoxp.demo.controller;

import mikroblod.kinoxp.demo.model.Customer;
import mikroblod.kinoxp.demo.repository.ICustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    ICustomerRepository iCustomerRepository;

    public CustomerController(ICustomerRepository iCustomerRepository)
    {
        this.iCustomerRepository = iCustomerRepository;
    }

    @GetMapping("/customer-booking")
    public String createCustomer(Model model)
    {
        Customer customer = new Customer();
        model.addAttribute("newCustomer",customer);
        return "/booking.html";
    }

    @PostMapping("/customer-booking")
    public String createdCustomer(@ModelAttribute Customer newCustomer)
    {
        iCustomerRepository.create(newCustomer);
        return "customer_reciept";
    }
}
