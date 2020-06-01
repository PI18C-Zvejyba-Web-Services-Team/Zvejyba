/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.avisockas.FishWebService;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
 * @author Andrius
 */
@Entity
@Table(name = "skelbimas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Skelbimas.findAll", query = "SELECT s FROM Skelbimas s"),
    @NamedQuery(name = "Skelbimas.findById", query = "SELECT s FROM Skelbimas s WHERE s.id = :id"),
    @NamedQuery(name = "Skelbimas.findByApra\u0161ymas", query = "SELECT s FROM Skelbimas s WHERE s.apra\u0161ymas = :apra\u0161ymas"),
    @NamedQuery(name = "Skelbimas.findByKaina", query = "SELECT s FROM Skelbimas s WHERE s.kaina = :kaina")})
public class Skelbimas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Apra\u0161ymas")
    private String aprašymas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Kaina")
    private int kaina;
    @JoinColumn(name = "Naudotojas_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Naudotojas naudotojasID;
    @JoinColumn(name = "Naudotojas\u012erankiai_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Naudotojasįrankiai naudotojasĮrankiaiID;

    public Skelbimas() {
    }

    public Skelbimas(Integer id) {
        this.id = id;
    }

    public Skelbimas(Integer id, String aprašymas, int kaina) {
        this.id = id;
        this.aprašymas = aprašymas;
        this.kaina = kaina;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAprašymas() {
        return aprašymas;
    }

    public void setAprašymas(String aprašymas) {
        this.aprašymas = aprašymas;
    }

    public int getKaina() {
        return kaina;
    }

    public void setKaina(int kaina) {
        this.kaina = kaina;
    }

    public Naudotojas getNaudotojasID() {
        return naudotojasID;
    }

    public void setNaudotojasID(Naudotojas naudotojasID) {
        this.naudotojasID = naudotojasID;
    }

    public Naudotojasįrankiai getNaudotojasĮrankiaiID() {
        return naudotojasĮrankiaiID;
    }

    public void setNaudotojasĮrankiaiID(Naudotojasįrankiai naudotojasĮrankiaiID) {
        this.naudotojasĮrankiaiID = naudotojasĮrankiaiID;
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
        if (!(object instanceof Skelbimas)) {
            return false;
        }
        Skelbimas other = (Skelbimas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.avisockas.FishWebService.Skelbimas[ id=" + id + " ]";
    }
    
}
