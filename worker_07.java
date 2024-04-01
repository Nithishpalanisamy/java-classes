// Worker.java
abstract class Worker {
    protected String name;
    protected double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public abstract double compPay(int hours);
}

// DailyWorker.java
class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double compPay(int hours) {
        return salaryRate * (hours / 8); // Assuming 8 hours per day
    }
}

// SalariedWorker.java
class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double compPay(int hours) {
        return salaryRate * 40; // Fixed 40 hours per week
    }
}

// worker_07.java
public class worker_07 {
    public static void main(String[] args) {
        Worker[] workers = new Worker[2];
        workers[0] = new DailyWorker("John Doe", 10); // $10 per hour
        workers[1] = new SalariedWorker("Jane Doe", 10); // $10 per hour

        int hoursWorked = 45; // Example hours worked in a week

        for (Worker worker : workers) {
            System.out.println(worker.name + " earns $" + worker.compPay(hoursWorked) + " for " + hoursWorked + " hours of work.");
        }
    }
}
