package models;

/**
 * Created by Mandy on 4/22/16.
 */

import javax.persistence.*;

@Entity
public class GroupRequestor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long senderId;
    private String groupUrl;

    public GroupRequestor() {
    }

    public GroupRequestor(long senderId, String groupUrl) {
        this.senderId = senderId;
        this.groupUrl = groupUrl;
    }

    public long getId() {
        return id;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(long senderId) {
        this.senderId = senderId;
    }

    public String getGroupUrl() {
        return groupUrl;
    }

    public void setGroupUrl(String groupUrl) {
        this.groupUrl = groupUrl;
    }
    @Override
    public String toString() {
        return "GroupRequestor [senderId=" + senderId + ", groupUrl=" + groupUrl + "]";
    }

}
