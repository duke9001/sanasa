/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanasa.model;

import com.sanasa.entity.Transaction;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author uditha dissanayake
 * @version 1.0
 */
@Stateless
public class TransactionFacade extends AbstractFacade<Transaction> {
    @PersistenceContext(unitName = "Sanasa-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TransactionFacade() {
        super(Transaction.class);
    }
    
}
