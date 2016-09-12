package com.virtusa.microservices.data.model;

import com.google.gson.annotations.Expose;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by DDEZOYSA on 8/26/2016.
 */
public class Transaction {

    @Expose
    private int transaction_id;
    @Expose
    private Date transaction_date;
    @Expose
    private Time trans_time;
    @Expose
    private int acct_id;
    @Expose
    private int counterparty_acct_id;
    @Expose
    private int transaction_amt;
    @Expose
    private String Transaction_type;
    @Expose
    private int bank_id;
    @Expose
    private int counterparty_bank_id;
    @Expose
    private String bank_location;
    @Expose
    private String counterparty_bank_location;
    @Expose
    private int swift_code;
    @Expose
    private String swift_code_trace;
    @Expose
    private String purpose;
    @Expose
    private String status;
    @Expose
    private BigDecimal balance;

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public Date getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }

    public Time getTrans_time() {
        return trans_time;
    }

    public void setTrans_time(Time trans_time) {
        this.trans_time = trans_time;
    }

    public int getAcct_id() {
        return acct_id;
    }

    public void setAcct_id(int acct_id) {
        this.acct_id = acct_id;
    }

    public int getCounterparty_acct_id() {
        return counterparty_acct_id;
    }

    public void setCounterparty_acct_id(int counterparty_acct_id) {
        this.counterparty_acct_id = counterparty_acct_id;
    }

    public int getTransaction_amt() {
        return transaction_amt;
    }

    public void setTransaction_amt(int transaction_amt) {
        this.transaction_amt = transaction_amt;
    }

    public String getTransaction_type() {
        return Transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        Transaction_type = transaction_type;
    }

    public int getBank_id() {
        return bank_id;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    public int getCounterparty_bank_id() {
        return counterparty_bank_id;
    }

    public void setCounterparty_bank_id(int counterparty_bank_id) {
        this.counterparty_bank_id = counterparty_bank_id;
    }

    public String getBank_location() {
        return bank_location;
    }

    public void setBank_location(String bank_location) {
        this.bank_location = bank_location;
    }

    public String getCounterparty_bank_location() {
        return counterparty_bank_location;
    }

    public void setCounterparty_bank_location(String counterparty_bank_location) {
        this.counterparty_bank_location = counterparty_bank_location;
    }

    public int getSwift_code() {
        return swift_code;
    }

    public void setSwift_code(int swift_code) {
        this.swift_code = swift_code;
    }

    public String getSwift_code_trace() {
        return swift_code_trace;
    }

    public void setSwift_code_trace(String swift_code_trace) {
        this.swift_code_trace = swift_code_trace;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
