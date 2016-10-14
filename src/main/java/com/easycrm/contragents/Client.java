package com.easycrm.contragents;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by drkomp on 25.08.2016.
 */
@Entity
@Table(name = "clients")
public class Client extends Contragent {

    private String namePrefix;
    private String surname;
    private String patronymic;
    private String nameSuffix;
    private String nickName;
    private String phoneticSurname;

    //oganization can have link to many clients, and one client can have link to many organizations
    @ManyToMany(mappedBy = "clients", cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.REFRESH})
    private Set<Organization> organizations = new LinkedHashSet<>(); //like 'Director' - 'Farlep-Invest'

    public Client() {
        super();
    }



    public void setId(int id) {
        this.id = id;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhoneticSurname() {
        return phoneticSurname;
    }

    public void setPhoneticSurname(String phoneticSurname) {
        this.phoneticSurname = phoneticSurname;
    }

    public Set<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(LinkedHashSet<Organization> organizations) {
        this.organizations = organizations;
    }
}
