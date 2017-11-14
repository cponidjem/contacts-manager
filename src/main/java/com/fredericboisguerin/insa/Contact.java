package com.fredericboisguerin.insa;

public class Contact {
    String name;
    String email;
    String phoneNumber;

    public Contact(String name, String email, String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString(){
        String string = this.name;
        if (email != null)
        {
           string += ", " + this.email;
        }
        if (phoneNumber != null) {
            string += ", " + phoneNumber;
        }
        return string ;
    }

}
