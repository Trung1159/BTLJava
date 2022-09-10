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
@Table(name = "tieuchi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tieuchi.findAll", query = "SELECT t FROM Tieuchi t"),
    @NamedQuery(name = "Tieuchi.findById", query = "SELECT t FROM Tieuchi t WHERE t.id = :id"),
    @NamedQuery(name = "Tieuchi.findByScore", query = "SELECT t FROM Tieuchi t WHERE t.score = :score"),
    @NamedQuery(name = "Tieuchi.findByContent", query = "SELECT t FROM Tieuchi t WHERE t.content = :content")})
public class Tieuchi implements Serializable {

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

    public Tieuchi() {
    }

    public Tieuchi(Integer id) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tieuchi)) {
            return false;
        }
        Tieuchi other = (Tieuchi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ndt.pojos.Tieuchi[ id=" + id + " ]";
    }
    
}
