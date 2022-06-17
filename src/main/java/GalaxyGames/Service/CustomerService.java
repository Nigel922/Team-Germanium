package GalaxyGames.Service;

import GalaxyGames.Model.Customer;
import GalaxyGames.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {

    CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo userRepo){
        this.customerRepo = userRepo;
    }

    public Customer getCustomerById(int id){
        return customerRepo.findCustomerById(id);
    }

}
