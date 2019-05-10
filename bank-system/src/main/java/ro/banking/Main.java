package ro.banking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        AccountAssistant accountAssistant = new AccountAssistant();

        List<String> clients = new ArrayList<String>();
        clients.add(0, "Andrei");

        char option = '\0';

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + clients.get(0));
        System.out.println("\n");
        System.out.println("1. Acordare credit");
        System.out.println("2. Deposit in economii");
        System.out.println("3. Plata credit");
        System.out.println("4. Exit");

        do {
            System.out.println("Enter your option: ");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case '1':
                    System.out.println("Cerere credit");
                    int amount = scanner.nextInt();
                    accountAssistant.acordareCredit(amount);
                    System.out.println("\n");
                    break;
                case '2':
                    System.out.println("Enter the amount to deposit: ");
                    int amount2 = scanner.nextInt();
                    accountAssistant.plataCredit(amount2);
                    accountAssistant.plataDatorie(amount2);
                    System.out.println("\n");
                    break;
                case '3':
                    System.out.println("Enter the amount to withdraw: ");
                    int amount3 = scanner.nextInt();
                    accountAssistant.retragereEconomii(amount3);
                    System.out.println("\n");
                    break;
                case '4':
                    System.out.println("=================================");

                default:
                    System.out.println("Invalid option!!! Try again!");
                    break;
            }
        }
        while (option != '4');
        System.out.println("You are signed out!");
    }
}

