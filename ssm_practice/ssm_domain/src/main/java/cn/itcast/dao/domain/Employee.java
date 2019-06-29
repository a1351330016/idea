package cn.itcast.dao.domain;

public class Employee {

 private Integer id;
 private String EmployeeName;
 private Integer DeptId;
 private String telephone;
 private Double Salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public Integer getDeptId() {
        return DeptId;
    }

    public void setDeptId(Integer deptId) {
        DeptId = deptId;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", DeptId=" + DeptId +
                ", telephone='" + telephone + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
