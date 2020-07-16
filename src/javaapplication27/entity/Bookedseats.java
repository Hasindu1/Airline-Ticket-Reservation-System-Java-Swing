/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27.entity;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Hasindu
 */
@Entity
@Table(name = "BOOKEDSEATS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bookedseats.findAll", query = "SELECT b FROM Bookedseats b")
    , @NamedQuery(name = "Bookedseats.findByBsid", query = "SELECT b FROM Bookedseats b WHERE b.bsid = :bsid")})
public class Bookedseats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BSID")
    private Integer bsid;
    @JoinColumn(name = "PSID", referencedColumnName = "PASSANGERID")
    @ManyToOne
    private Passanger psid;

    public Bookedseats() {
    }

    public Bookedseats(Integer bsid) {
        this.bsid = bsid;
    }

    public Integer getBsid() {
        return bsid;
    }

    public void setBsid(Integer bsid) {
        this.bsid = bsid;
    }

    public Passanger getPsid() {
        return psid;
    }

    public void setPsid(Passanger psid) {
        this.psid = psid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bsid != null ? bsid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookedseats)) {
            return false;
        }
        Bookedseats other = (Bookedseats) object;
        if ((this.bsid == null && other.bsid != null) || (this.bsid != null && !this.bsid.equals(other.bsid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication27.Bookedseats[ bsid=" + bsid + " ]";
    }
    
}
