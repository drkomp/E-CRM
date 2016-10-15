package com.easycrm.contragents;


import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by drkomp on 31.08.2016.
 */
@Entity
@Table(name = "organizations")
public class Organization extends Contragent {
    private String erdpu;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "client_organization",
                joinColumns = @JoinColumn(name = "organization_id"),
                inverseJoinColumns = @JoinColumn(name = "client_id"))
    private Set<Client> clients = new LinkedHashSet<>(); //oganization can have link to many clients, and one client can have link to many organizations

    public Organization() {
        super();
    }
}
