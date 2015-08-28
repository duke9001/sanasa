/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanasa.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author uditha dissanayake
 * @version 1.0
 */
@Entity
@Table(name = "transaction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transaction.findAll", query = "SELECT t FROM Transaction t"),
    @NamedQuery(name = "Transaction.findByTransactionId", query = "SELECT t FROM Transaction t WHERE t.transactionId = :transactionId"),
    @NamedQuery(name = "Transaction.findByDeposit", query = "SELECT t FROM Transaction t WHERE t.deposit = :deposit"),
    @NamedQuery(name = "Transaction.findByBalance", query = "SELECT t FROM Transaction t WHERE t.balance = :balance"),
    @NamedQuery(name = "Transaction.findByDate", query = "SELECT t FROM Transaction t WHERE t.date = :date"),
    @NamedQuery(name = "Transaction.findByRecieptNumber", query = "SELECT t FROM Transaction t WHERE t.recieptNumber = :recieptNumber")})
public class Transaction implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "transactionId")
    private Integer transactionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "deposit")
    private double deposit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "balance")
    private double balance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "recieptNumber")
    private String recieptNumber;
    @JoinColumn(name = "staffId", referencedColumnName = "staffId")
    @ManyToOne(optional = false)
    private Staff staffId;
    @JoinColumn(name = "accountNumber", referencedColumnName = "accountNumber")
    @ManyToOne(optional = false)
    private Account accountNumber;

    public Transaction() {
    }

    public Transaction(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Transaction(Integer transactionId, double deposit, double balance, Date date, String recieptNumber) {
        this.transactionId = transactionId;
        this.deposit = deposit;
        this.balance = balance;
        this.date = date;
        this.recieptNumber = recieptNumber;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRecieptNumber() {
        return recieptNumber;
    }

    public void setRecieptNumber(String recieptNumber) {
        this.recieptNumber = recieptNumber;
    }

    public Staff getStaffId() {
        return staffId;
    }

    public void setStaffId(Staff staffId) {
        this.staffId = staffId;
    }

    public Account getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Account accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transactionId != null ? transactionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaction)) {
            return false;
        }
        Transaction other = (Transaction) object;
        if ((this.transactionId == null && other.transactionId != null) || (this.transactionId != null && !this.transactionId.equals(other.transactionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sanasa.entity.Transaction[ transactionId=" + transactionId + " ]";
    }
    
}
