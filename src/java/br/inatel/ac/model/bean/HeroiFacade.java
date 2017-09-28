/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.ac.model.bean;

import br.inatel.ac.model.Heroi;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author patri
 */
@Stateless
public class HeroiFacade extends AbstractFacade<Heroi> {

    @PersistenceContext(unitName = "DC2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HeroiFacade() {
        super(Heroi.class);
    }
    
}
