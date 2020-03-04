package jan.stuff.spring.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class HelloPropertyInjectorServiceImpl implements HelloService {

    @Override
    public String sayHello() {

        return "Hello Property World!";
    }
}
