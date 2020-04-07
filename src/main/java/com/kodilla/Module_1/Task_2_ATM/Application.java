package com.kodilla.Module_1.Task_2_ATM;
interface ATMOperations {
    double cashWithdraw(double foundsBalance, double amount);

    double cashPayment(double foundsBalance, double amount);

    default void callToBank() {
        System.out.println("CallToBank");
    }

    static String endOperation() {
        return "Operation has been done";
    }
}

class ATMmpl implements ATMOperations {

    public double cashWithdraw(double foundsBalance, double amount) {
        System.out.println("Cash paid in: " + amount);
        return (foundsBalance - amount);
    }

    public double cashPayment(double foundsBalance, double amount) {
        System.out.println("Cash withdraw: " + amount);
        return (foundsBalance + amount);
    }
}


public class Application {

    public static void main(String[] args) {
        double accountBalance = 10800.92;
        double withdrawal = 200;
        double paymentIn = 2000;

        ATMmpl atMmpl = new ATMmpl();

        accountBalance = atMmpl.cashPayment(accountBalance, paymentIn);
        accountBalance = atMmpl.cashWithdraw(accountBalance, withdrawal);
        System.out.println(ATMOperations.endOperation());
        atMmpl.callToBank();
    }
}