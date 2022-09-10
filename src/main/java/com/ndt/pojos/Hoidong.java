/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndt.pojos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TUN
 */
@Entity
@Table(name = "hoidong")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hoidong.findAll", query = "SELECT h FROM Hoidong h"),
    @NamedQuery(name = "Hoidong.findById", query = "SELECT h FROM Hoidong h WHERE h.id = :id"),
    @NamedQuery(name = "Hoidong.findByActive", query = "SELECT h FROM Hoidong h WHERE h.active = :active")})
public class Hoidong implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "active")
    private Short active;
    @OneToMany(mappedBy = "hoidongId")
    private List<Khoaluan> khoaluanList;
    @OneToMany(mappedBy = "hoidongId")
    private List<User> userList;

    public Hoidong() {
    }

    public Hoidong(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    @XmlTransient
    public List<Khoaluan> getKhoaluanList() {
        return khoaluanList;
    }

    public void setKhoaluanList(List<Khoaluan> khoaluanList) {
        this.khoaluanList = khoaluanList;
    }

    @XmlTransient
    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hoidong)) {
            return false;
        }
        Hoidong other = (Hoidong) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ndt.pojos.Hoidong[ id=" + id + " ]";
    }
    
}
