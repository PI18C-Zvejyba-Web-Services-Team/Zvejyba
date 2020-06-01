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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Andrius
 */
@Entity
@Table(name = "administratorius")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administratorius.findAll", query = "SELECT a FROM Administratorius a"),
    @NamedQuery(name = "Administratorius.findById", query = "SELECT a FROM Administratorius a WHERE a.id = :id")})
public class Administratorius implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "Naudotojas_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Naudotojas naudotojasID;

    public Administratorius() {
    }

    public Administratorius(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Naudotojas getNaudotojasID() {
        return naudotojasID;
    }

    public void setNaudotojasID(Naudotojas naudotojasID) {
        this.naudotojasID = naudotojasID;
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
        if (!(object instanceof Administratorius)) {
            return false;
        }
        Administratorius other = (Administratorius) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.avisockas.FishWebService.Administratorius[ id=" + id + " ]";
    }
    
}
