package controller;

import bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.IUserService;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private IUserService iUserService;
    @ResponseBody
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public User getUser( String id,  User user){
        System.out.println("getUser........");



        return iUserService.getUser(id,user.getUsername());
    }


    @ResponseBody
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public Integer addUser(User user){
        return iUserService.addUser(user);
    }


    @ResponseBody
    @RequestMapping(value = "/updateUser",method = RequestMethod.PUT)
    public Integer updateUser(User user){
        return iUserService.updateUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteUser",method = RequestMethod.DELETE)
    public Integer deleteUser(User user){
        return iUserService.deleteUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/getUserCard",method = RequestMethod.GET)
    public List<User> getUserCard(User user){
        return iUserService.getUserAndCard(user);
    }
}
