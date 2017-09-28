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
@Table(name = "vilao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vilao.findAll", query = "SELECT v FROM Vilao v")
    , @NamedQuery(name = "Vilao.findByIdVilao", query = "SELECT v FROM Vilao v WHERE v.idVilao = :idVilao")
    , @NamedQuery(name = "Vilao.findByNomeVilao", query = "SELECT v FROM Vilao v WHERE v.nomeVilao = :nomeVilao")
    , @NamedQuery(name = "Vilao.findBySexoVilao", query = "SELECT v FROM Vilao v WHERE v.sexoVilao = :sexoVilao")
    , @NamedQuery(name = "Vilao.findByNomeRealVilao", query = "SELECT v FROM Vilao v WHERE v.nomeRealVilao = :nomeRealVilao")
    , @NamedQuery(name = "Vilao.findByDescricaoVilao", query = "SELECT v FROM Vilao v WHERE v.descricaoVilao = :descricaoVilao")
    , @NamedQuery(name = "Vilao.findByImagemVilao", query = "SELECT v FROM Vilao v WHERE v.imagemVilao = :imagemVilao")})
public class Vilao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idVilao")
    private Integer idVilao;
    @Size(max = 45)
    @Column(name = "NomeVilao")
    private String nomeVilao;
    @Size(max = 45)
    @Column(name = "SexoVilao")
    private String sexoVilao;
    @Size(max = 45)
    @Column(name = "NomeRealVilao")
    private String nomeRealVilao;
    @Size(max = 500)
    @Column(name = "DescricaoVilao")
    private String descricaoVilao;
    @Size(max = 300)
    @Column(name = "ImagemVilao")
    private String imagemVilao;

    public Vilao() {
    }

    public Vilao(Integer idVilao) {
        this.idVilao = idVilao;
    }

    public Integer getIdVilao() {
        return idVilao;
    }

    public void setIdVilao(Integer idVilao) {
        this.idVilao = idVilao;
    }

    public String getNomeVilao() {
        return nomeVilao;
    }

    public void setNomeVilao(String nomeVilao) {
        this.nomeVilao = nomeVilao;
    }

    public String getSexoVilao() {
        return sexoVilao;
    }

    public void setSexoVilao(String sexoVilao) {
        this.sexoVilao = sexoVilao;
    }

    public String getNomeRealVilao() {
        return nomeRealVilao;
    }

    public void setNomeRealVilao(String nomeRealVilao) {
        this.nomeRealVilao = nomeRealVilao;
    }

    public String getDescricaoVilao() {
        return descricaoVilao;
    }

    public void setDescricaoVilao(String descricaoVilao) {
        this.descricaoVilao = descricaoVilao;
    }

    public String getImagemVilao() {
        return imagemVilao;
    }

    public void setImagemVilao(String imagemVilao) {
        this.imagemVilao = imagemVilao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVilao != null ? idVilao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vilao)) {
            return false;
        }
        Vilao other = (Vilao) object;
        if ((this.idVilao == null && other.idVilao != null) || (this.idVilao != null && !this.idVilao.equals(other.idVilao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.inatel.ac.model.Vilao[ idVilao=" + idVilao + " ]";
    }
    
}
