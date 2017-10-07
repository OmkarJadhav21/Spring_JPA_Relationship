package com.JPA2.JPA2.Model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "pet")
public class Pet {
    @Id
    String p;
    String q;

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "p='" + p + '\'' +
                ", q='" + q + '\'' +
                '}';
    }
}
