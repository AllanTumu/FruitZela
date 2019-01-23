package com.example.mea.fruitzela.Model;

import java.net.PasswordAuthentication;

/**
 * Created by Mea on 23/01/2019.
 */

public class User {
    private String Name;
    private String Password;

    public User(){

    }
    public User(String Name, String Password){
        Name = "name";
        Password = "password";
    }

    public String getName(){
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword(){
        return Password;
    }
}
