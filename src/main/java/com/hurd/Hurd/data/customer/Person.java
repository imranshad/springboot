package com.hurd.Hurd.data.customer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by shad on 10/17/17.
 */
@Entity
@Table
public class Person {
    @Id
    private long ID;

    public Person(long ID, String name, String email) {
        this.ID = ID;
        this.name = name;
        this.email = email;
    }
    public Person() {
        super();
    }

    private String name;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;
}
