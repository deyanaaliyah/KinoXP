package mikroblod.kinoxp.demo.model;

import mikroblod.kinoxp.demo.model.Person;

public class Employee extends Person {

    private int employeeID;
    private String fname;
    private String lname;

    public Employee(int employeeID, String fname, String lname) {
        this.employeeID = employeeID;
        this.fname = fname;
        this.lname = lname;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
