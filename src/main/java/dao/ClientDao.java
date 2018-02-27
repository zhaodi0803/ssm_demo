package dao;

import org.springframework.stereotype.Repository;

@Repository(value="clientDao1")
public class ClientDao {
    public void addClient(){
        System.out.println("add new client dao........");
    }
}
