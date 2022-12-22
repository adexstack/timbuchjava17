package dev.seyistack;

import java.util.ArrayList;

public class MobilePhone {
    private final ArrayList<Contact> contacts = new ArrayList<>();
    //private Contact contactToAdd;

    public void addContact(String name, String phoneNumber){
        Contact contactToAdd = new Contact(name, phoneNumber);
        int contactIndexPosition = checkContactExist(contactToAdd.getName());
        if(contactIndexPosition >= 0){
            modifyContact(contactIndexPosition, contactToAdd);
        } else {
            System.out.println("Adding new contact");
            contacts.add(contactToAdd);
        }
    }

    private void modifyContact(int contactIndexPosition, Contact contactToAdd){
        System.out.println("Updating existing contact for "+contactToAdd.getName());
        contacts.set(contactIndexPosition, contactToAdd);
    }

    public void printContacts(){
        for(Contact item : contacts){
            System.out.println("name : "+item.getName() + " phone Number is "+item.getPhoneNumber());
        }
        System.out.println("-".repeat(30));
    }

    private int checkContactExist(String name){
        for(Contact item : contacts){
            if(item.getName().equals(name)){
                return contacts.indexOf(item);
            }
        }
        return -1;
    }

    public void searchContact(String name){
        for(Contact item : contacts){
            if(item.getName().equals(name)){
                System.out.println("name : "+item.getName() + " phone Number is "+item.getPhoneNumber());
                break;
            }
        }
    }

    public void removeContactIfExist(String name){
        if(checkContactExist(name) >= 0){
            System.out.println("Removing contact for "+name);
            contacts.remove(checkContactExist(name));
        } else {
            System.out.println("Contact does not exist");
        }
    }
}

class Contact{
    private final String name;
    private final String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
