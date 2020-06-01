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
@Table(name = "\u017e\u016bkl\u0117sdalyviai")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "\u017d\u016bkl\u0117sdalyviai.findAll", query = "SELECT \u017e FROM \u017d\u016bkl\u0117sdalyviai \u017e"),
    @NamedQuery(name = "\u017d\u016bkl\u0117sdalyviai.findById", query = "SELECT \u017e FROM \u017d\u016bkl\u0117sdalyviai \u017e WHERE \u017e.id = :id")})
public class Žūklėsdalyviai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "Naudotojas_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Naudotojas naudotojasID;
    @JoinColumn(name = "\u017d\u016bkl\u0117_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Žūklė žūklėID;

    public Žūklėsdalyviai() {
    }

    public Žūklėsdalyviai(Integer id) {
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
        if (!(object instanceof Žūklėsdalyviai)) {
            return false;
        }
        Žūklėsdalyviai other = (Žūklėsdalyviai) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.avisockas.FishWebService.\u017d\u016bkl\u0117sdalyviai[ id=" + id + " ]";
    }
    
}
