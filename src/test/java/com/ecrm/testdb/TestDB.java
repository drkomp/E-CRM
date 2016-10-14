package com.ecrm.testdb;

import com.easycrm.contragents.Address;
import com.easycrm.contragents.Client;
import com.easycrm.contragents.Phone;
import com.easycrm.hibernate.Factory;
import com.easycrm.hibernate.HibernateUtil;

import java.util.LinkedHashSet;

/**
 * Created by drkomp on 02.10.2016.
 */
public class TestDB {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Address a1 = new Address();

        p1.setType("Mobile-33");
        p1.setPhone("0991020339");
        a1.setType("Wokr");
        a1.setCity("Kharkov");
        a1.setAddress("Simskaya 11 ");

        Client client1 = new Client();
        client1.setName("CLient one");
        client1.setNamePrefix("M.");

        client1.getPhones().add(p1);
        client1.addAddress(a1);

        try {
//            Factory.getInstance().getPhoneDao().addIt(p1);
//            Factory.getInstance().getaddressDao().addIt(a1);
//            Phone ppp= Factory.getInstance().getPhoneDao().getItById(Phone.class,1);
//            System.out.println(ppp.getId()+" phone=  "+ ppp.getPhone()+ " type="+ppp.getType());
            Factory.getInstance().getaclientDao().addIt(client1);

        }
        catch (Exception e){
            e.printStackTrace();
        }
        HibernateUtil.getSessionFactory().close();
        System.out.println("After try");

    }
}
