package com.easycrm;


import java.util.LinkedHashSet;

/**
 * Created by drkomp on 31.08.2016.
 */
public class Organization extends Contact {
    private int id;
    private String erdpu;
    private LinkedHashSet<Client> clients; //oganization can have link to many clients, and one client can have link to many organizations

}
