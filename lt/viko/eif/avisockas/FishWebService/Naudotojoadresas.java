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
@Table(name = "naudotojoadresas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Naudotojoadresas.findAll", query = "SELECT n FROM Naudotojoadresas n"),
    @NamedQuery(name = "Naudotojoadresas.findById", query = "SELECT n FROM Naudotojoadresas n WHERE n.id = :id")})
public class Naudotojoadresas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "Adresas_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Adresas adresasID;
    @JoinColumn(name = "Naudotojas_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Naudotojas naudotojasID;

    public Naudotojoadresas() {
    }

    public Naudotojoadresas(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Adresas getAdresasID() {
        return adresasID;
    }

    public void setAdresasID(Adresas adresasID) {
        this.adresasID = adresasID;
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
        if (!(object instanceof Naudotojoadresas)) {
            return false;
        }
        Naudotojoadresas other = (Naudotojoadresas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.avisockas.FishWebService.Naudotojoadresas[ id=" + id + " ]";
    }
    
}
