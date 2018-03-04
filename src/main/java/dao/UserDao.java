package dao;

import bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    public Integer addUser(User user);

    public User getUser(@Param("id") String id,@Param("username") String username);


    public Integer updateUser(User user);

    public Integer deleteUser(User user);

    public List<User> getUserAndCard(User uesr);
}
