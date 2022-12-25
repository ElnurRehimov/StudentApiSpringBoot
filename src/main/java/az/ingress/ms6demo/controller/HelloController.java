package az.ingress.ms6demo.controller;

import az.ingress.ms6demo.dto.Car;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class HelloController {

//    @GetMapping("/elnur")
//    public String sayHello(@RequestParam("name") String firstname,@RequestParam("lname") String lastname){ (1)(2)
//        return "Hello REST "+ firstname+" "+lastname;
//    }

//    @PostMapping("/elnur")
//    public String sayHelloWithBody(@RequestBody String body){ (1)
//        if(Integer.parseInt(body)>18)
//            return "Hello REST "+ body;
//        else
//            return "You are not allowed here";
//    }

//    @PostMapping("/elnur")
//    public String sayHelloWithBody(@RequestBody Car body){ //postmandan json obyekti ile sorgu post (2)
//
//            return "You are not allowed here "+body;
//    }

    private Car car=null;

    @GetMapping("/elnur")
    public Car sayHello(){
        return car;
    }

    @PostMapping("/elnur")
    public Car sayHelloWithBody(@Valid @RequestBody Car body,@RequestHeader("course") String course){ //postmandan json obyekti ile sorgu post
        this.car=body;
        System.out.println("The header course "+course);
        return body;
    }

}
