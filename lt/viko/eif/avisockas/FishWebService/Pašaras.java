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
@Table(name = "pa\u0161aras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pa\u0161aras.findAll", query = "SELECT p FROM Pa\u0161aras p"),
    @NamedQuery(name = "Pa\u0161aras.findById", query = "SELECT p FROM Pa\u0161aras p WHERE p.id = :id"),
    @NamedQuery(name = "Pa\u0161aras.findByPavadinimas", query = "SELECT p FROM Pa\u0161aras p WHERE p.pavadinimas = :pavadinimas"),
    @NamedQuery(name = "Pa\u0161aras.findByTipas", query = "SELECT p FROM Pa\u0161aras p WHERE p.tipas = :tipas")})
public class Pašaras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Pavadinimas")
    private String pavadinimas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Tipas")
    private String tipas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pa\u0161arasID")
    private Collection<Naudotipašarai> naudotipašaraiCollection;

    public Pašaras() {
    }

    public Pašaras(Integer id) {
        this.id = id;
    }

    public Pašaras(Integer id, String pavadinimas, String tipas) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.tipas = tipas;
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

    public String getTipas() {
        return tipas;
    }

    public void setTipas(String tipas) {
        this.tipas = tipas;
    }

    @XmlTransient
    public Collection<Naudotipašarai> getNaudotipašaraiCollection() {
        return naudotipašaraiCollection;
    }

    public void setNaudotipašaraiCollection(Collection<Naudotipašarai> naudotipašaraiCollection) {
        this.naudotipašaraiCollection = naudotipašaraiCollection;
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
        if (!(object instanceof Pašaras)) {
            return false;
        }
        Pašaras other = (Pašaras) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.avisockas.FishWebService.Pa\u0161aras[ id=" + id + " ]";
    }
    
}
