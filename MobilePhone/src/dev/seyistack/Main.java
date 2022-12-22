package dev.seyistack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static MobilePhone mbf = new MobilePhone();

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
 /*       String name1 = "seyi";
        String phoneNumber1 = "075";
        mbf.addContact(name1, phoneNumber1);
        mbf.printContacts();
        String name2 = "seyi";
        String phoneNumber2 = "442";
        mbf.addContact(name2, phoneNumber2);
        mbf.printContacts();
        String name3 = "sayo";
        String phoneNumber3 = "999";
        mbf.addContact(name3, phoneNumber3);
        mbf.printContacts();
        mbf.removeContactIfExist("dan");
        mbf.printContacts();
        mbf.removeContactIfExist("seyi");
        mbf.printContacts();
        mbf.searchContact("dan");
        mbf.searchContact("sayo");
*/
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
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
        System.out.print("Please enter the contact to add: ");
        String name = scanner.nextLine();
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
