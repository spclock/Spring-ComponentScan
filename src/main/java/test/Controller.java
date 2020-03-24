package test;

import org.springframework.web.bind.annotation.*;
@RestController
public class Controller {

    @RequestMapping("/")
    public String index() {
        return "hello!";
    }



}
