package com.easycrm.contragents;


import java.util.LinkedHashSet;

/**
 * Created by drkomp on 31.08.2016.
 */
public class Organization extends Contragent {
    private int id;
    private String erdpu;
    private LinkedHashSet<Client> clients; //oganization can have link to many clients, and one client can have link to many organizations

}
