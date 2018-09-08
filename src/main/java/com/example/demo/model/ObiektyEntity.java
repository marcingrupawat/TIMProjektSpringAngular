package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "obiekty", schema = "public", catalog = "dfgial13imktb6")
public class ObiektyEntity {
    private int idobiektu;
    private String nazwaobiektu;

    @Id
    @Column(name = "idobiektu", nullable = false)
    public int getIdobiektu () {
        return idobiektu;
    }

    public void setIdobiektu (int idobiektu) {
        this.idobiektu = idobiektu;
    }

    @Basic
    @Column(name = "nazwaobiektu", nullable = false, length = 50)
    public String getNazwaobiektu () {
        return nazwaobiektu;
    }

    public void setNazwaobiektu (String nazwaobiektu) {
        this.nazwaobiektu = nazwaobiektu;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObiektyEntity that = (ObiektyEntity) o;
        return idobiektu == that.idobiektu &&
                Objects.equals(nazwaobiektu, that.nazwaobiektu);
    }

    @Override
    public int hashCode () {

        return Objects.hash(idobiektu, nazwaobiektu);
    }
}
