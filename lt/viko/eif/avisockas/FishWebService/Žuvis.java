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
@Table(name = "\u017euvis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "\u017duvis.findAll", query = "SELECT \u017e FROM \u017duvis \u017e"),
    @NamedQuery(name = "\u017duvis.findById", query = "SELECT \u017e FROM \u017duvis \u017e WHERE \u017e.id = :id"),
    @NamedQuery(name = "\u017duvis.findByPavadinimas", query = "SELECT \u017e FROM \u017duvis \u017e WHERE \u017e.pavadinimas = :pavadinimas")})
public class Žuvis implements Serializable {

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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "\u017euvisID")
    private Collection<Pagautažuvis> pagautažuvisCollection;

    public Žuvis() {
    }

    public Žuvis(Integer id) {
        this.id = id;
    }

    public Žuvis(Integer id, String pavadinimas) {
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
    public Collection<Pagautažuvis> getPagautažuvisCollection() {
        return pagautažuvisCollection;
    }

    public void setPagautažuvisCollection(Collection<Pagautažuvis> pagautažuvisCollection) {
        this.pagautažuvisCollection = pagautažuvisCollection;
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
        if (!(object instanceof Žuvis)) {
            return false;
        }
        Žuvis other = (Žuvis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.avisockas.FishWebService.\u017duvis[ id=" + id + " ]";
    }
    
}
