package com.telran.controller;

import com.telran.model.User;
import com.telran.service.UserService;

import java.util.Scanner;

//РИСУЕТ и передает в service
public class UserController {

    private static UserService userService = new UserService();

    public static void before() {
        System.out.println();
        System.out.println();

        System.out.println("--------------------------------");
    }

    public static void after() {
        System.out.println();
        System.out.println();
        System.out.println("--------------- Powered by Tel-Ran, Haifa 1 -----------------");
    }

    public void user() {
        while (true) {
            System.out.println("View by: UserController.java");


            System.out.println("1. Add user");
            System.out.println("2. Update user (NOT IMPLEMENTED)");
            System.out.println("3. Delete user (NOT IMPLEMENTED)");
            System.out.println("4. Back");

            Integer option = new Scanner(System.in).nextInt();

            if (option.equals(1)) {
                addUser();
            } else if (option.equals(4)) {
                break;
            } else if (option.equals(2) || option.equals(3)) {
                System.out.println("Sorry, functionality is not supported yet!");
            }


        }

    }


    private static void addUser() {

        while (true) {
            System.out.println("View by: UserController.java\taddUser");

            before();

            System.out.println("First name:");
            String firstName = new Scanner(System.in).nextLine();

            System.out.println("Last name:");
            String lastName = new Scanner(System.in).nextLine();

            System.out.println("Email:");
            String email = new Scanner(System.in).nextLine();

            System.out.println("Age:");
            Integer age = new Scanner(System.in).nextInt();

            System.out.println("City:");
            String city = new Scanner(System.in).nextLine();

            System.out.println();
            System.out.println();
            User user = new User(firstName, lastName, email, age, city);

            boolean isAdded = userService.addUser(user);
            if (isAdded) {
                //todo necessary to ask user if continue or quit
                break;
            } else {
                System.out.println("\tUSER WITH SUCH EMAIL ALREADY EXISTS");
            }

            after();
        }
    }


}
