package jan.stuff.spring.sfgdi.controller;

import jan.stuff.spring.sfgdi.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectorController {

    // not nessesary @Autowired
    private final HelloService helloService;

    // avoid this guy to be called from outside
    /* private ConstructorInjectorController() {
        // NOP
        helloService = null;
    }*/

    public ConstructorInjectorController(@Qualifier("helloConstructorInjectedServiceImpl") HelloService helloService) {
        this.helloService = helloService;
    }


    public String  sayGreeting() {
        return helloService.sayHello();
    }
}
