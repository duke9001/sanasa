/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanasa.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author uditha dissanayake
 * @version 1.0
 */
@Entity
@Table(name = "account")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a"),
    @NamedQuery(name = "Account.findByAccountNumber", query = "SELECT a FROM Account a WHERE a.accountNumber = :accountNumber"),
    @NamedQuery(name = "Account.findByAccountType", query = "SELECT a FROM Account a WHERE a.accountType = :accountType"),
    @NamedQuery(name = "Account.findByLoanBalance", query = "SELECT a FROM Account a WHERE a.loanBalance = :loanBalance")})
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "accountNumber")
    private String accountNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "accountType")
    private String accountType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "loan_balance")
    private double loanBalance;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accountNumber")
    private List<Transaction> transactionList;
    @JoinColumn(name = "nic", referencedColumnName = "nic")
    @ManyToOne(optional = false)
    private User nic;

    public Account() {
    }

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Account(String accountNumber, String accountType, double loanBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.loanBalance = loanBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getLoanBalance() {
        return loanBalance;
    }

    public void setLoanBalance(double loanBalance) {
        this.loanBalance = loanBalance;
    }

    @XmlTransient
    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public User getNic() {
        return nic;
    }

    public void setNic(User nic) {
        this.nic = nic;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountNumber != null ? accountNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.accountNumber == null && other.accountNumber != null) || (this.accountNumber != null && !this.accountNumber.equals(other.accountNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sanasa.entity.Account[ accountNumber=" + accountNumber + " ]";
    }
    
}
