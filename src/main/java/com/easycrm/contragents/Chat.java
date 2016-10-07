package com.easycrm.contragents;



import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by drkomp on 01.10.2016.
 */
@Entity
@Table(name= "chats")
public class Chat {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private long id;
    @Column(name = "type_")
    private String type;
    @Column(name = "chat" )
    private String chat;
}
