public class Application {
    private String company;
    private  String role;
    private String location;
    private int salary;
    private String status;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Company: " + company +
                ", Role: " + role +
                ", Location: " + location +
                ", Salary: " + salary +
                ", Status: " + status;
    }
    public Application(String company, String role, String location, int salary, String status) {
        this.company = company;
        this.role = role;
        this.location = location;
        this.salary = salary;
        this.status = status;
    }
}
