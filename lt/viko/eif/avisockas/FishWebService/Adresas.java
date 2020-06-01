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
@Table(name = "adresas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Adresas.findAll", query = "SELECT a FROM Adresas a"),
    @NamedQuery(name = "Adresas.findById", query = "SELECT a FROM Adresas a WHERE a.id = :id"),
    @NamedQuery(name = "Adresas.findBy\u0160alis", query = "SELECT a FROM Adresas a WHERE a.\u0161alis = :\u0161alis"),
    @NamedQuery(name = "Adresas.findByMiestas", query = "SELECT a FROM Adresas a WHERE a.miestas = :miestas"),
    @NamedQuery(name = "Adresas.findByGatv\u0117", query = "SELECT a FROM Adresas a WHERE a.gatv\u0117 = :gatv\u0117")})
public class Adresas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "\u0160alis")
    private String šalis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "Miestas")
    private String miestas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "Gatv\u0117")
    private String gatvė;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "adresasID")
    private Collection<Naudotojoadresas> naudotojoadresasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "adresasID")
    private Collection<Telkinys> telkinysCollection;

    public Adresas() {
    }

    public Adresas(Integer id) {
        this.id = id;
    }

    public Adresas(Integer id, String šalis, String miestas, String gatvė) {
        this.id = id;
        this.šalis = šalis;
        this.miestas = miestas;
        this.gatvė = gatvė;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getŠalis() {
        return šalis;
    }

    public void setŠalis(String šalis) {
        this.šalis = šalis;
    }

    public String getMiestas() {
        return miestas;
    }

    public void setMiestas(String miestas) {
        this.miestas = miestas;
    }

    public String getGatvė() {
        return gatvė;
    }

    public void setGatvė(String gatvė) {
        this.gatvė = gatvė;
    }

    @XmlTransient
    public Collection<Naudotojoadresas> getNaudotojoadresasCollection() {
        return naudotojoadresasCollection;
    }

    public void setNaudotojoadresasCollection(Collection<Naudotojoadresas> naudotojoadresasCollection) {
        this.naudotojoadresasCollection = naudotojoadresasCollection;
    }

    @XmlTransient
    public Collection<Telkinys> getTelkinysCollection() {
        return telkinysCollection;
    }

    public void setTelkinysCollection(Collection<Telkinys> telkinysCollection) {
        this.telkinysCollection = telkinysCollection;
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
        if (!(object instanceof Adresas)) {
            return false;
        }
        Adresas other = (Adresas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.avisockas.FishWebService.Adresas[ id=" + id + " ]";
    }
    
}
