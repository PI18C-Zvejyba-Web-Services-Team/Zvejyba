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
@Table(name = "\u012frankisfirma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "\u012erankisfirma.findAll", query = "SELECT \u012f FROM \u012erankisfirma \u012f"),
    @NamedQuery(name = "\u012erankisfirma.findById", query = "SELECT \u012f FROM \u012erankisfirma \u012f WHERE \u012f.id = :id"),
    @NamedQuery(name = "\u012erankisfirma.findByFirma", query = "SELECT \u012f FROM \u012erankisfirma \u012f WHERE \u012f.firma = :firma")})
public class Įrankisfirma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Firma")
    private String firma;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "\u012frankisFirmaID")
    private Collection<Įrankis> įrankisCollection;

    public Įrankisfirma() {
    }

    public Įrankisfirma(Integer id) {
        this.id = id;
    }

    public Įrankisfirma(Integer id, String firma) {
        this.id = id;
        this.firma = firma;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    @XmlTransient
    public Collection<Įrankis> getĮrankisCollection() {
        return įrankisCollection;
    }

    public void setĮrankisCollection(Collection<Įrankis> įrankisCollection) {
        this.įrankisCollection = įrankisCollection;
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
        if (!(object instanceof Įrankisfirma)) {
            return false;
        }
        Įrankisfirma other = (Įrankisfirma) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.avisockas.FishWebService.\u012erankisfirma[ id=" + id + " ]";
    }
    
}
