package com.example.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "statusobiektow", schema = "public", catalog = "dfgial13imktb6")
public class StatusobiektowEntity {
    private int idstatusu;
    private String status;
    private Timestamp aktynoscod;
    private Timestamp aktywnoscdo;
    private ObiektyEntity obiektyByObiektyIdobiektu;

    @Id
    @Column(name = "idstatusu", nullable = false)
    public int getIdstatusu () {
        return idstatusu;
    }

    public void setIdstatusu (int idstatusu) {
        this.idstatusu = idstatusu;
    }

    @Basic
    @Column(name = "status", nullable = false, length = 50)
    public String getStatus () {
        return status;
    }

    public void setStatus (String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "aktynoscod", nullable = false)
    public Timestamp getAktynoscod () {
        return aktynoscod;
    }

    public void setAktynoscod (Timestamp aktynoscod) {
        this.aktynoscod = aktynoscod;
    }

    @Basic
    @Column(name = "aktywnoscdo", nullable = false)
    public Timestamp getAktywnoscdo () {
        return aktywnoscdo;
    }

    public void setAktywnoscdo (Timestamp aktywnoscdo) {
        this.aktywnoscdo = aktywnoscdo;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatusobiektowEntity that = (StatusobiektowEntity) o;
        return idstatusu == that.idstatusu &&
                Objects.equals(status, that.status) &&
                Objects.equals(aktynoscod, that.aktynoscod) &&
                Objects.equals(aktywnoscdo, that.aktywnoscdo);
    }

    @Override
    public int hashCode () {

        return Objects.hash(idstatusu, status, aktynoscod, aktywnoscdo);
    }

    @ManyToOne
    @JoinColumn(name = "obiekty_idobiektu", referencedColumnName = "idobiektu", nullable = false)
    public ObiektyEntity getObiektyByObiektyIdobiektu () {
        return obiektyByObiektyIdobiektu;
    }

    public void setObiektyByObiektyIdobiektu (ObiektyEntity obiektyByObiektyIdobiektu) {
        this.obiektyByObiektyIdobiektu = obiektyByObiektyIdobiektu;
    }
}
