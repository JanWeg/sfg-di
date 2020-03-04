package jan.stuff.spring.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "Hello generic World!";
    }
}
