package service.Impl;

import bean.User;
import dao.UserDao;
import org.springframework.stereotype.Service;
import service.IUserService;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private UserDao userDao;
    public void addUser(User user) {

    }


    public User getUser(){
        return userDao.getUser();
    }
}
