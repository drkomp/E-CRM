package com.easycrm;

import java.util.LinkedHashSet;

/**
 * Created by drkomp on 25.08.2016.
 */
public class Client extends Contact {
    private int id;
    private String namePrefix;
    private String surname;
    private String patronymic;
    private String nameSuffix;
    private String nickName;
    private String phoneticSurname;

    //oganization can have link to many clients, and one client can have link to many organizations
    private LinkedHashSet<Organization> organizations; //like 'Director' - 'Farlep-Invest'


}
