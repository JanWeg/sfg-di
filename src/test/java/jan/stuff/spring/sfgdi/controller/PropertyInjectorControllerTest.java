package jan.stuff.spring.sfgdi.controller;

import jan.stuff.spring.sfgdi.services.HelloService;
import jan.stuff.spring.sfgdi.services.HelloServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectorControllerTest {

    PropertyInjectorController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectorController();
        controller.greetingService = new HelloServiceImpl();
    }

    @Test
    void testGetGreetingShouldReturnHello() {
        assertEquals("Hello generic World!", controller.sayGreeting());
    }

    @Test
    void testSomethingPossiblyGoesWrongWithNPE() {

        // When you forget, to initialize the property:
        controller.greetingService = null;

        try {
            controller.sayGreeting();
            fail("Exception expected!");
        } catch (Exception npex) {
            assertTrue( npex instanceof NullPointerException);
            assertNull(npex.getMessage()); // <- typical npe
        };
    }
}