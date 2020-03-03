package jan.stuff.spring.sfgdi;

import jan.stuff.spring.sfgdi.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		HelloController helloController = (HelloController) ctx.getBean("helloController");
		String greeting = helloController.sayHello();

		System.out.println("Main: " + greeting);
	}

}
