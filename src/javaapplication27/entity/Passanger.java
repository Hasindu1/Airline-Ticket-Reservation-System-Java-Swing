/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27.entity;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Hasindu
 */
@Entity
@Table(name = "PASSANGER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Passanger.findAll", query = "SELECT p FROM Passanger p")
    , @NamedQuery(name = "Passanger.findByPassangerid", query = "SELECT p FROM Passanger p WHERE p.passangerid = :passangerid")
    , @NamedQuery(name = "Passanger.findByPname", query = "SELECT p FROM Passanger p WHERE p.pname = :pname")
    , @NamedQuery(name = "Passanger.findByEmail", query = "SELECT p FROM Passanger p WHERE p.email = :email")
    , @NamedQuery(name = "Passanger.findByGender", query = "SELECT p FROM Passanger p WHERE p.gender = :gender")
    , @NamedQuery(name = "Passanger.findByContactnumber", query = "SELECT p FROM Passanger p WHERE p.contactnumber = :contactnumber")
    , @NamedQuery(name = "Passanger.findByAge", query = "SELECT p FROM Passanger p WHERE p.age = :age")})
public class Passanger implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PASSANGERID")
    private Integer passangerid;
    @Column(name = "PNAME")
    private String pname;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "CONTACTNUMBER")
    private String contactnumber;
    @Column(name = "AGE")
    private String age;
    @OneToMany(mappedBy = "psid")
    private Collection<Bookedseats> bookedseatsCollection;
    @JoinColumn(name = "FID", referencedColumnName = "FLIGHTID")
    @ManyToOne
    private Flight fid;

    public Passanger() {
    }

    public Passanger(Integer passangerid) {
        this.passangerid = passangerid;
    }

    public Integer getPassangerid() {
        return passangerid;
    }

    public void setPassangerid(Integer passangerid) {
        Integer oldPassangerid = this.passangerid;
        this.passangerid = passangerid;
        changeSupport.firePropertyChange("passangerid", oldPassangerid, passangerid);
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        String oldPname = this.pname;
        this.pname = pname;
        changeSupport.firePropertyChange("pname", oldPname, pname);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        String oldContactnumber = this.contactnumber;
        this.contactnumber = contactnumber;
        changeSupport.firePropertyChange("contactnumber", oldContactnumber, contactnumber);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        String oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    @XmlTransient
    public Collection<Bookedseats> getBookedseatsCollection() {
        return bookedseatsCollection;
    }

    public void setBookedseatsCollection(Collection<Bookedseats> bookedseatsCollection) {
        this.bookedseatsCollection = bookedseatsCollection;
    }

    public Flight getFid() {
        return fid;
    }

    public void setFid(Flight fid) {
        Flight oldFid = this.fid;
        this.fid = fid;
        changeSupport.firePropertyChange("fid", oldFid, fid);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (passangerid != null ? passangerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Passanger)) {
            return false;
        }
        Passanger other = (Passanger) object;
        if ((this.passangerid == null && other.passangerid != null) || (this.passangerid != null && !this.passangerid.equals(other.passangerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication27.Passanger[ passangerid=" + passangerid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
