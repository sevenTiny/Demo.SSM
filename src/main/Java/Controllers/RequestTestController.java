package Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/RequestTest")
public class RequestTestController {

    @GetMapping()
    public String TestString(){
        return "this is a test string. Time:2017-10-29 20:42:00";
    }
}
