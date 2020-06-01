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
@Table(name = "telkiniotipas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telkiniotipas.findAll", query = "SELECT t FROM Telkiniotipas t"),
    @NamedQuery(name = "Telkiniotipas.findById", query = "SELECT t FROM Telkiniotipas t WHERE t.id = :id"),
    @NamedQuery(name = "Telkiniotipas.findByTipas", query = "SELECT t FROM Telkiniotipas t WHERE t.tipas = :tipas")})
public class Telkiniotipas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Tipas")
    private String tipas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "telkinioTipasID")
    private Collection<Telkinys> telkinysCollection;

    public Telkiniotipas() {
    }

    public Telkiniotipas(Integer id) {
        this.id = id;
    }

    public Telkiniotipas(Integer id, String tipas) {
        this.id = id;
        this.tipas = tipas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipas() {
        return tipas;
    }

    public void setTipas(String tipas) {
        this.tipas = tipas;
    }

    @XmlTransient
    public Collection<Telkinys> getTelkinysCollection() {
        return telkinysCollection;
    }

    public void setTelkinysCollection(Collection<Telkinys> telkinysCollection) {
        this.telkinysCollection = telkinysCollection;
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
        if (!(object instanceof Telkiniotipas)) {
            return false;
        }
        Telkiniotipas other = (Telkiniotipas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.avisockas.FishWebService.Telkiniotipas[ id=" + id + " ]";
    }
    
}
