package classes;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.WebEndpoint;

@RestController
public class Controller {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String afiseaza(){
        return "Hello World!";
    }

}
