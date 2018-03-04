package service.Impl;

import bean.User;
import dao.UserDao;
import org.springframework.stereotype.Service;
import service.IUserService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private UserDao userDao;
    public Integer addUser(User user) {
        Integer count = userDao.addUser(user);

        return count;
    }


    public User getUser(String id,String username){
        return userDao.getUser(id,username);
    }

    public Integer deleteUser(User user) {
        return userDao.deleteUser(user);
    }

    public Integer updateUser(User user) {
        return userDao.updateUser(user);
    }


    public List<User> getUserAndCard(User user) {
        return userDao.getUserAndCard(user);
    }
}
