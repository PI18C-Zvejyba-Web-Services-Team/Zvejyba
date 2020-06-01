/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.avisockas.FishWebService;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Andrius
 */
@Entity
@Table(name = "\u017e\u016bkl\u0117")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "\u017d\u016bkl\u0117.findAll", query = "SELECT \u017e FROM \u017d\u016bkl\u0117 \u017e"),
    @NamedQuery(name = "\u017d\u016bkl\u0117.findById", query = "SELECT \u017e FROM \u017d\u016bkl\u0117 \u017e WHERE \u017e.id = :id"),
    @NamedQuery(name = "\u017d\u016bkl\u0117.findByLaikasNuo", query = "SELECT \u017e FROM \u017d\u016bkl\u0117 \u017e WHERE \u017e.laikasNuo = :laikasNuo"),
    @NamedQuery(name = "\u017d\u016bkl\u0117.findByLaikasIki", query = "SELECT \u017e FROM \u017d\u016bkl\u0117 \u017e WHERE \u017e.laikasIki = :laikasIki"),
    @NamedQuery(name = "\u017d\u016bkl\u0117.findByDregm\u0117", query = "SELECT \u017e FROM \u017d\u016bkl\u0117 \u017e WHERE \u017e.dregm\u0117 = :dregm\u0117"),
    @NamedQuery(name = "\u017d\u016bkl\u0117.findByTemperat\u016bra", query = "SELECT \u017e FROM \u017d\u016bkl\u0117 \u017e WHERE \u017e.temperat\u016bra = :temperat\u016bra"),
    @NamedQuery(name = "\u017d\u016bkl\u0117.findBySl\u0117gis", query = "SELECT \u017e FROM \u017d\u016bkl\u0117 \u017e WHERE \u017e.sl\u0117gis = :sl\u0117gis"),
    @NamedQuery(name = "\u017d\u016bkl\u0117.findByV\u0117jas", query = "SELECT \u017e FROM \u017d\u016bkl\u0117 \u017e WHERE \u017e.v\u0117jas = :v\u0117jas")})
public class Žūklė implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LaikasNuo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date laikasNuo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LaikasIki")
    @Temporal(TemporalType.TIMESTAMP)
    private Date laikasIki;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "Dregm\u0117")
    private String dregmė;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "Temperat\u016bra")
    private String temperatūra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "Sl\u0117gis")
    private String slėgis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "V\u0117jas")
    private String vėjas;
    @JoinColumn(name = "OroSalygos_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Orosalygos oroSalygosID;
    @JoinColumn(name = "Telkinys_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Telkinys telkinysID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "\u017e\u016bkl\u0117ID")
    private Collection<Pagautažuvis> pagautažuvisCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "\u017e\u016bkl\u0117ID")
    private Collection<Naudotimasalai> naudotimasalaiCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "\u017e\u016bkl\u0117ID")
    private Collection<Naudotipašarai> naudotipašaraiCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "\u017e\u016bkl\u0117ID")
    private Collection<Žūklėsdalyviai> žūklėsdalyviaiCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "\u017e\u016bkl\u0117ID")
    private Collection<Žūklėįrankis> žūklėįrankisCollection;

    public Žūklė() {
    }

    public Žūklė(Integer id) {
        this.id = id;
    }

    public Žūklė(Integer id, Date laikasNuo, Date laikasIki, String dregmė, String temperatūra, String slėgis, String vėjas) {
        this.id = id;
        this.laikasNuo = laikasNuo;
        this.laikasIki = laikasIki;
        this.dregmė = dregmė;
        this.temperatūra = temperatūra;
        this.slėgis = slėgis;
        this.vėjas = vėjas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getLaikasNuo() {
        return laikasNuo;
    }

    public void setLaikasNuo(Date laikasNuo) {
        this.laikasNuo = laikasNuo;
    }

    public Date getLaikasIki() {
        return laikasIki;
    }

    public void setLaikasIki(Date laikasIki) {
        this.laikasIki = laikasIki;
    }

    public String getDregmė() {
        return dregmė;
    }

    public void setDregmė(String dregmė) {
        this.dregmė = dregmė;
    }

    public String getTemperatūra() {
        return temperatūra;
    }

    public void setTemperatūra(String temperatūra) {
        this.temperatūra = temperatūra;
    }

    public String getSlėgis() {
        return slėgis;
    }

    public void setSlėgis(String slėgis) {
        this.slėgis = slėgis;
    }

    public String getVėjas() {
        return vėjas;
    }

    public void setVėjas(String vėjas) {
        this.vėjas = vėjas;
    }

    public Orosalygos getOroSalygosID() {
        return oroSalygosID;
    }

    public void setOroSalygosID(Orosalygos oroSalygosID) {
        this.oroSalygosID = oroSalygosID;
    }

    public Telkinys getTelkinysID() {
        return telkinysID;
    }

    public void setTelkinysID(Telkinys telkinysID) {
        this.telkinysID = telkinysID;
    }

    @XmlTransient
    public Collection<Pagautažuvis> getPagautažuvisCollection() {
        return pagautažuvisCollection;
    }

    public void setPagautažuvisCollection(Collection<Pagautažuvis> pagautažuvisCollection) {
        this.pagautažuvisCollection = pagautažuvisCollection;
    }

    @XmlTransient
    public Collection<Naudotimasalai> getNaudotimasalaiCollection() {
        return naudotimasalaiCollection;
    }

    public void setNaudotimasalaiCollection(Collection<Naudotimasalai> naudotimasalaiCollection) {
        this.naudotimasalaiCollection = naudotimasalaiCollection;
    }

    @XmlTransient
    public Collection<Naudotipašarai> getNaudotipašaraiCollection() {
        return naudotipašaraiCollection;
    }

    public void setNaudotipašaraiCollection(Collection<Naudotipašarai> naudotipašaraiCollection) {
        this.naudotipašaraiCollection = naudotipašaraiCollection;
    }

    @XmlTransient
    public Collection<Žūklėsdalyviai> getŽūklėsdalyviaiCollection() {
        return žūklėsdalyviaiCollection;
    }

    public void setŽūklėsdalyviaiCollection(Collection<Žūklėsdalyviai> žūklėsdalyviaiCollection) {
        this.žūklėsdalyviaiCollection = žūklėsdalyviaiCollection;
    }

    @XmlTransient
    public Collection<Žūklėįrankis> getŽūklėįrankisCollection() {
        return žūklėįrankisCollection;
    }

    public void setŽūklėįrankisCollection(Collection<Žūklėįrankis> žūklėįrankisCollection) {
        this.žūklėįrankisCollection = žūklėįrankisCollection;
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
        if (!(object instanceof Žūklė)) {
            return false;
        }
        Žūklė other = (Žūklė) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.avisockas.FishWebService.\u017d\u016bkl\u0117[ id=" + id + " ]";
    }
    
}
