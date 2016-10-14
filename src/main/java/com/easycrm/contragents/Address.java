package com.easycrm.contragents;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by drkomp on 01.10.2016.
 */
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private long id;
    @Column(name = "type_")
    private String type;
    @Column(name = "index_")
    private String index;
    @Column(name = "city")
    private String city;
    @Column(name = "address")
    private String address;
    @Column(name = "neighborhood")
    private String neighborhood;
    @Column(name = "route")
    private String route;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.REFRESH})
    @JoinColumn( name = "contragent_id", nullable = false)
    private Contragent contragent;


    public Address() {
    }

    public Address(String type, String index, String city, String address, String neighborhood, String route) {
        this.type = type;
        this.index = index;
        this.city = city;
        this.address = address;
        this.neighborhood = neighborhood;
        this.route = route;
    }
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
