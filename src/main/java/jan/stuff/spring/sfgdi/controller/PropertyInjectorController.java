package jan.stuff.spring.sfgdi.controller;

import jan.stuff.spring.sfgdi.services.HelloService;

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
 * @see  jan.stuff.spring.sfgdi.controller.PropertyInjectorControllerTest.class
  */
public class PropertyInjectorController {

    public HelloService greetingService;

    public String sayGreeting() {
        return greetingService.sayHello();
    }
}
