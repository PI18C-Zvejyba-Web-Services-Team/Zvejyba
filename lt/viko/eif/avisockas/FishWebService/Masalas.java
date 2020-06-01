/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.avisockas.FishWebService;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Andrius
 */
@Entity
@Table(name = "masalas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Masalas.findAll", query = "SELECT m FROM Masalas m"),
    @NamedQuery(name = "Masalas.findById", query = "SELECT m FROM Masalas m WHERE m.id = :id"),
    @NamedQuery(name = "Masalas.findByMasalas", query = "SELECT m FROM Masalas m WHERE m.masalas = :masalas")})
public class Masalas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Masalas")
    private String masalas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "masalasID")
    private Collection<Naudotimasalai> naudotimasalaiCollection;

    public Masalas() {
    }

    public Masalas(Integer id) {
        this.id = id;
    }

    public Masalas(Integer id, String masalas) {
        this.id = id;
        this.masalas = masalas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMasalas() {
        return masalas;
    }

    public void setMasalas(String masalas) {
        this.masalas = masalas;
    }

    @XmlTransient
    public Collection<Naudotimasalai> getNaudotimasalaiCollection() {
        return naudotimasalaiCollection;
    }

    public void setNaudotimasalaiCollection(Collection<Naudotimasalai> naudotimasalaiCollection) {
        this.naudotimasalaiCollection = naudotimasalaiCollection;
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
        if (!(object instanceof Masalas)) {
            return false;
        }
        Masalas other = (Masalas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.avisockas.FishWebService.Masalas[ id=" + id + " ]";
    }
    
}
