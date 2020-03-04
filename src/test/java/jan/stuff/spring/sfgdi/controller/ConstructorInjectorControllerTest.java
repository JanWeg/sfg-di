package jan.stuff.spring.sfgdi.controller;

import jan.stuff.spring.sfgdi.services.HelloServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectorControllerTest {

    ConstructorInjectorController controller;

    @BeforeEach
    public void setUp() {
        controller = new ConstructorInjectorController(new HelloServiceImpl());
    }

    @Test
    public  void shouldReturnGenericHello() {
        assertEquals("Hello generic World!", controller.sayGreeting());
    }



}