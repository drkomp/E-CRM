package com.easycrm.hibernate;

import com.easycrm.contragents.Address;
import com.easycrm.contragents.Phone;
import com.easycrm.hibernate.dao.GenericDao;

public class Factory {
    private static GenericDao<Phone> phoneDao = null;
    private static GenericDao<Address> addressDao = null;
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

}
