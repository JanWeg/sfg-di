package jan.stuff.spring.sfgdi;

import jan.stuff.spring.sfgdi.controller.ConstructorInjectorController;
import jan.stuff.spring.sfgdi.controller.HelloController;
import jan.stuff.spring.sfgdi.controller.PropertyInjectorController;
import jan.stuff.spring.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);


		String greeting = runSimpleService(ctx);
		System.out.println("Main: Base: " + greeting);


		greeting = getPropertyInjectedGreeting(ctx);
		System.out.println("Main: PptyInjC: " + greeting);


		greeting = getSetterInjectedString(ctx);
		System.out.println("Main: SetInjC: " + greeting);


		greeting = getCtorInjectedString(ctx);
		System.out.println("Main: CtorInjC" + greeting);


	}


	private static String  runSimpleService(ApplicationContext ctx) {
		HelloController helloController = (HelloController) ctx.getBean("helloController");
		String greeting = helloController.sayHello();

		return greeting;
	}


	private static String getPropertyInjectedGreeting(ApplicationContext ctx) {
		String greeting;
		PropertyInjectorController propertyInjectorController = (PropertyInjectorController) ctx.getBean("propertyInjectorController");
		greeting = propertyInjectorController.sayGreeting();
		return greeting;
	}

	private static String getSetterInjectedString(ApplicationContext ctx) {
		SetterInjectedController setterInjector = (SetterInjectedController) ctx.getBean("setterInjectedController");
		return setterInjector.sayGretting();
	}

	private static String getCtorInjectedString(ApplicationContext ctx) {
		ConstructorInjectorController constructorInjectorController
				= (ConstructorInjectorController) ctx.getBean("constructorInjectorController");
		return constructorInjectorController.sayGreeting();
	}


}
