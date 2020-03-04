package jan.stuff.spring.sfgdi.controller;

import jan.stuff.spring.sfgdi.services.HelloServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setHelloService(new HelloServiceImpl());
    }

    @Test
    void testShouldSayGretting() {
        assertEquals("Hello generic World!", controller.sayGretting());
    }
}