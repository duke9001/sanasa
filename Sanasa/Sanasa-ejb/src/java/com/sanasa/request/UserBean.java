package com.sanasa.request;

import com.sanasa.entity.User;
import com.sanasa.exception.UserDataNotFoundException;
import com.sanasa.model.UserFacade;
import com.sanasa.util.UserDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * @author uditha dissanayake
 * @version 1.0
 */
@Stateless
public class UserBean implements UserBeanRemote {
    @EJB
    private UserFacade userFacade;

    User user = new User();
    UserDetails userDetails = new UserDetails();
    
    //add new user
    @Override
    public void add(String nic, String fname, String lname, String address, int contact) {
        user.setNic(nic);
        user.setFirstName(fname);
        user.setLastName(lname);
        user.setAddress(address);
        user.setContactNumber(contact);
        user.setPasswrod("123");
        userFacade.create(user);
    }

    //update current user
    @Override
    public void update(String nic, String fname, String lname, String address, int contact) {
        user.setNic(nic);
        user.setFirstName(fname);
        user.setLastName(lname);
        user.setAddress(address);
        user.setContactNumber(contact);
        
        userFacade.edit(user);
    }

    //delete current  user
    @Override
    public void delete(String nic) {
        user.setNic(nic);
        userFacade.remove(user);
    }

    //find all user details
    @Override
    public String[] findUser(String nic) {
        user = userFacade.find(nic);
        Integer contact=user.getContactNumber();
        String[] arr={user.getNic(),user.getFirstName(),user.getLastName(),
            user.getAddress(),contact.toString()};
        return arr;
    }

 
   

   

    
    
    
    
    
    
    
    
  

}
