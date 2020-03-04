package jan.stuff.spring.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class HelloSetterServiceImpl implements HelloService {

    @Override
    public String sayHello() {

        return "Hello Setter World!";
    }
}
