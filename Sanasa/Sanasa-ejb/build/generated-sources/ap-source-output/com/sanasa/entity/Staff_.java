package com.sanasa.entity;

import com.sanasa.entity.Transaction;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-08-25T19:59:43")
@StaticMetamodel(Staff.class)
public class Staff_ { 

    public static volatile SingularAttribute<Staff, Integer> staffId;
    public static volatile SingularAttribute<Staff, String> address;
    public static volatile SingularAttribute<Staff, String> name;
    public static volatile SingularAttribute<Staff, String> contactNo;
    public static volatile ListAttribute<Staff, Transaction> transactionList;
    public static volatile SingularAttribute<Staff, String> password;

}