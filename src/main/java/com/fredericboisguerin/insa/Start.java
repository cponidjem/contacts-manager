package com.fredericboisguerin.insa;

import java.util.ArrayList;

public class Start {

    public static void main(String[] args) {
        try {
            new UI(new ContactsManager()).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
/*
        Contact contact1 = new Contact("jean1","jean1@insa","0606");
        Contact contact2 = new Contact("jean2","jean2@insa","0606");
        Contact contact3 = new Contact("jean3","jean3@insa","0606");



        //new UI(new ContactsManager()).start();
        try {
            new FileManager().append_File("test.csv",contact1);
            new FileManager().append_File("test.csv",contact2);
            new FileManager().append_File("test.csv",contact3);
            ContactsManager contactsmanager = new ContactsManager();
            contactsmanager.listContacts = new FileManager().read_File("test.csv");
            contactsmanager.printAllContacts();



        }
        catch (Exception e) {
            System.out.println("Exception levée pour du CSV");
        }

*/
    }
}
