package controller;

import bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.IUserService;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private IUserService iUserService;
    @ResponseBody
    @RequestMapping(value = "/addUser",method = RequestMethod.GET)
    public String addUser(){
        System.out.println("addUser........");

        User user = new User();
        System.out.println(iUserService.getUser());
        return "添加成功";
    }
}
