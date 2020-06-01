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
@Table(name = "telkinys")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telkinys.findAll", query = "SELECT t FROM Telkinys t"),
    @NamedQuery(name = "Telkinys.findById", query = "SELECT t FROM Telkinys t WHERE t.id = :id"),
    @NamedQuery(name = "Telkinys.findByPavadinimas", query = "SELECT t FROM Telkinys t WHERE t.pavadinimas = :pavadinimas")})
public class Telkinys implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Pavadinimas")
    private String pavadinimas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "telkinysID")
    private Collection<Žūklė> žūklėCollection;
    @JoinColumn(name = "Adresas_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Adresas adresasID;
    @JoinColumn(name = "TelkinioTipas_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Telkiniotipas telkinioTipasID;

    public Telkinys() {
    }

    public Telkinys(Integer id) {
        this.id = id;
    }

    public Telkinys(Integer id, String pavadinimas) {
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

    @XmlTransient
    public Collection<Žūklė> getŽūklėCollection() {
        return žūklėCollection;
    }

    public void setŽūklėCollection(Collection<Žūklė> žūklėCollection) {
        this.žūklėCollection = žūklėCollection;
    }

    public Adresas getAdresasID() {
        return adresasID;
    }

    public void setAdresasID(Adresas adresasID) {
        this.adresasID = adresasID;
    }

    public Telkiniotipas getTelkinioTipasID() {
        return telkinioTipasID;
    }

    public void setTelkinioTipasID(Telkiniotipas telkinioTipasID) {
        this.telkinioTipasID = telkinioTipasID;
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
        if (!(object instanceof Telkinys)) {
            return false;
        }
        Telkinys other = (Telkinys) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.avisockas.FishWebService.Telkinys[ id=" + id + " ]";
    }
    
}
