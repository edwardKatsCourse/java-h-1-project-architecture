package com.telran.controller;

import com.telran.model.User;
import com.telran.service.UserSearchService;
import com.telran.service.UserService;

import java.util.Scanner;
import java.util.Set;

public class UserSearchController {

    static UserSearchService userSearchService = new UserSearchService();

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

    public void userSearch() {

        while (true) {
            System.out.println("View by: UserSearchController.java");


            System.out.println("\t\tUSER SEARCH");
            System.out.println("1. All users");
            System.out.println("2. Find by email");
            System.out.println("3. Find by last name");
            System.out.println("4. Back");

            Integer option = new Scanner(System.in).nextInt();

            if (option.equals(1)) {
                Set<User> users = userSearchService.allUsers();
                printAllUsers(users);
            } else if (option.equals(2)) {
                findByEmail();

            } else if (option.equals(3)) {
                findByLastName();

            } else if (option.equals(4)) {
                break;
            }
        }

    }

    private void findByLastName() {
        System.out.println("View by: UserSearchController.java\tfindByLastName");

        before();

        System.out.println("Enter user last name: ");
        String lastName = new Scanner(System.in).nextLine();
        Set<User> userFound = userSearchService.findByLastName(lastName);
        printAllUsers(userFound);

        after();
    }

    private void findByEmail() {
        System.out.println("View by: UserSearchController.java\tfindByEmail");

        before();

        System.out.println("Enter user email: ");
        String email = new Scanner(System.in).nextLine();
        User user = userSearchService.findByEmail(email);

        if (user == null) {
            System.out.printf("No match found for [%s]\n", email);
        } else {
            System.out.println(user.toString());
        }

        after();
    }

    private void printAllUsers(Set<User> users) {
        System.out.println("View by: UserSearchController.java\tprintAllUsers");

        before();

        if (users.isEmpty()) {
            System.out.println("NO USERS FOUND");
        }

        System.out.println("\t\tUSERS IN THE SYSTEM");
        for (User user: users) {
            System.out.println(user.toString());
        }


        after();
    }



}
