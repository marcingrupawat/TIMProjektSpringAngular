package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name="obiekty")
public class Obiekty  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idobiektu")
    private int idobiektu;
    @Column(name="nazwaobiektu")
    private String nazwaobiektu;



    public Obiekty() {
    }

    public Obiekty(int idobiektu, String nazwaobiektu) {
        this.idobiektu = idobiektu;
        this.nazwaobiektu = nazwaobiektu;

    }

    public long getId() {
        return idobiektu;
    }

    public void setidobiektu(int idobiektu) {
        this.idobiektu = idobiektu;
    }

    public String getName() {
        return this.nazwaobiektu;
    }

    public void setnazwaobiektu(String nazwaobiektu) {
        this.nazwaobiektu = nazwaobiektu;
    }
    @Override
    public String toString() {
        return "Customer [id=" + idobiektu + ", name=" + nazwaobiektu + "]";
    }

}
