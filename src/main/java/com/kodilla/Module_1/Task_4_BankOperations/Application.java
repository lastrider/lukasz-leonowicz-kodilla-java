package com.kodilla.Module_1.Task_4_BankOperations;

abstract class BankOperations {

    abstract protected void askForCard();

    abstract protected void askForPin();

    abstract protected void askForWithdrawalAmount();

    protected void confirmRequestDelivery() {
        System.out.println("Request delivered");
    }

    protected void checkAccountBalance() {
        System.out.println("We are checking your balance");
    }

    protected void confirmWithdrawal() {
        System.out.println("Account checked");
    }

    abstract protected void withdrawCash();

    abstract protected void thanks();

    public void run(){
        this.askForCard();
        this.askForPin();
        this.askForWithdrawalAmount();
        this.confirmRequestDelivery();
        this.checkAccountBalance();
        this.confirmWithdrawal();
        this.withdrawCash();
        this.thanks();
    }
}

class ATMOperations extends BankOperations {

    public void askForCard(){
        System.out.println("Please, insert card to the ATM");
    }

    public void askForPin(){
        System.out.println("Please, type your pin");
    }

    public void askForWithdrawalAmount() {
        System.out.println("Please, type demanded withdrawal amount of cash");
    }

    public void withdrawCash(){
        System.out.println("Cash is on its way");
    }

    public void thanks(){
        System.out.println("Thank you for using our services");
    }


}

public class Application{
    public static void main(String[] args) {

        ATMOperations atmOperations = new ATMOperations();
        atmOperations.run();
    }
}