// Employee.java
class Employee {
    protected String empName;
    protected int empId;
    protected String address;
    protected String mailId;
    protected String mobileNo;

    public Employee(String empName, int empId, String address, String mailId, String mobileNo) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
    }
}

// EmployeeWithPay.java
class EmployeeWithPay extends Employee {
    protected double basicPay;
    protected double da;
    protected double hra;
    protected double pf;
    protected double staffClubFund;

    public EmployeeWithPay(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
        this.da = 0.097 * basicPay;
        this.hra = 0.10 * basicPay;
        this.pf = 0.12 * basicPay;
        this.staffClubFund = 0.001 * basicPay;
    }

    public double grossSalary() {
        return basicPay + da + hra;
    }

    public double netSalary() {
        return grossSalary() - pf - staffClubFund;
    }

    public void printPaySlip() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Gross Salary: " + grossSalary());
        System.out.println("Net Salary: " + netSalary());
    }
}

// Programmer.java
 class Programmer extends EmployeeWithPay {
    public Programmer(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// AssistantProfessor.java
class AssistantProfessor extends EmployeeWithPay {
    public AssistantProfessor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// AssociateProfessor.java
class AssociateProfessor extends EmployeeWithPay {
    public AssociateProfessor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// Professor.java
class Professor extends EmployeeWithPay {
    public Professor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// employee.java
public class employee_07 {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("John Doe", 1, "123 Street, City", "john.doe@example.com", "1234567890", 50000);
        programmer.printPaySlip();

        AssistantProfessor assistantProfessor = new AssistantProfessor("Jane Doe", 2, "456 Avenue, City", "jane.doe@example.com", "0987654321", 60000);
        assistantProfessor.printPaySlip();

        AssociateProfessor associateProfessor = new AssociateProfessor("Alice", 3, "789 Boulevard, City", "alice@example.com", "1122334455", 70000);
        associateProfessor.printPaySlip();

        Professor professor = new Professor("Bob", 4, "321 Drive, City", "bob@example.com", "5566778899", 80000);
        professor.printPaySlip();
    }
}
