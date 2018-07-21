import mapper.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vo.User;

import java.util.List;

public class Test01 {
    private ApplicationContext applicationContext;

    @Before
    public void setUp(){
        applicationContext = new ClassPathXmlApplicationContext("classpath:WEB-INF/applicationContext.xml");
    }

    @Test
    public void findUserById(){
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User user = userMapper.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void findUserByName(){
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        List<User> list = userMapper.findUserByName("t");
        for (User user:list){
            System.out.println(user.getName());
        }
    }

    @Test
    public void insertUser(){
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User user = new User();
        user.setName("tt");
        user.setPassword("123");
        userMapper.insertUser(user);
    }


}
