package com.revellr.core.partyservice.MysqlInterface;

import com.revellr.core.partyservice.Models.User;

import org.springframework.data.repository.CrudRepository;


public class UserTable extends CrudRepository <User, Integer> {

}
