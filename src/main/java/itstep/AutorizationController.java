package itstep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author student
 */
@RestController
public class AutorizationController {
    
    @Autowired
    UserDao userDao;
    
    @RequestMapping("/register")
    public Object register (String name, String email, String password){
        String id = "";
        
        User user = new User(name, email, password);
        userDao.save(user);
        id = String.valueOf(user.getId());
        return id; 

    }
    @RequestMapping("/login")
    public String login (String name, String password){
        if (name.equals(userDao.findByPassword(password).getName().toString())) {
            return "Ok";
        }
        else{ return "error";}
    }
}
