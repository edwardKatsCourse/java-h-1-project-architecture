package com.telran;

import com.telran.controller.UserController;
import com.telran.controller.UserSearchController;
import com.telran.model.User;

import java.util.*;

public class Main {


    static UserController userController = new UserController();
    static UserSearchController userSearchController = new UserSearchController();


    //separation of concerns
    public static void main(String[] args) {
        //1. User
        //2. Search
        //3. Exit

        while (true) {

            System.out.println("View by: Main.java");
            System.out.println("1. Users operations: add, update and delete");
            System.out.println("2. User search ");
            System.out.println("3. Exit");
            Integer option = new Scanner(System.in).nextInt();

            if (option.equals(1)) {
                userController.user();

            } else if (option.equals(2)) {
                userSearchController.userSearch();

            } else if (option.equals(3)) {
                exit();
                break;

            }
        }
    }

    private static void exit() {
        System.out.println("Goodbye");
    }



}
