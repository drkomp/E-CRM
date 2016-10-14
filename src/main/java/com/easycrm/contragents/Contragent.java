package com.easycrm.contragents;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by drkomp on 01.10.2016.
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "contragent")
public abstract class Contragent {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    protected long id;
    @Column(name = "name")
    protected String name;
    @Column (name = "phoneticName")
    protected String phoneticName;
    @Column (name = "notes")
    protected String notes;


    @OneToOne (fetch = FetchType.LAZY, optional = true)
    protected Contragent addressed ; //Who addressed this client to me

    @OneToMany (fetch = FetchType.LAZY, orphanRemoval = true, cascade = {CascadeType.ALL})
    @JoinColumn(name = "contragent_id")
    protected Set<Phone> phones = new LinkedHashSet<Phone>() ; //like 'mobile' - '0987654321'

    @OneToMany (fetch = FetchType.LAZY, orphanRemoval = true, cascade = {CascadeType.ALL})
    @JoinColumn(name = "contragent_id")
    protected Set<Address> adresses = new LinkedHashSet<>();        //like 'home' - 'Uborevicha st. 15 office 2'

    @OneToMany (fetch = FetchType.LAZY,  orphanRemoval = true, cascade = {CascadeType.ALL})
    @JoinColumn(name = "contragent_id")
    protected Set<Email> emails = new LinkedHashSet<>(); //like 'private' 'fedor.kusch@gmail.com'

    @OneToMany (fetch = FetchType.LAZY,  orphanRemoval = true, cascade = {CascadeType.ALL})
    @JoinColumn(name = "contragent_id")
    protected Set<Chat> chats = new LinkedHashSet<>(); //like 'skype' - 'fedor.kusch'

    @OneToMany (fetch = FetchType.LAZY,  orphanRemoval = true, cascade = {CascadeType.ALL})
    @JoinColumn(name = "contragent_id")
    protected Set<WebSite> webSites= new LinkedHashSet<>();

    @OneToMany (fetch = FetchType.LAZY,  orphanRemoval = true, cascade = {CascadeType.ALL})
    @JoinColumn(name = "contragent_id")
    protected Set<ContragentEvent> contragentEvents= new LinkedHashSet<>(); //like 'birthday' - '12.01.2001'

    public Contragent() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneticName() {
        return phoneticName;
    }

    public void setPhoneticName(String phoneticName) {
        this.phoneticName = phoneticName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Contragent getAddressed() {
        return addressed;
    }

    public void setAddressed(Contragent addressed) {
        this.addressed = addressed;
    }

    public Set<Phone> getPhones() {
        return phones;
    }

    public void setPhones(LinkedHashSet<Phone> phones) {
        this.phones = phones;
    }

    public Set<Address> getAdresses() {
        return adresses;
    }

    public void setAdresses(LinkedHashSet<Address> adresses) {
        this.adresses = adresses;
    }
    public void addAddress(Address a){this.adresses.add(a);}

    public Set<Email> getEmails() {
        return emails;
    }

    public void setEmails(LinkedHashSet<Email> emails) {
        this.emails = emails;
    }

    public Set<Chat> getChats() {
        return chats;
    }

    public void setChats(LinkedHashSet<Chat> chats) {
        this.chats = chats;
    }

    public Set<WebSite> getWebSites() {
        return webSites;
    }

    public void setWebSites(LinkedHashSet<WebSite> webSites) {
        this.webSites = webSites;
    }

    public Set<ContragentEvent> getContragentEvents() {
        return contragentEvents;
    }

    public void setContragentEvents(LinkedHashSet<ContragentEvent> contragentEvents) {
        this.contragentEvents = contragentEvents;
    }

}
