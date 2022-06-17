package GalaxyGames.Repository;

import GalaxyGames.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

@Component
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

    @Query("FROM Customer where customer_ID = :customer_ID")
    public Customer findCustomerById(@Param("customer_ID") int id);



}
