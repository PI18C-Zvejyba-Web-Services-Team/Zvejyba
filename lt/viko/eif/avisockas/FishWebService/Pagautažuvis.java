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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Andrius
 */
@Entity
@Table(name = "pagauta\u017euvis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagauta\u017euvis.findAll", query = "SELECT p FROM Pagauta\u017euvis p"),
    @NamedQuery(name = "Pagauta\u017euvis.findById", query = "SELECT p FROM Pagauta\u017euvis p WHERE p.id = :id"),
    @NamedQuery(name = "Pagauta\u017euvis.findBySvoris", query = "SELECT p FROM Pagauta\u017euvis p WHERE p.svoris = :svoris")})
public class Pagautažuvis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Svoris")
    private int svoris;
    @JoinColumn(name = "\u017duvis_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Žuvis žuvisID;
    @JoinColumn(name = "\u017d\u016bkl\u0117_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Žūklė žūklėID;

    public Pagautažuvis() {
    }

    public Pagautažuvis(Integer id) {
        this.id = id;
    }

    public Pagautažuvis(Integer id, int svoris) {
        this.id = id;
        this.svoris = svoris;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getSvoris() {
        return svoris;
    }

    public void setSvoris(int svoris) {
        this.svoris = svoris;
    }

    public Žuvis getŽuvisID() {
        return žuvisID;
    }

    public void setŽuvisID(Žuvis žuvisID) {
        this.žuvisID = žuvisID;
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
        if (!(object instanceof Pagautažuvis)) {
            return false;
        }
        Pagautažuvis other = (Pagautažuvis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.avisockas.FishWebService.Pagauta\u017euvis[ id=" + id + " ]";
    }
    
}
