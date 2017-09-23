package com.hurd.Hurd.data;

import javax.persistence.*;



/**
 * Created by shad on 9/23/17.
 */
@Entity
@Table(name = "Person")
public class Person {
    public Person() {

    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;

    }

    public int getID() {
        return ID;

    }

    public void setID(int ID) {
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
    @Override
    public String toString() {
        return String.format(
                "Person[ID=%d, name='%s', name='%s']",
        ID, name, email);
    }
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int ID;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;

}
