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
        testAddClient();
        HibernateUtil.getSessionFactory().close();
        System.out.println("After try");

    }
    public static void testGetClient(){
        Client clientTwo;

    }
    public static void testAddClient(){
        Client clAddressed = new Client().setName("Петро").setPatronymic("Якович").setSurname("Вус");

        Client client1 = new Client().setNamePrefix("Mr.").setName("Vasilij").setSurname("Lisicky").setPatronymic("Prokofievich");
        client1.setNameSuffix("XII").setNickName("VALIS").setPhoneticName("Vasilij-").setPhoneticSurname("Lisitskij");
        client1.setNotes("bussiness trip to Kiev at 2016").setAddressed(clAddressed);

        Phone p1 = new Phone("Work", "0998765432", client1);
        client1.getPhones().add(p1);
        Phone p2 = new Phone("Home","(057)755-21-34", client1);
        client1.getPhones().add(p2);
        Address a1 = new Address().setType("Home").setIndex("61222").setAddress("Pushkinskaya str. 34").setCity("Kharkov");
        a1.setNeighborhood("Academy Yaroslava Mudrogo").setRoute("5 minute walk from metro Pushkinskaja ").setContragent(client1);
        client1.getAdresses().add(a1);
        

        try {
//            Factory.getInstance().getPhoneDao().addIt(p1);
//            Factory.getInstance().getaddressDao().addIt(a1);
            Phone ppp= Factory.getInstance().getPhoneDao().getItById(Phone.class,1);
            System.out.println(ppp.getId()+" phone=  "+ ppp.getPhone()+ " type="+ppp.getType());
//            Factory.getInstance().getaclientDao().addIt(client1);

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
