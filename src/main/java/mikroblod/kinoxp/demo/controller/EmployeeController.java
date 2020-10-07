package mikroblod.kinoxp.demo.controller;

import mikroblod.kinoxp.demo.repository.EmployeeDBRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
EmployeeDBRepository employeeRepository;

    public EmployeeController(EmployeeDBRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/roster")
    public String menu(Model model){
        model.addAttribute("rosterOverview", employeeRepository.readAll());
        return "/roster";
    }

}
