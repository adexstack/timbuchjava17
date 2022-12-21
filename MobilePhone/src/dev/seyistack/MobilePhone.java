package dev.seyistack;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contactToAdd){
//        if(contacts.contains(contactToAdd.getName())){
//            contacts.add(contactToAdd);
//        }

        if(checkContactExist(contactToAdd.getName())){
            System.out.println("That contact already exist");
        } else {
            contacts.add(contactToAdd);
        }
    }



    public void printContacts(){
        for(Contact item : contacts){
            System.out.println("name : "+item.getName() + " phone Number is "+item.getPhoneNumber());
        }

    }

    private boolean checkContactExist(String name){
        for(Contact item : contacts){
            if(item.getName().equals(name)){
                return true;
            }
        }
        return false;
    }


}

class Contact{
    private String name;
    private String phoneNumber;

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
