package com.sanasa.entity;

import com.sanasa.entity.Account;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-08-25T19:59:43")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> lastName;
    public static volatile SingularAttribute<User, Integer> contactNumber;
    public static volatile ListAttribute<User, Account> accountList;
    public static volatile SingularAttribute<User, String> address;
    public static volatile SingularAttribute<User, String> nic;
    public static volatile SingularAttribute<User, String> firstName;
    public static volatile SingularAttribute<User, String> passwrod;

}