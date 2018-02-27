package testdemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ClientServiceImpl;

public class TestDemo {

    @Test
    public void test1  (){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mvc.xml");
        ClientServiceImpl clientService = (ClientServiceImpl) applicationContext.getBean("client");
        clientService.addClient();
    }
}
