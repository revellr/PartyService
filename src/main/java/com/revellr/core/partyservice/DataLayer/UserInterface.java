package com.revellr.core.partyservice.DataLayer;

import java.util.*;
import com.revellr.core.partyservice.MysqlInterface.UserTable;



public class UserInterface{

    public String CreateUser(Map<String , String> input)
    {
        User newUser = new Models.User();
        newUser.setName(input.firstname , input.lastname);
        newuser.setUsername(input.username);
        newuser.setEmail(input.email);
    }



}
