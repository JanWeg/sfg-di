package jan.stuff.spring.sfgdi.controller;

import jan.stuff.spring.sfgdi.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    @Qualifier("helloSetterServiceImpl")
    @Autowired
    private HelloService helloService;

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public String  sayGretting() {
        return helloService.sayHello();
    }
}
