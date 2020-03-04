package jan.stuff.spring.sfgdi.controller;

import jan.stuff.spring.sfgdi.services.HelloConstructorInjectedServiceImpl;
import jan.stuff.spring.sfgdi.services.HelloSetterServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    private SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setHelloService(new HelloSetterServiceImpl());
    }

    @Test
    void testShouldSayGretting() {
        assertEquals("Hello Setter World!", controller.sayGretting());
    }
}