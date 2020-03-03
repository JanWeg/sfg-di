package jan.stuff.spring.sfgdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    public String sayHello() {
        String reply = "Hello World!";

        System.out.printf("Bean: %s\n", "Hey Folx!");

        return reply;
    }
}
