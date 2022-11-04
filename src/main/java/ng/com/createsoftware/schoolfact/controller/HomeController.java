package ng.com.createsoftware.schoolfact.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/welcome")
    public String welcome(){

       return "My Spring boot Azure Deployment is Successful";
    }
}
