package dev.seyistack;

import java.util.ArrayList;

public class MobilePhone {
    private final ArrayList<Contact> contacts = new ArrayList<>();
    //private Contact contactToAdd;

    public void addContact(String name, String phoneNumber){
        Contact contactToAdd = new Contact(name, phoneNumber);
        int contactIndexPosition = checkContactExist(contactToAdd.name());
        if(contactIndexPosition >= 0){
            modifyContact(contactIndexPosition, contactToAdd);
        } else {
            System.out.println("Adding new contact");
            contacts.add(contactToAdd);
        }
    }

    private void modifyContact(int contactIndexPosition, Contact contactToAdd){
        System.out.println("Updating existing contact for "+contactToAdd.name());
        contacts.set(contactIndexPosition, contactToAdd);
    }

    public void printContacts(){
        for(Contact item : contacts){
            System.out.println("Nameame:"+item.name() + " Phone Number:"+item.phoneNumber());
        }
        System.out.println("-".repeat(30));
    }

    private int checkContactExist(String name){
        for(Contact item : contacts){
            if(item.name().equals(name)){
                return contacts.indexOf(item);
            }
        }
        return -1;
    }

    public void searchContact(String name){
        for(Contact item : contacts){
            if(item.name().equals(name)){
                System.out.println("name : "+item.name() + " phone Number is "+item.phoneNumber());
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

record Contact(String name, String phoneNumber) {
}
