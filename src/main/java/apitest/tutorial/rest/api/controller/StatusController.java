package apitest.tutorial.rest.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StatusController {
    @GetMapping(path = "/api/config")
    public String check(){
        return "legal";
    }
}
