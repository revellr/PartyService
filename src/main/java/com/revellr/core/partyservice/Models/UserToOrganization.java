package com.revellr.core.partyservice.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class UserToOrganization {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Integer id;

    private String username;

    private String OrganizatioName;

}