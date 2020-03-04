package jan.stuff.spring.sfgdi.controller;

import jan.stuff.spring.sfgdi.services.HelloConstructorInjectedServiceImpl;
import jan.stuff.spring.sfgdi.services.HelloPropertyInjectorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectorControllerTest {

    PropertyInjectorController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectorController();
        controller.greetingService = new HelloPropertyInjectorServiceImpl();
    }

    @Test
    void testGetGreetingShouldReturnHello() {
        assertEquals("Hello Property World!", controller.sayGreeting());
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