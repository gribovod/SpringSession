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
    @RequestMapping("/read")
    public String read(HttpSession httpSession){
        
        return httpSession.getAttribute("hello").toString();
    } 
    @RequestMapping("/write")
    public String write(HttpSession httpSession, String message){
      httpSession.setAttribute("hello", message);
      return message; 
    }
    @RequestMapping("/wr")
    public String wr(HttpSession httpSession, String message, String attribute){
      httpSession.setAttribute(attribute, message);
      return message; 
    }
    @RequestMapping("/rd")
    public String rd(HttpSession httpSession, String attribute){
        return httpSession.getAttribute(attribute).toString();
    }
}
