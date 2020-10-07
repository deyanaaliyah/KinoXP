package mikroblod.kinoxp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/roster")
    public String menu(){
        return "/roster";
    }

}
