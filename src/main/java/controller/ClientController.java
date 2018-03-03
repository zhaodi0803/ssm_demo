package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@Controller
public class ClientController {

    @RequestMapping("/clients/{id}")
    @ResponseBody
    public String  getClients(@PathVariable String id,
                              HttpServletRequest request, HttpServletResponse response){

        System.out.println("进入client获取。。。。。");
        System.out.println(id);
        String uuid=UUID.randomUUID().toString();
        System.out.println(uuid);
        return "get clients。。。。。。";
    }
  /*  @PutMapping("/clients")
    public String updateClients(){
        System.out.println("修改clients。。。。。。");
        return "update successfully";
    }*/

}
