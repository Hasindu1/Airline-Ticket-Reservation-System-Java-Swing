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
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Hasindu
 */
@Entity
@Table(name = "FLIGHT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Flight.findAll", query = "SELECT f FROM Flight f")
    , @NamedQuery(name = "Flight.findByFlightid", query = "SELECT f FROM Flight f WHERE f.flightid = :flightid")
    , @NamedQuery(name = "Flight.findByTerminal", query = "SELECT f FROM Flight f WHERE f.terminal = :terminal")
    , @NamedQuery(name = "Flight.findByBtime", query = "SELECT f FROM Flight f WHERE f.btime = :btime")
    , @NamedQuery(name = "Flight.findByDepartdate", query = "SELECT f FROM Flight f WHERE f.departdate = :departdate")
    , @NamedQuery(name = "Flight.findByReturndate", query = "SELECT f FROM Flight f WHERE f.returndate = :returndate")
    , @NamedQuery(name = "Flight.findByAirport1", query = "SELECT f FROM Flight f WHERE f.airport1 = :airport1")
    , @NamedQuery(name = "Flight.findByAirport2", query = "SELECT f FROM Flight f WHERE f.airport2 = :airport2")
    , @NamedQuery(name = "Flight.findByCountry1", query = "SELECT f FROM Flight f WHERE f.country1 = :country1")
    , @NamedQuery(name = "Flight.findByCountry2", query = "SELECT f FROM Flight f WHERE f.country2 = :country2")})
public class Flight implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FLIGHTID")
    private Integer flightid;
    @Column(name = "TERMINAL")
    private Integer terminal;
    @Column(name = "BTIME")
    @Temporal(TemporalType.TIME)
    private Date btime;
    @Column(name = "DEPARTDATE")
    @Temporal(TemporalType.DATE)
    private Date departdate;
    @Column(name = "RETURNDATE")
    @Temporal(TemporalType.DATE)
    private Date returndate;
    @Column(name = "AIRPORT1")
    private String airport1;
    @Column(name = "AIRPORT2")
    private String airport2;
    @Column(name = "COUNTRY1")
    private String country1;
    @Column(name = "COUNTRY2")
    private String country2;
    @OneToMany(mappedBy = "flid")
    private Collection<Seat> seatCollection;
    @OneToMany(mappedBy = "fid")
    private Collection<Passanger> passangerCollection;

    public Flight() {
    }

    public Flight(Integer flightid) {
        this.flightid = flightid;
    }

    public Integer getFlightid() {
        return flightid;
    }

    public void setFlightid(Integer flightid) {
        Integer oldFlightid = this.flightid;
        this.flightid = flightid;
        changeSupport.firePropertyChange("flightid", oldFlightid, flightid);
    }

    public Integer getTerminal() {
        return terminal;
    }

    public void setTerminal(Integer terminal) {
        Integer oldTerminal = this.terminal;
        this.terminal = terminal;
        changeSupport.firePropertyChange("terminal", oldTerminal, terminal);
    }

    public Date getBtime() {
        return btime;
    }

    public void setBtime(Date btime) {
        Date oldBtime = this.btime;
        this.btime = btime;
        changeSupport.firePropertyChange("btime", oldBtime, btime);
    }

    public Date getDepartdate() {
        return departdate;
    }

    public void setDepartdate(Date departdate) {
        Date oldDepartdate = this.departdate;
        this.departdate = departdate;
        changeSupport.firePropertyChange("departdate", oldDepartdate, departdate);
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        Date oldReturndate = this.returndate;
        this.returndate = returndate;
        changeSupport.firePropertyChange("returndate", oldReturndate, returndate);
    }

    public String getAirport1() {
        return airport1;
    }

    public void setAirport1(String airport1) {
        String oldAirport1 = this.airport1;
        this.airport1 = airport1;
        changeSupport.firePropertyChange("airport1", oldAirport1, airport1);
    }

    public String getAirport2() {
        return airport2;
    }

    public void setAirport2(String airport2) {
        String oldAirport2 = this.airport2;
        this.airport2 = airport2;
        changeSupport.firePropertyChange("airport2", oldAirport2, airport2);
    }

    public String getCountry1() {
        return country1;
    }

    public void setCountry1(String country1) {
        String oldCountry1 = this.country1;
        this.country1 = country1;
        changeSupport.firePropertyChange("country1", oldCountry1, country1);
    }

    public String getCountry2() {
        return country2;
    }

    public void setCountry2(String country2) {
        String oldCountry2 = this.country2;
        this.country2 = country2;
        changeSupport.firePropertyChange("country2", oldCountry2, country2);
    }

    @XmlTransient
    public Collection<Seat> getSeatCollection() {
        return seatCollection;
    }

    public void setSeatCollection(Collection<Seat> seatCollection) {
        this.seatCollection = seatCollection;
    }

    @XmlTransient
    public Collection<Passanger> getPassangerCollection() {
        return passangerCollection;
    }

    public void setPassangerCollection(Collection<Passanger> passangerCollection) {
        this.passangerCollection = passangerCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (flightid != null ? flightid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Flight)) {
            return false;
        }
        Flight other = (Flight) object;
        if ((this.flightid == null && other.flightid != null) || (this.flightid != null && !this.flightid.equals(other.flightid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
//        return "javaapplication27.Flight[ flightid=" + flightid + " ]";
          return flightid.toString();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
