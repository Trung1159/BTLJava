/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndt.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TUN
 */
@Entity
@Table(name = "danhgia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Danhgia.findAll", query = "SELECT d FROM Danhgia d"),
    @NamedQuery(name = "Danhgia.findById", query = "SELECT d FROM Danhgia d WHERE d.id = :id"),
    @NamedQuery(name = "Danhgia.findByScore", query = "SELECT d FROM Danhgia d WHERE d.score = :score"),
    @NamedQuery(name = "Danhgia.findByContent", query = "SELECT d FROM Danhgia d WHERE d.content = :content")})
public class Danhgia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "score")
    private BigDecimal score;
    @Size(max = 45)
    @Column(name = "content")
    private String content;
    @JoinColumn(name = "khoaluan_id", referencedColumnName = "id")
    @ManyToOne
    private Khoaluan khoaluanId;
    @JoinColumn(name = "sinvien_id", referencedColumnName = "id")
    @ManyToOne
    private User sinvienId;

    public Danhgia() {
    }

    public Danhgia(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Khoaluan getKhoaluanId() {
        return khoaluanId;
    }

    public void setKhoaluanId(Khoaluan khoaluanId) {
        this.khoaluanId = khoaluanId;
    }

    public User getSinvienId() {
        return sinvienId;
    }

    public void setSinvienId(User sinvienId) {
        this.sinvienId = sinvienId;
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
        if (!(object instanceof Danhgia)) {
            return false;
        }
        Danhgia other = (Danhgia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ndt.pojos.Danhgia[ id=" + id + " ]";
    }
    
}
