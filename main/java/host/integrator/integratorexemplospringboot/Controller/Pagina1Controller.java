package host.integrator.integratorexemplospringboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pagina1Controller {

    @GetMapping("/pagina1")
    public String pagina1() {
        return "Spring Boot - Pagina 1";
    }



}
