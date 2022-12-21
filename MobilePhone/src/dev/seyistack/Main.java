package dev.seyistack;

import java.util.ArrayList;

public class Main {

    private static MobilePhone mbf = new MobilePhone();

    public static void main(String[] args) {
        Contact contact1 = new Contact("seyi", "075");
        mbf.addContact(contact1);
        mbf.printContacts();
        Contact contact2 = new Contact("seyi", "075");
        mbf.addContact(contact2);
        mbf.printContacts();
        Contact contact3 = new Contact("sayo", "999");
        mbf.addContact(contact3);
        mbf.printContacts();
    }

}
