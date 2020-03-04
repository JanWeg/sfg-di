package jan.stuff.spring.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class HelloConstructorInjectedServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "Hello Constructor World!";
    }
}
