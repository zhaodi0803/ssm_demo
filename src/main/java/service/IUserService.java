package service;

import bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserService {

    Integer addUser(User user);

    User getUser(String id,String username);

    Integer updateUser(User user);

    Integer deleteUser(User user);



    List<User> getUserAndCard(User user);
}
