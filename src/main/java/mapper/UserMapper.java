package mapper;

import vo.User;

import java.util.List;

public interface UserMapper {
    public User findUserById(int id);
    public List<User> findUserByName(String name);
}
