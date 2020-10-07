package mikroblod.kinoxp.demo.repository;

import mikroblod.kinoxp.demo.model.Customer;
import mikroblod.kinoxp.demo.model.Movie;

import java.util.List;

public interface ICustomerRepository {

    void create(Customer customer);
    Customer read(int id);
    List<Customer> readAll();
}
