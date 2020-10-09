package mikroblod.kinoxp.demo.controller;

import mikroblod.kinoxp.demo.model.Employee;
import mikroblod.kinoxp.demo.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class EmployeeController {

    @Autowired
    IEmployeeRepository employeeRepository;
    /*public EmployeeController(IEmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }*/
    @GetMapping("/menu")
    public String login(HttpSession httpSession){

        if(httpSession.getAttribute("isLogIn") != null){
            return "menu";
        }
        return "sign-in";
    }

    @PostMapping("/menu")
    public String login(@ModelAttribute Employee employee, Model model, HttpSession httpSession){
        // check if credentials is in the arraylist
        Employee em = employeeRepository.read(employee.getEmployee_id());
        if (em != null){
            httpSession.setAttribute("isLogIn", "yes");

            model.addAttribute("employee", employeeRepository.readAll());
            return "menu";
        }

        return "sign-in";
    }
}