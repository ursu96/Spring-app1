package classes;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.WebEndpoint;
import java.util.logging.Logger;

@RestController
public class Controller {

    static Logger log = Logger.getLogger(MainApp.class.getName());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String afiseaza(){
        String message = "Hello World!";
        log.warning("Mesajul este:" + message);
        return message;

    }
}
