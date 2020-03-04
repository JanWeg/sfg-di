package jan.stuff.spring.sfgdi.controller;

import jan.stuff.spring.sfgdi.services.HelloService;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    // no annotation here - it will use the Service marked as @Primary
    private final HelloService greetingService;

    public HelloController(HelloService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {

        return greetingService.sayHello();
    }
}
