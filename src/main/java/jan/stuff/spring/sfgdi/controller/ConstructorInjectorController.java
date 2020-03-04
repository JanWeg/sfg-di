package jan.stuff.spring.sfgdi.controller;

import jan.stuff.spring.sfgdi.services.HelloService;

public class ConstructorInjectorController {

    private final HelloService helloService;

    // avoid this guy to be called from outside
    private ConstructorInjectorController() {
        // NOP
        helloService = null;
    }

    public ConstructorInjectorController(HelloService helloService) {
        this.helloService = helloService;
    }


    public String  sayGreeting() {
        return helloService.sayHello();
    }
}
