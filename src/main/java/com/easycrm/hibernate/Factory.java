package com.easycrm.hibernate;

import com.easycrm.contragents.Address;
import com.easycrm.contragents.Client;
import com.easycrm.contragents.Phone;
import com.easycrm.hibernate.dao.GenericDao;

public class Factory {
    private static GenericDao<Phone> phoneDao = null;
    private static GenericDao<Address> addressDao = null;
    private static GenericDao<Client> clientDao = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public  GenericDao<Phone> getPhoneDao(){
        if (phoneDao == null){
            phoneDao = new GenericDao<Phone>();
        }
        return phoneDao;
    }

    public  GenericDao<Address> getaddressDao(){
        if (addressDao == null){
            addressDao = new GenericDao<Address>();
        }
        return addressDao;
    }

    public  GenericDao<Client> getaclientDao(){
        if (clientDao == null){
            clientDao = new GenericDao<Client>();
        }
        return clientDao;
    }

}
