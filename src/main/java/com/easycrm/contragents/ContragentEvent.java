package com.easycrm.contragents;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by drkomp on 25.08.2016.
 */
@Entity
@Table(name = "events")
public class ContragentEvent {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private int id;
    @Column(name = "evet_name")
    private String eventName;
    @Column(name = "date")
    private Date date;

    public ContragentEvent() {
    }

    public ContragentEvent(int id, String eventName, Date date) {
        this.id = id;
        this.eventName = eventName;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
