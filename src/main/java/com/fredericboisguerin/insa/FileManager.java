package com.fredericboisguerin.insa;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;


public class FileManager {

    String nom ;

    public FileManager(String nom){
        this.nom = nom ;
    }


    public void write_File(Contact contact) throws Exception {
        CSVWriter writer = new CSVWriter(new FileWriter(this.nom));

        //create record
        String [] record = (contact.name +","+ contact.phoneNumber +","+ contact.phoneNumber).split(",");

        // write the record to file
        writer.writeNext(record);

        //close the writer
        writer.close();
    }

    public void append_File(Contact contact) throws Exception {

        CSVWriter writer = new CSVWriter(new FileWriter(this.nom,true));

        //create record
        String [] record = (contact.name +","+ contact.phoneNumber +","+ contact.phoneNumber).split(",");

        // write the record to file
        writer.writeNext(record);

        //close the writer
        writer.close();
    }

    public ArrayList<Contact> read_File() throws Exception {
        CSVReader reader = new CSVReader(new FileReader(this.nom),',','"',0);

        ArrayList <Contact> listeContact = new ArrayList<Contact>();

        // read CSV
        String [] nextLine;
        while((nextLine=reader.readNext())!= null){

            if (nextLine!=null){
                //System.out.println(Arrays.toString(nextLine));
                listeContact.add(new Contact(nextLine[0],nextLine[1],nextLine[2]));


            }
        }

        return listeContact;
    }


}
