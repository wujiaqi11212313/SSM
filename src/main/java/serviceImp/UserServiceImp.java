package serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import service.UserService;
import mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import vo.User;

import java.util.List;

@Component
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;

    public boolean login(User user) {
        List<User> list = userMapper.findUserByName(user.getName());
        User u = list.get(0);
        if (u.getPassword().equals(user.getPassword())){
            return true;
        }else {
            return false;
        }

    }

    public boolean regist(User user) {
        userMapper.insertUser(user);
        return true;
    }

}
