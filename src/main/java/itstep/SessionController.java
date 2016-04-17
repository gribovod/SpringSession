package itstep;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author Vadim
 */
@RestController
public class SessionController {
    
    @RequestMapping("/session")
    public String showSession(HttpSession httpSession){
        return httpSession.getId();
    }
   
}
