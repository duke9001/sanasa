/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanasa.model;

import com.sanasa.entity.Account;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author uditha dissanayake
 * @version 1.0
 */
@Stateless
public class AccountFacade extends AbstractFacade<Account> {
    @PersistenceContext(unitName = "Sanasa-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountFacade() {
        super(Account.class);
    }
    
}
