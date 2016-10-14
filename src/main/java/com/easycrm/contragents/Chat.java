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

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.REFRESH})
    @JoinColumn( name = "contragent_id", nullable = false)
    private Contragent contragent;


    public Chat() {
    }

    public Chat(String type, String chat) {
        this.type = type;
        this.chat = chat;
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

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }
}
