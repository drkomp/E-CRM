package com.ecrm.testdb;

import com.easycrm.contragents.Address;
import com.easycrm.contragents.Phone;
import com.easycrm.hibernate.Factory;

/**
 * Created by drkomp on 02.10.2016.
 */
public class TestDB {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Address a1 = new Address();

        p1.setType("Mobile");
        p1.setPhone("0671020333");
        a1.setType("Home");
        a1.setCity("Kharkov");
        a1.setAddress("Simskaya 1, office 205");

        try {
//            Factory.getInstance().getPhoneDao().addIt(p1);
//            Factory.getInstance().getaddressDao().addIt(a1);
            Phone ppp= Factory.getInstance().getPhoneDao().getItById(Phone.class,1);
            System.out.println(ppp.getId()+" phone=  "+ ppp.getPhone()+ " type="+ppp.getType());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("After try");

    }
}
