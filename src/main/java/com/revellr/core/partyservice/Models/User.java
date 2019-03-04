package com.revellr.core.partyservice.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Integer id;

    private String firstName;

    private String lastName;

    private String userName;

    private String mobileNumber;

    private String email;

    private String ImageURI;

    private String CurrentOrganisation;

    private String College;


    public Integer getId() {
        return id;
    }


    public String getName() {
        return firstName + " " + lastName;
    }

    public void setName(String firstName , String LastName) {
        this.firstName = firstName;
        this.lastName  = lastName;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setUserName(String username) {
        this.userName = username;
    }

}

