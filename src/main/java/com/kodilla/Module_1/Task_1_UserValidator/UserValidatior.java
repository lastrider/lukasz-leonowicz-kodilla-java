package com.kodilla.Module_1.Task_1_UserValidator;
class Application {

    public static void main(String[] args) {

        String name = "Adam";
        double age = 40.5;
        double height = 178;

        UserValidatior userValidatior = new UserValidatior();
        if (userValidatior.nameIsNotNull(name))
            userValidatior.userValidateAgeAndHeight(age, height);

    }

}

public class UserValidatior {

    public void userValidateAgeAndHeight(double age, double height) {
        if (age > 30 && height > 160) {
            System.out.println("User is older than 30 and higher then 160cm");
        } else {
            System.out.println("User is younger than 30 or lower than 160cm");
        }
    }

    public boolean nameIsNotNull(String name) {
        if (name != null) {
            return true;
        } else {
            return false;
        }

    }
}