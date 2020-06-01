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
@Table(name = "naudotojas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Naudotojas.findAll", query = "SELECT n FROM Naudotojas n"),
    @NamedQuery(name = "Naudotojas.findById", query = "SELECT n FROM Naudotojas n WHERE n.id = :id"),
    @NamedQuery(name = "Naudotojas.findBySlapyvardis", query = "SELECT n FROM Naudotojas n WHERE n.slapyvardis = :slapyvardis"),
    @NamedQuery(name = "Naudotojas.findBySlapta\u017eodis", query = "SELECT n FROM Naudotojas n WHERE n.slapta\u017eodis = :slapta\u017eodis"),
    @NamedQuery(name = "Naudotojas.findByVardas", query = "SELECT n FROM Naudotojas n WHERE n.vardas = :vardas"),
    @NamedQuery(name = "Naudotojas.findByPavard\u0117", query = "SELECT n FROM Naudotojas n WHERE n.pavard\u0117 = :pavard\u0117"),
    @NamedQuery(name = "Naudotojas.findByElPa\u0161tas", query = "SELECT n FROM Naudotojas n WHERE n.elPa\u0161tas = :elPa\u0161tas"),
    @NamedQuery(name = "Naudotojas.findByKontaktinisTelefonas", query = "SELECT n FROM Naudotojas n WHERE n.kontaktinisTelefonas = :kontaktinisTelefonas")})
public class Naudotojas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Slapyvardis")
    private String slapyvardis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "Slapta\u017eodis")
    private String slaptažodis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Vardas")
    private String vardas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Pavard\u0117")
    private String pavardė;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "El_Pa\u0161tas")
    private String elPaštas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "KontaktinisTelefonas")
    private String kontaktinisTelefonas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "naudotojasID")
    private Collection<Naudotojoadresas> naudotojoadresasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "naudotojasID")
    private Collection<Skelbimas> skelbimasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "naudotojasID")
    private Collection<Žūklėsdalyviai> žūklėsdalyviaiCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "naudotojasID")
    private Collection<Administratorius> administratoriusCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "naudotojasID")
    private Collection<Naudotojasįrankiai> naudotojasįrankiaiCollection;

    public Naudotojas() {
    }

    public Naudotojas(Integer id) {
        this.id = id;
    }

    public Naudotojas(Integer id, String slapyvardis, String slaptažodis, String vardas, String pavardė, String elPaštas, String kontaktinisTelefonas) {
        this.id = id;
        this.slapyvardis = slapyvardis;
        this.slaptažodis = slaptažodis;
        this.vardas = vardas;
        this.pavardė = pavardė;
        this.elPaštas = elPaštas;
        this.kontaktinisTelefonas = kontaktinisTelefonas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSlapyvardis() {
        return slapyvardis;
    }

    public void setSlapyvardis(String slapyvardis) {
        this.slapyvardis = slapyvardis;
    }

    public String getSlaptažodis() {
        return slaptažodis;
    }

    public void setSlaptažodis(String slaptažodis) {
        this.slaptažodis = slaptažodis;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavardė() {
        return pavardė;
    }

    public void setPavardė(String pavardė) {
        this.pavardė = pavardė;
    }

    public String getElPaštas() {
        return elPaštas;
    }

    public void setElPaštas(String elPaštas) {
        this.elPaštas = elPaštas;
    }

    public String getKontaktinisTelefonas() {
        return kontaktinisTelefonas;
    }

    public void setKontaktinisTelefonas(String kontaktinisTelefonas) {
        this.kontaktinisTelefonas = kontaktinisTelefonas;
    }

    @XmlTransient
    public Collection<Naudotojoadresas> getNaudotojoadresasCollection() {
        return naudotojoadresasCollection;
    }

    public void setNaudotojoadresasCollection(Collection<Naudotojoadresas> naudotojoadresasCollection) {
        this.naudotojoadresasCollection = naudotojoadresasCollection;
    }

    @XmlTransient
    public Collection<Skelbimas> getSkelbimasCollection() {
        return skelbimasCollection;
    }

    public void setSkelbimasCollection(Collection<Skelbimas> skelbimasCollection) {
        this.skelbimasCollection = skelbimasCollection;
    }

    @XmlTransient
    public Collection<Žūklėsdalyviai> getŽūklėsdalyviaiCollection() {
        return žūklėsdalyviaiCollection;
    }

    public void setŽūklėsdalyviaiCollection(Collection<Žūklėsdalyviai> žūklėsdalyviaiCollection) {
        this.žūklėsdalyviaiCollection = žūklėsdalyviaiCollection;
    }

    @XmlTransient
    public Collection<Administratorius> getAdministratoriusCollection() {
        return administratoriusCollection;
    }

    public void setAdministratoriusCollection(Collection<Administratorius> administratoriusCollection) {
        this.administratoriusCollection = administratoriusCollection;
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
        if (!(object instanceof Naudotojas)) {
            return false;
        }
        Naudotojas other = (Naudotojas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.avisockas.FishWebService.Naudotojas[ id=" + id + " ]";
    }
    
}
