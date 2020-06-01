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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "\u012frankis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "\u012erankis.findAll", query = "SELECT \u012f FROM \u012erankis \u012f"),
    @NamedQuery(name = "\u012erankis.findById", query = "SELECT \u012f FROM \u012erankis \u012f WHERE \u012f.id = :id"),
    @NamedQuery(name = "\u012erankis.findByPavadinimas", query = "SELECT \u012f FROM \u012erankis \u012f WHERE \u012f.pavadinimas = :pavadinimas")})
public class Įrankis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "Pavadinimas")
    private String pavadinimas;
    @JoinColumn(name = "\u012erankisFirma_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Įrankisfirma įrankisFirmaID;
    @JoinColumn(name = "\u012erankisTipas_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Įrankistipas įrankisTipasID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "\u012frankisID")
    private Collection<Naudotojasįrankiai> naudotojasįrankiaiCollection;

    public Įrankis() {
    }

    public Įrankis(Integer id) {
        this.id = id;
    }

    public Įrankis(Integer id, String pavadinimas) {
        this.id = id;
        this.pavadinimas = pavadinimas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Įrankisfirma getĮrankisFirmaID() {
        return įrankisFirmaID;
    }

    public void setĮrankisFirmaID(Įrankisfirma įrankisFirmaID) {
        this.įrankisFirmaID = įrankisFirmaID;
    }

    public Įrankistipas getĮrankisTipasID() {
        return įrankisTipasID;
    }

    public void setĮrankisTipasID(Įrankistipas įrankisTipasID) {
        this.įrankisTipasID = įrankisTipasID;
    }

    @XmlTransient
    public Collection<Naudotojasįrankiai> getNaudotojasįrankiaiCollection() {
        return naudotojasįrankiaiCollection;
    }

    public void setNaudotojasįrankiaiCollection(Collection<Naudotojasįrankiai> naudotojasįrankiaiCollection) {
        this.naudotojasįrankiaiCollection = naudotojasįrankiaiCollection;
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
        if (!(object instanceof Įrankis)) {
            return false;
        }
        Įrankis other = (Įrankis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.avisockas.FishWebService.\u012erankis[ id=" + id + " ]";
    }
    
}
