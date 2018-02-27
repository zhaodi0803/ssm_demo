package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ClientController {
    @RequestMapping(value="/test",method = RequestMethod.GET)
    public String  test(){
        System.out.println("......test..........");
        return "index1.jsp";
    }

}
