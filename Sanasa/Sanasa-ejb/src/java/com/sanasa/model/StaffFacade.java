/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanasa.model;

import com.sanasa.entity.Staff;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author uditha dissanayake
 * @version 1.0
 */
@Stateless
public class StaffFacade extends AbstractFacade<Staff> {
    @PersistenceContext(unitName = "Sanasa-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StaffFacade() {
        super(Staff.class);
    }
    
}
