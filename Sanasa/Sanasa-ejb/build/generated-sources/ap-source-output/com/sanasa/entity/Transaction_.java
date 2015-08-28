package com.sanasa.entity;

import com.sanasa.entity.Account;
import com.sanasa.entity.Staff;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-08-25T19:59:43")
@StaticMetamodel(Transaction.class)
public class Transaction_ { 

    public static volatile SingularAttribute<Transaction, Double> balance;
    public static volatile SingularAttribute<Transaction, Account> accountNumber;
    public static volatile SingularAttribute<Transaction, Integer> transactionId;
    public static volatile SingularAttribute<Transaction, Staff> staffId;
    public static volatile SingularAttribute<Transaction, Double> deposit;
    public static volatile SingularAttribute<Transaction, Date> date;
    public static volatile SingularAttribute<Transaction, String> recieptNumber;

}