package mikroblod.kinoxp.demo.model;

public class Employee extends Person {

    private String employee_id;
    //private String fname;
    //private String lname;

    public Employee(){
    }

    public Employee(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }
}
