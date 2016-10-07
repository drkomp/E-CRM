package com.easycrm.contragents;

import java.util.LinkedHashSet;

/**
 * Created by drkomp on 01.10.2016.
 */

public abstract class Contragent {
    private String name;
    private String phoneticName;
    private String notes;
    private Client addressed; //Who addressed this client to me
    private LinkedHashSet<Phone> phones; //like 'mobile' - '0987654321'
    private LinkedHashSet<Address> adresses; //like 'home' - 'Uborevicha st. 15 office 2'
    private LinkedHashSet<Email> emails; //like 'private' 'fedor.kusch@gmail.com'
    private LinkedHashSet<Chat> chats; //like 'skype' - 'fedor.kusch'
    private LinkedHashSet<WebSite> webSites;
    private LinkedHashSet<ContragentEvent> contragentEvents; //like 'birthday' - '12.01.2001'
}
