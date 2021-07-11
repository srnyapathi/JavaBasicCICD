package in.srnyapathi.azurecicd.controller;

import in.srnyapathi.azurecicd.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class Greetings {
    @GetMapping
    public Greeting greet(){
        return new Greeting("Hello World");
    }

}
