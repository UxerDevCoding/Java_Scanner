package com.omar;

import java.util.Scanner;

public final class App {
   
    public static void main(String[] args) {

        Scanner init = new Scanner(System.in);

        System.out.println("What is yout name?");
        String userName= init.nextLine();
        System.out.println("How old are you?");
        int userAge=init.nextInt();

        if (userAge >= 18) {
            System.out.println("Welcome " + userName + ", you have " + userAge + " years, you can pass");
        } else {
            System.out.println("Welcome " + userName + ", you have " + userAge + " years, you cannot pass");
        }
        
        init.close();
    }
}
