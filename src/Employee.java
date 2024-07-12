
public class Employee {
    private int employeeId;
    private String name;
    private String position;
    private String phoneNumber;

    // Constructors, getters, setters, and other methods
    public Employee(int employeeId, String name, String position, String phoneNumber) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
