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
@Table(name = "naudotipa\u0161arai")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Naudotipa\u0161arai.findAll", query = "SELECT n FROM Naudotipa\u0161arai n"),
    @NamedQuery(name = "Naudotipa\u0161arai.findById", query = "SELECT n FROM Naudotipa\u0161arai n WHERE n.id = :id")})
public class Naudotipašarai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "Pa\u0161aras_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Pašaras pašarasID;
    @JoinColumn(name = "\u017d\u016bkl\u0117_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Žūklė žūklėID;

    public Naudotipašarai() {
    }

    public Naudotipašarai(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pašaras getPašarasID() {
        return pašarasID;
    }

    public void setPašarasID(Pašaras pašarasID) {
        this.pašarasID = pašarasID;
    }

    public Žūklė getŽūklėID() {
        return žūklėID;
    }

    public void setŽūklėID(Žūklė žūklėID) {
        this.žūklėID = žūklėID;
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
        if (!(object instanceof Naudotipašarai)) {
            return false;
        }
        Naudotipašarai other = (Naudotipašarai) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.avisockas.FishWebService.Naudotipa\u0161arai[ id=" + id + " ]";
    }
    
}
