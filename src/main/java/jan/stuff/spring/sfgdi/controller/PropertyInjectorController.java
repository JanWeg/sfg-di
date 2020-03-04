package jan.stuff.spring.sfgdi.controller;

import jan.stuff.spring.sfgdi.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/** Simple example for  property based Injection.
 *
 * The property "HelloService" is made public.
 * the Interface method is Implemented elsewhere.
 * When using this PropertyInjectedController the
 * implementation is assigned to the property like:
 *
 * <code>
 *     PropetyInjectorController pic = new PropertyInjectedController();
 *     pic.greetingService = new GreetingServiceImpl();
 *     pic.getGreeting;
 * </code>
 *
 * Details in the test:
 *   jan.stuff.spring.sfgdi.controller.PropertyInjectorController.class
  */
@Controller
public class PropertyInjectorController {

    @Qualifier("helloPropertyInjectorServiceImpl")
    @Autowired
    public HelloService greetingService;

    public String sayGreeting() {
        return greetingService.sayHello();
    }
}
