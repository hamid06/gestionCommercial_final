/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import entities.LigneDevis;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Lidrissi Hamid
 */
@Stateless
public class LigneDevisFacade extends AbstractFacade<LigneDevis> {

    @PersistenceContext(unitName = "gestionCommercial_finalPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LigneDevisFacade() {
        super(LigneDevis.class);
    }
    
}
