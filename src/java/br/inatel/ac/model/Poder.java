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
@Table(name = "poder")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Poder.findAll", query = "SELECT p FROM Poder p")
    , @NamedQuery(name = "Poder.findByIdPoder", query = "SELECT p FROM Poder p WHERE p.idPoder = :idPoder")
    , @NamedQuery(name = "Poder.findByNomePoder", query = "SELECT p FROM Poder p WHERE p.nomePoder = :nomePoder")
    , @NamedQuery(name = "Poder.findByDescricaoPoder", query = "SELECT p FROM Poder p WHERE p.descricaoPoder = :descricaoPoder")
    , @NamedQuery(name = "Poder.findByHeroiPoder", query = "SELECT p FROM Poder p WHERE p.heroiPoder = :heroiPoder")
    , @NamedQuery(name = "Poder.findByVilaoPoder", query = "SELECT p FROM Poder p WHERE p.vilaoPoder = :vilaoPoder")
    , @NamedQuery(name = "Poder.findByImagemPoder", query = "SELECT p FROM Poder p WHERE p.imagemPoder = :imagemPoder")})
public class Poder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPoder")
    private Integer idPoder;
    @Size(max = 45)
    @Column(name = "NomePoder")
    private String nomePoder;
    @Size(max = 500)
    @Column(name = "DescricaoPoder")
    private String descricaoPoder;
    @Size(max = 45)
    @Column(name = "HeroiPoder")
    private String heroiPoder;
    @Size(max = 45)
    @Column(name = "VilaoPoder")
    private String vilaoPoder;
    @Size(max = 300)
    @Column(name = "ImagemPoder")
    private String imagemPoder;

    public Poder() {
    }

    public Poder(Integer idPoder) {
        this.idPoder = idPoder;
    }

    public Integer getIdPoder() {
        return idPoder;
    }

    public void setIdPoder(Integer idPoder) {
        this.idPoder = idPoder;
    }

    public String getNomePoder() {
        return nomePoder;
    }

    public void setNomePoder(String nomePoder) {
        this.nomePoder = nomePoder;
    }

    public String getDescricaoPoder() {
        return descricaoPoder;
    }

    public void setDescricaoPoder(String descricaoPoder) {
        this.descricaoPoder = descricaoPoder;
    }

    public String getHeroiPoder() {
        return heroiPoder;
    }

    public void setHeroiPoder(String heroiPoder) {
        this.heroiPoder = heroiPoder;
    }

    public String getVilaoPoder() {
        return vilaoPoder;
    }

    public void setVilaoPoder(String vilaoPoder) {
        this.vilaoPoder = vilaoPoder;
    }

    public String getImagemPoder() {
        return imagemPoder;
    }

    public void setImagemPoder(String imagemPoder) {
        this.imagemPoder = imagemPoder;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPoder != null ? idPoder.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Poder)) {
            return false;
        }
        Poder other = (Poder) object;
        if ((this.idPoder == null && other.idPoder != null) || (this.idPoder != null && !this.idPoder.equals(other.idPoder))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.inatel.ac.model.Poder[ idPoder=" + idPoder + " ]";
    }
    
}
