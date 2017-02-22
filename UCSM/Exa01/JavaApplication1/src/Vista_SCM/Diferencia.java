/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista_SCM;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author cristopher
 */
@Entity
@Table(name = "diferencia", catalog = "scm", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Diferencia.findAll", query = "SELECT d FROM Diferencia d"),
    @NamedQuery(name = "Diferencia.findByIddif", query = "SELECT d FROM Diferencia d WHERE d.iddif = :iddif"),
    @NamedQuery(name = "Diferencia.findByIdlinea", query = "SELECT d FROM Diferencia d WHERE d.idlinea = :idlinea"),
    @NamedQuery(name = "Diferencia.findByCaracterinicio", query = "SELECT d FROM Diferencia d WHERE d.caracterinicio = :caracterinicio"),
    @NamedQuery(name = "Diferencia.findByCaracterfin", query = "SELECT d FROM Diferencia d WHERE d.caracterfin = :caracterfin")})
public class Diferencia implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "iddif")
    private String iddif;
    @Column(name = "idlinea")
    private String idlinea;
    @Column(name = "caracterinicio")
    private String caracterinicio;
    @Column(name = "caracterfin")
    private String caracterfin;

    public Diferencia() {
    }

    public Diferencia(String iddif) {
        this.iddif = iddif;
    }

    public String getIddif() {
        return iddif;
    }

    public void setIddif(String iddif) {
        String oldIddif = this.iddif;
        this.iddif = iddif;
        changeSupport.firePropertyChange("iddif", oldIddif, iddif);
    }

    public String getIdlinea() {
        return idlinea;
    }

    public void setIdlinea(String idlinea) {
        String oldIdlinea = this.idlinea;
        this.idlinea = idlinea;
        changeSupport.firePropertyChange("idlinea", oldIdlinea, idlinea);
    }

    public String getCaracterinicio() {
        return caracterinicio;
    }

    public void setCaracterinicio(String caracterinicio) {
        String oldCaracterinicio = this.caracterinicio;
        this.caracterinicio = caracterinicio;
        changeSupport.firePropertyChange("caracterinicio", oldCaracterinicio, caracterinicio);
    }

    public String getCaracterfin() {
        return caracterfin;
    }

    public void setCaracterfin(String caracterfin) {
        String oldCaracterfin = this.caracterfin;
        this.caracterfin = caracterfin;
        changeSupport.firePropertyChange("caracterfin", oldCaracterfin, caracterfin);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddif != null ? iddif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diferencia)) {
            return false;
        }
        Diferencia other = (Diferencia) object;
        if ((this.iddif == null && other.iddif != null) || (this.iddif != null && !this.iddif.equals(other.iddif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vista_SCM.Diferencia[ iddif=" + iddif + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
