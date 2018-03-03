package dao;

import bean.User;

public interface UserDao {

    public Integer addUser(User user);

    public User getUser();
}
