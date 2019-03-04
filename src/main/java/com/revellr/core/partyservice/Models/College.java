package com.revellr.core.partyservice.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class College{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)


    private Integer id;

    private String Name;

    private String City;

    private String Category;
}