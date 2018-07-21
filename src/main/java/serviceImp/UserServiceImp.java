package serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import service.UserService;
import mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import vo.User;

@Component
@Service
public class UserServiceImp implements UserService {
    private ApplicationContext ac ;
    @Autowired
    private UserMapper userMapper;

    public boolean login(User user) {
        return false;
    }

    public boolean regist(User user) {
        userMapper.insertUser(user);
        return true;
    }

}
