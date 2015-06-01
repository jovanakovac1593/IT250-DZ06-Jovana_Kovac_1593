/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz06.jovana_kovac_1593.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author student
 */

@Entity
@Table(name = "soba")
@NamedQueries({
    @NamedQuery(name = "Soba.findAll", query = "SELECT s FROM Soba s")})
public class Soba implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "imeSobe")
    private String imeSobe;
    @Basic(optional = false)
    @Column(name = "sprat")
    private int sprat;
    @Basic(optional = false)
    @Column(name = "internet")
    private String internet;
    @Basic(optional = false)
    @Column(name = "tv")
    private String tv;
    @Basic(optional = false)
    @Column(name = "djakuzi")
    private String djakuzi;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "soba_id")
    private Integer sobaId;

    @Inject
    public Soba() {
    }

    public Soba(Integer sobaId) {
        this.sobaId = sobaId;
    }

    public Soba(Integer sobaId, String imeSobe, int sprat, String internet, String tv, String djakuzi) {
        this.sobaId = sobaId;
        this.imeSobe = imeSobe;
        this.sprat = sprat;
        this.internet = internet;
        this.tv = tv;
        this.djakuzi = djakuzi;
    }

    public String getImeSobe() {
        return imeSobe;
    }

    public void setImeSobe(String imeSobe) {
        this.imeSobe = imeSobe;
    }

    public int getSprat() {
        return sprat;
    }

    public void setSprat(int sprat) {
        this.sprat = sprat;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getDjakuzi() {
        return djakuzi;
    }

    public void setDjakuzi(String djakuzi) {
        this.djakuzi = djakuzi;
    }

    public Integer getSobaId() {
        return sobaId;
    }

    public void setSobaId(Integer sobaId) {
        this.sobaId = sobaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sobaId != null ? sobaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Soba)) {
            return false;
        }
        Soba other = (Soba) object;
        if ((this.sobaId == null && other.sobaId != null) || (this.sobaId != null && !this.sobaId.equals(other.sobaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.it250.dz06.jovana_kovac_1593.entities.Soba[ sobaId=" + sobaId + " ]";
    }
    
}
