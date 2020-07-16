/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27.entity;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Hasindu
 */
@Entity
@Table(name = "SEAT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seat.findAll", query = "SELECT s FROM Seat s")
    , @NamedQuery(name = "Seat.findBySeatid", query = "SELECT s FROM Seat s WHERE s.seatid = :seatid")
    , @NamedQuery(name = "Seat.findBySeatname", query = "SELECT s FROM Seat s WHERE s.seatname = :seatname")
    , @NamedQuery(name = "Seat.findBySeatclass", query = "SELECT s FROM Seat s WHERE s.seatclass = :seatclass")
    , @NamedQuery(name = "Seat.findByAdultprice", query = "SELECT s FROM Seat s WHERE s.adultprice = :adultprice")
    , @NamedQuery(name = "Seat.findByChildprice", query = "SELECT s FROM Seat s WHERE s.childprice = :childprice")
    , @NamedQuery(name = "Seat.findByStatus", query = "SELECT s FROM Seat s WHERE s.status = :status")})
public class Seat implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SEATID")
    private Integer seatid;
    @Column(name = "SEATNAME")
    private String seatname;
    @Column(name = "SEATCLASS")
    private String seatclass;
    @Column(name = "ADULTPRICE")
    private Integer adultprice;
    @Column(name = "CHILDPRICE")
    private Integer childprice;
    @Column(name = "STATUS")
    private Boolean status;
    @JoinColumn(name = "FLID", referencedColumnName = "FLIGHTID")
    @ManyToOne
    private Flight flid;

    public Seat() {
    }

    public Seat(Integer seatid) {
        this.seatid = seatid;
    }

    public Integer getSeatid() {
        return seatid;
    }

    public void setSeatid(Integer seatid) {
        Integer oldSeatid = this.seatid;
        this.seatid = seatid;
        changeSupport.firePropertyChange("seatid", oldSeatid, seatid);
    }

    public String getSeatname() {
        return seatname;
    }

    public void setSeatname(String seatname) {
        String oldSeatname = this.seatname;
        this.seatname = seatname;
        changeSupport.firePropertyChange("seatname", oldSeatname, seatname);
    }

    public String getSeatclass() {
        return seatclass;
    }

    public void setSeatclass(String seatclass) {
        String oldSeatclass = this.seatclass;
        this.seatclass = seatclass;
        changeSupport.firePropertyChange("seatclass", oldSeatclass, seatclass);
    }

    public Integer getAdultprice() {
        return adultprice;
    }

    public void setAdultprice(Integer adultprice) {
        Integer oldAdultprice = this.adultprice;
        this.adultprice = adultprice;
        changeSupport.firePropertyChange("adultprice", oldAdultprice, adultprice);
    }

    public Integer getChildprice() {
        return childprice;
    }

    public void setChildprice(Integer childprice) {
        Integer oldChildprice = this.childprice;
        this.childprice = childprice;
        changeSupport.firePropertyChange("childprice", oldChildprice, childprice);
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        Boolean oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public Flight getFlid() {
        return flid;
    }

    public void setFlid(Flight flid) {
        Flight oldFlid = this.flid;
        this.flid = flid;
        changeSupport.firePropertyChange("flid", oldFlid, flid);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seatid != null ? seatid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seat)) {
            return false;
        }
        Seat other = (Seat) object;
        if ((this.seatid == null && other.seatid != null) || (this.seatid != null && !this.seatid.equals(other.seatid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication27.Seat[ seatid=" + seatid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
