package com.kodilla.Module_1.Task_5_Employee;

interface Employee {

    double calculateSalary();

}

class FixedSalaryEmployee implements Employee {

    private double salary;

    public FixedSalaryEmployee(double salary) {
        this.salary = salary;
    }

    public double calculateSalary() {
        return this.salary;
    }

}

class HourlySalaryEmployee implements Employee {

    private double hours;
    private double hourlyPay;

    public HourlySalaryEmployee(double hours, double hourlyPay) {
        this.hours = hours;
        this.hourlyPay = hourlyPay;
    }

    public double calculateSalary() {
        return this.hourlyPay * this.hours;
    }

}

class MarginSalaryEmployee implements Employee {

    int itemsCreated;

    public MarginSalaryEmployee(int itemsCreated) {
        this.itemsCreated = itemsCreated;
    }

    public double calculateSalary() {
        return this.itemsCreated * 5.0;
    }

}


class SemiMarginSalaryEmployee implements Employee {

    boolean condition;
    double salary = 2000.0;

    public SemiMarginSalaryEmployee(boolean condition) {
        this.condition = condition;
    }

    public double calculateSalary() {
        if (condition) {
            return salary * 1.2;
        } else {
            return salary;
        }

    }
}


// Payout
abstract class SalaryPayout {

    private Employee employee;

    public SalaryPayout(Employee employee) {
        this.employee = employee;
    }

    protected abstract void payout();

    public void processPayout() {
        System.out.println("Creating payout for: " + this.employee.calculateSalary() + " PLN");
        this.payout();
        System.out.println("Payout has been completed!");
    }

}

class SalaryPayoutProcessor extends SalaryPayout {

    public SalaryPayoutProcessor(Employee employee) {
        super(employee);
    }

    protected void payout() {
        System.out.println("Sending money to employee");
    }

}

public class Application {

    public static void main(String args[]) {

        FixedSalaryEmployee employee = new FixedSalaryEmployee(2000);
        HourlySalaryEmployee employee1 = new HourlySalaryEmployee(40, 19);
        SemiMarginSalaryEmployee employee2 = new SemiMarginSalaryEmployee(true);
        MarginSalaryEmployee employee3 = new MarginSalaryEmployee(100);

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee1);
        processor.processPayout();

        SalaryPayoutProcessor processor1 = new SalaryPayoutProcessor(employee2);
        processor1.processPayout();

        SalaryPayoutProcessor processor2 = new SalaryPayoutProcessor(employee3);
        processor2.processPayout();

    }

}