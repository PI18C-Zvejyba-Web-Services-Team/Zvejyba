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
@Table(name = "orosalygos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orosalygos.findAll", query = "SELECT o FROM Orosalygos o"),
    @NamedQuery(name = "Orosalygos.findById", query = "SELECT o FROM Orosalygos o WHERE o.id = :id"),
    @NamedQuery(name = "Orosalygos.findByApib\u016bdinimas", query = "SELECT o FROM Orosalygos o WHERE o.apib\u016bdinimas = :apib\u016bdinimas")})
public class Orosalygos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Apib\u016bdinimas")
    private String apibūdinimas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "oroSalygosID")
    private Collection<Žūklė> žūklėCollection;

    public Orosalygos() {
    }

    public Orosalygos(Integer id) {
        this.id = id;
    }

    public Orosalygos(Integer id, String apibūdinimas) {
        this.id = id;
        this.apibūdinimas = apibūdinimas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApibūdinimas() {
        return apibūdinimas;
    }

    public void setApibūdinimas(String apibūdinimas) {
        this.apibūdinimas = apibūdinimas;
    }

    @XmlTransient
    public Collection<Žūklė> getŽūklėCollection() {
        return žūklėCollection;
    }

    public void setŽūklėCollection(Collection<Žūklė> žūklėCollection) {
        this.žūklėCollection = žūklėCollection;
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
        if (!(object instanceof Orosalygos)) {
            return false;
        }
        Orosalygos other = (Orosalygos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.avisockas.FishWebService.Orosalygos[ id=" + id + " ]";
    }
    
}
