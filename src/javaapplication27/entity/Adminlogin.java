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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Hasindu
 */
@Entity
@Table(name = "ADMINLOGIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Adminlogin.findAll", query = "SELECT a FROM Adminlogin a")
    , @NamedQuery(name = "Adminlogin.findByName", query = "SELECT a FROM Adminlogin a WHERE a.name = :name")
    , @NamedQuery(name = "Adminlogin.findByUsername", query = "SELECT a FROM Adminlogin a WHERE a.username = :username")
    , @NamedQuery(name = "Adminlogin.findByPassword", query = "SELECT a FROM Adminlogin a WHERE a.password = :password")
    , @NamedQuery(name = "Adminlogin.findByEmail", query = "SELECT a FROM Adminlogin a WHERE a.email = :email")})
public class Adminlogin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "NAME")
    private String name;
    @Id
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "EMAIL")
    private String email;

    public Adminlogin() {
    }

    public Adminlogin(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adminlogin)) {
            return false;
        }
        Adminlogin other = (Adminlogin) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication27.Adminlogin[ username=" + username + " ]";
    }
    
}
