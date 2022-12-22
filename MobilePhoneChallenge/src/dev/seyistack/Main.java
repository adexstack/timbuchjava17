package dev.seyistack;

import java.util.InputMismatchException;
import java.util.Scanner;

// checkout readme
public class Main {

    private static final MobilePhone mbf = new MobilePhone();

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        boolean quit = false;
        int choice;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            try{choice = scanner.nextInt();
            } catch(InputMismatchException e){
                System.out.println("Please input a digit matching the operation you want");
                choice = 0;
            }
            scanner.nextLine();

            switch (choice) {
                case 0 -> printInstructions();
                case 1 -> mbf.printContacts();
                case 2 -> addContact();
                case 3 -> removeContact();
                case 4 -> searchContact();
                case 5 -> quit = true;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact to the contact list.");
        System.out.println("\t 3 - To remove an item from the list.");
        System.out.println("\t 4 - To search for an item in the list.");
        System.out.println("\t 5 - To quit the application.");
    }

    public static void addContact() {
        System.out.print("Please enter name to add: ");
        String name = scanner.nextLine();
        System.out.print("Please enter phoneNumber to add: ");
        String phoneNumber = scanner.nextLine();
        mbf.addContact(name, phoneNumber);
    }

    public static void searchContact() {
        System.out.print("Enter contact name to search: ");
        String contactName = scanner.nextLine();
        mbf.searchContact(contactName);
    }

    public static void removeContact() {
        System.out.print("Enter contact name to remove: ");
        String contactName = scanner.nextLine();
        mbf.removeContactIfExist(contactName);
    }

}
