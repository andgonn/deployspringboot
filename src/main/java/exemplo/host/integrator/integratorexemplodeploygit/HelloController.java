package exemplo.host.integrator.integratorexemplodeploygit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "Olá, Mundo! - www.integrator.com.br";
    }
}