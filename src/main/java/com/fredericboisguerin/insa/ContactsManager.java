package com.fredericboisguerin.insa;

import java.util.ArrayList;


public class ContactsManager {

    ArrayList<Contact> listContacts = new ArrayList<Contact>();

    public void addContact(String name, String email, String phoneNumber) throws InvalidContactNameException, InvalidEmailException{
        if(name==null || name==""){
            throw new InvalidContactNameException();
        }
        if (email!=null && !email.contains("@") ){
            throw new InvalidEmailException();
        }
        Contact contact = new Contact(name, email, phoneNumber);
        listContacts.add(contact);

    }

    public void printAllContacts() {
        int i = 0 ;
        for (Contact contact:listContacts) {
            System.out.println(contact.toString());
            i++;
        }
        if (i==0) {
            System.out.println("Pas de contact dans la liste");
        }
    }

    public void searchContactByName(String name) {

        int i = 0 ;
        for (Contact contact:listContacts) {
            if (contact.name.toLowerCase().contains(name.toLowerCase())){
                System.out.println(contact.toString());
                i++;
            }
        }
        if (i==0){
            System.out.println("Pas de contact pour ce nom");
        }
    }
}
