public class Department {

    private int id;
    private String name;
    private Employee [] employees;
    private int employeeCount;
    // add your code here
    private static double salaryCount = 0;
    // there can be at most 20 departments  

    // you are not allowed to write any other constructor
    public Department(int id, String name) {
        this.id = id;
        this.name = name;
        this.employees = new Employee[10];
        // add your code here
        employeeCount = 0;
    }

    // add your code here
    public void addEmployee(Employee e) {
        employees[employeeCount] = e;
        ++employeeCount;
        salaryCount += e.getSalary();
    }

    public double getDepartmentSalary() {
        double ret = 0;
        for(int i=0; i<employeeCount; ++i) {
            ret += employees[i].getSalary();
        }
        return ret;
    }

    public Employee getMaxSalaryEmployee() {
        // This happens when there's no employee
        if(employeeCount == 0) return new Employee(1, "Bleh", 1000);

        Employee sample = employees[0];
        for(int i=0; i<employeeCount; ++i) {
            if(employees[i].getSalary() > sample.getSalary()) {
                sample = employees[i];
            }
        }
        return sample;
    }

    public static double getTotalSalary() {
        return salaryCount;
    }
}
