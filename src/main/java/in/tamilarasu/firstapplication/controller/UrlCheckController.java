package in.tamilarasu.firstapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlCheckController {

    @GetMapping("/api/check")
    public String checkApi(){
        return "Test Successful";
    }
    
}
