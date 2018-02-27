package service;

import com.sun.org.apache.xpath.internal.SourceTree;
import dao.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value="client")
public class ClientServiceImpl {
    @Resource(name="clientDao1")
    private ClientDao clientDao;
    public void addClient(){
        clientDao.addClient();
        System.out.println("add client service.......");
    }
}
