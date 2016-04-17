package itstep;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

/**
 * @author student
 */
@Transactional
public interface UserDao extends CrudRepository<User, Long>{
    public User findByEmail(String email);
    public User findByName(String name);
    public User findByPassword(String password);
    public User findById(Long id);
}

