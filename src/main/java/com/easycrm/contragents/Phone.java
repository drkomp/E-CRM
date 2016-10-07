package com.easycrm.contragents;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by drkomp on 01.10.2016.
 */
@Entity
@Table(name = "phones")
public class Phone {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", unique = true)
    private long id;

    @Column(name = "type")
    private String type;

    @Column(name = "phone")
    private String phone;

    public Phone() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
