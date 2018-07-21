package service;

import org.springframework.stereotype.Service;
import vo.User;

@Service
public interface UserService {
    boolean login(User user);
    boolean regist(User user);
}
