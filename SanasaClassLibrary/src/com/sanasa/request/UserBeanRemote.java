/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanasa.request;


import com.sanasa.exception.UserDataNotFoundException;
import com.sanasaAppclient.util.UserDetails;
import java.util.List;
import javax.ejb.Remote;


/**
 * 
 * @author uditha dissanayake
 * @version 1.0
 */
@Remote
public interface UserBeanRemote {

    //add new user
    void add(String nic, String fname, String lname, String address, int contact)throws UserDataNotFoundException;

    //update current user
    void update(String nic, String fname, String lname, String address, int contact);

    //delete current  user
    void delete(String nic);

    //find all user details
    String[] findUser(String nic) ;

    

   
    
    
    

    
}
