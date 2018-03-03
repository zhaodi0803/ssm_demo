package service;

import bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserService {

    void addUser(User user);

    User getUser();
}
