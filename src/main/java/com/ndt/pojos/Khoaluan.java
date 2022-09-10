/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndt.pojos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TUN
 */
@Entity
@Table(name = "khoaluan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Khoaluan.findAll", query = "SELECT k FROM Khoaluan k"),
    @NamedQuery(name = "Khoaluan.findById", query = "SELECT k FROM Khoaluan k WHERE k.id = :id"),
    @NamedQuery(name = "Khoaluan.findByTitle", query = "SELECT k FROM Khoaluan k WHERE k.title = :title"),
    @NamedQuery(name = "Khoaluan.findByDate", query = "SELECT k FROM Khoaluan k WHERE k.createdDate = :date"),
    @NamedQuery(name = "Khoaluan.findByTotalScore", query = "SELECT k FROM Khoaluan k WHERE k.totalScore = :totalScore")})
public class Khoaluan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "title")
    private String title;
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total_score")
    private Integer totalScore;
    @OneToMany(mappedBy = "khoaluanId")
    private List<Tieuchi> tieuchiList;
    @OneToMany(mappedBy = "khoaluanId")
    private List<Danhgia> danhgiaList;
    @JoinColumn(name = "hoidong_id", referencedColumnName = "id")
    @ManyToOne
    private Hoidong hoidongId;
    @OneToMany(mappedBy = "khoaluanId")
    private List<User> userList;

    public Khoaluan() {
    }

    public Khoaluan(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return createdDate;
    }

    public void setDate(Date date) {
        this.createdDate = date;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    @XmlTransient
    public List<Tieuchi> getTieuchiList() {
        return tieuchiList;
    }

    public void setTieuchiList(List<Tieuchi> tieuchiList) {
        this.tieuchiList = tieuchiList;
    }

    @XmlTransient
    public List<Danhgia> getDanhgiaList() {
        return danhgiaList;
    }

    public void setDanhgiaList(List<Danhgia> danhgiaList) {
        this.danhgiaList = danhgiaList;
    }

    public Hoidong getHoidongId() {
        return hoidongId;
    }

    public void setHoidongId(Hoidong hoidongId) {
        this.hoidongId = hoidongId;
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
        if (!(object instanceof Khoaluan)) {
            return false;
        }
        Khoaluan other = (Khoaluan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ndt.pojos.Khoaluan[ id=" + id + " ]";
    }
    
}
