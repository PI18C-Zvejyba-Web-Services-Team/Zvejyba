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
@Table(name = "naudotojas\u012frankiai")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Naudotojas\u012frankiai.findAll", query = "SELECT n FROM Naudotojas\u012frankiai n"),
    @NamedQuery(name = "Naudotojas\u012frankiai.findById", query = "SELECT n FROM Naudotojas\u012frankiai n WHERE n.id = :id"),
    @NamedQuery(name = "Naudotojas\u012frankiai.findByKaina", query = "SELECT n FROM Naudotojas\u012frankiai n WHERE n.kaina = :kaina"),
    @NamedQuery(name = "Naudotojas\u012frankiai.findByGarantija", query = "SELECT n FROM Naudotojas\u012frankiai n WHERE n.garantija = :garantija")})
public class Naudotojasįrankiai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Kaina")
    private int kaina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Garantija")
    private String garantija;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "naudotojas\u012erankiaiID")
    private Collection<Skelbimas> skelbimasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "naudotojas\u012erankiaiID")
    private Collection<Žūklėįrankis> žūklėįrankisCollection;
    @JoinColumn(name = "Naudotojas_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Naudotojas naudotojasID;
    @JoinColumn(name = "\u012erankis_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Įrankis įrankisID;

    public Naudotojasįrankiai() {
    }

    public Naudotojasįrankiai(Integer id) {
        this.id = id;
    }

    public Naudotojasįrankiai(Integer id, int kaina, String garantija) {
        this.id = id;
        this.kaina = kaina;
        this.garantija = garantija;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getKaina() {
        return kaina;
    }

    public void setKaina(int kaina) {
        this.kaina = kaina;
    }

    public String getGarantija() {
        return garantija;
    }

    public void setGarantija(String garantija) {
        this.garantija = garantija;
    }

    @XmlTransient
    public Collection<Skelbimas> getSkelbimasCollection() {
        return skelbimasCollection;
    }

    public void setSkelbimasCollection(Collection<Skelbimas> skelbimasCollection) {
        this.skelbimasCollection = skelbimasCollection;
    }

    @XmlTransient
    public Collection<Žūklėįrankis> getŽūklėįrankisCollection() {
        return žūklėįrankisCollection;
    }

    public void setŽūklėįrankisCollection(Collection<Žūklėįrankis> žūklėįrankisCollection) {
        this.žūklėįrankisCollection = žūklėįrankisCollection;
    }

    public Naudotojas getNaudotojasID() {
        return naudotojasID;
    }

    public void setNaudotojasID(Naudotojas naudotojasID) {
        this.naudotojasID = naudotojasID;
    }

    public Įrankis getĮrankisID() {
        return įrankisID;
    }

    public void setĮrankisID(Įrankis įrankisID) {
        this.įrankisID = įrankisID;
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
        if (!(object instanceof Naudotojasįrankiai)) {
            return false;
        }
        Naudotojasįrankiai other = (Naudotojasįrankiai) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.avisockas.FishWebService.Naudotojas\u012frankiai[ id=" + id + " ]";
    }
    
}
