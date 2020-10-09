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
                    sqlRowSet.getString("employee_id")
                    )
            );
        }
        return employee;
    }

    @Override
    public Employee read(String employee_id) {
        String sql = "SELECT * FROM employee WHERE employee_id = '" + employee_id + "'";
        sqlRowSet = jdbcTemplate.queryForRowSet(sql);

        while(sqlRowSet.next()){
            return new Employee(sqlRowSet.getString("employee_id"));
        }

        return null;
    }


    /*  hey gutter
        copy+paste det her ind til jeres workbench

        CREATE TABLE `Kino`.`employee` (`employee_id` INT NOT NULL, PRIMARY KEY (`employee_id`));

        INSERT INTO kino.employee (employee_id) VALUES (1127);
        INSERT INTO kino.employee (employee_id) VALUES (4892);
        INSERT INTO kino.employee (employee_id) VALUES (8704);
        INSERT INTO kino.employee (employee_id) VALUES (6890);
        INSERT INTO kino.employee (employee_id) VALUES (2694);
        INSERT INTO kino.employee (employee_id) VALUES (0944);
        INSERT INTO kino.employee (employee_id) VALUES (7642);
        INSERT INTO kino.employee (employee_id) VALUES (0193);
        INSERT INTO kino.employee (employee_id) VALUES (4790);
        INSERT INTO kino.employee (employee_id) VALUES (2880);
     */
}