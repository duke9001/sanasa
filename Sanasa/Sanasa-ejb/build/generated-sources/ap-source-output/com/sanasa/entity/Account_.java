package com.sanasa.entity;

import com.sanasa.entity.Transaction;
import com.sanasa.entity.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-08-25T19:59:43")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, String> accountNumber;
    public static volatile SingularAttribute<Account, User> nic;
    public static volatile SingularAttribute<Account, String> accountType;
    public static volatile ListAttribute<Account, Transaction> transactionList;
    public static volatile SingularAttribute<Account, Double> loanBalance;

}