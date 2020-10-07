package mikroblod.kinoxp.demo.repository;

import mikroblod.kinoxp.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class EmployeeDBRepository implements IEmployeeRepository{


        @Autowired
        JdbcTemplate jdbcTemplate;
        SqlRowSet sqlRowSet;


    @Override
    public List<Employee> readAll() {
        List<Employee> employee = new ArrayList<>();

        String sql = "SELECT * FROM employee";
        sqlRowSet = jdbcTemplate.queryForRowSet(sql);

        while(sqlRowSet.next()){
            employee.add(new Employee(
                    sqlRowSet.getInt("employeeID"),
                    sqlRowSet.getString("fname"),
                    sqlRowSet.getString("lname")

            ));
        }
        return employee;
    }
}
