package jan.stuff.spring.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class HelloPrimaryServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "Hello - from the Primary Hello Service!";
    }
}
