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
@Table(name = "documento", catalog = "scm", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Documento.findAll", query = "SELECT d FROM Documento d"),
    @NamedQuery(name = "Documento.findByIddoc", query = "SELECT d FROM Documento d WHERE d.iddoc = :iddoc"),
    @NamedQuery(name = "Documento.findByNombre", query = "SELECT d FROM Documento d WHERE d.nombre = :nombre"),
    @NamedQuery(name = "Documento.findByUltimaversion", query = "SELECT d FROM Documento d WHERE d.ultimaversion = :ultimaversion")})
public class Documento implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "iddoc")
    private String iddoc;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "ultimaversion")
    private Integer ultimaversion;

    public Documento() {
    }

    public Documento(String iddoc) {
        this.iddoc = iddoc;
    }

    public String getIddoc() {
        return iddoc;
    }

    public void setIddoc(String iddoc) {
        String oldIddoc = this.iddoc;
        this.iddoc = iddoc;
        changeSupport.firePropertyChange("iddoc", oldIddoc, iddoc);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public Integer getUltimaversion() {
        return ultimaversion;
    }

    public void setUltimaversion(Integer ultimaversion) {
        Integer oldUltimaversion = this.ultimaversion;
        this.ultimaversion = ultimaversion;
        changeSupport.firePropertyChange("ultimaversion", oldUltimaversion, ultimaversion);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddoc != null ? iddoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documento)) {
            return false;
        }
        Documento other = (Documento) object;
        if ((this.iddoc == null && other.iddoc != null) || (this.iddoc != null && !this.iddoc.equals(other.iddoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vista_SCM.Documento[ iddoc=" + iddoc + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
