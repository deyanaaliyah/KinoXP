package mikroblod.kinoxp.demo.repository;

import mikroblod.kinoxp.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerDBRepository implements ICustomerRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;
    SqlRowSet sqlRowSet;

    @Override
    public void create(Customer customer){
        String sql = "INSERT INTO " +
                "Customers(customer_id, customer_fName, customer_lName, customer_birthday, customer_phoneNumber,customer_email) " +
                "VALUES(?,?,?,?,?,?)";
        jdbcTemplate.update(sql,
                customer.getId(),customer.getfName(),
                customer.getlName(),customer.getBirthday(),
                customer.getPhoneNumber(),customer.getEmail());

    }

    @Override
    public Customer read(int id) {
        return null;
    }

    @Override
    public List<Customer> readAll() {
        List<Customer> customers = new ArrayList<>();

        String sql = "SELECT * FROM Customers";
        sqlRowSet = jdbcTemplate.queryForRowSet(sql);

        while (sqlRowSet.next()){
            customers.add(new Customer(
                    sqlRowSet.getInt("customer_id"),
                    sqlRowSet.getString("customer_fName"),
                    sqlRowSet.getString("customer_lName"),
                    sqlRowSet.getString("customer_birthday"),
                    sqlRowSet.getInt("customer_phoneNumber"),
                    sqlRowSet.getString("customer_email"))
            );
        }

        return customers;
    }
}
