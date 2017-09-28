/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.ac.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author patri
 */
@Entity
@Table(name = "heroi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Heroi.findAll", query = "SELECT h FROM Heroi h")
    , @NamedQuery(name = "Heroi.findByIdHeroi", query = "SELECT h FROM Heroi h WHERE h.idHeroi = :idHeroi")
    , @NamedQuery(name = "Heroi.findByNomeHeroi", query = "SELECT h FROM Heroi h WHERE h.nomeHeroi = :nomeHeroi")
    , @NamedQuery(name = "Heroi.findByNomeRealHeroi", query = "SELECT h FROM Heroi h WHERE h.nomeRealHeroi = :nomeRealHeroi")
    , @NamedQuery(name = "Heroi.findByDescricaoHeroi", query = "SELECT h FROM Heroi h WHERE h.descricaoHeroi = :descricaoHeroi")})
public class Heroi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idHeroi")
    private Integer idHeroi;
    @Size(max = 45)
    @Column(name = "NomeHeroi")
    private String nomeHeroi;
    @Size(max = 45)
    @Column(name = "NomeRealHeroi")
    private String nomeRealHeroi;
    @Size(max = 500)
    @Column(name = "DescricaoHeroi")
    private String descricaoHeroi;

    public Heroi() {
    }

    public Heroi(Integer idHeroi) {
        this.idHeroi = idHeroi;
    }

    public Integer getIdHeroi() {
        return idHeroi;
    }

    public void setIdHeroi(Integer idHeroi) {
        this.idHeroi = idHeroi;
    }

    public String getNomeHeroi() {
        return nomeHeroi;
    }

    public void setNomeHeroi(String nomeHeroi) {
        this.nomeHeroi = nomeHeroi;
    }

    public String getNomeRealHeroi() {
        return nomeRealHeroi;
    }

    public void setNomeRealHeroi(String nomeRealHeroi) {
        this.nomeRealHeroi = nomeRealHeroi;
    }

    public String getDescricaoHeroi() {
        return descricaoHeroi;
    }

    public void setDescricaoHeroi(String descricaoHeroi) {
        this.descricaoHeroi = descricaoHeroi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHeroi != null ? idHeroi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Heroi)) {
            return false;
        }
        Heroi other = (Heroi) object;
        if ((this.idHeroi == null && other.idHeroi != null) || (this.idHeroi != null && !this.idHeroi.equals(other.idHeroi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.inatel.ac.model.Heroi[ idHeroi=" + idHeroi + " ]";
    }
    
}
