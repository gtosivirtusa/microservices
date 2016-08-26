package com.virtusa.microservices.data.model;

import com.google.gson.annotations.Expose;

import java.sql.Date;

/**
 * Created by DDEZOYSA on 8/26/2016.
 */
public class Transaction {

    @Expose
    private int transaction_id;
    @Expose
    private Date transaction_date;
    private Date trans_time;
    @Expose
    private int sender_acct_id;
    @Expose
    private int receiver_acct_id;
    @Expose
    private int transaction_amt;
    @Expose
    private int Transaction_type;
    @Expose
    private int sender_bank_id;
    private int receiver_bank_id;
    private String Transaction;
    private String to_bank_location;
    @Expose
    private int swift_code;
    private String swift_code_trace;
    @Expose
    private String purpose;
    private String status;

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

    public Date getTrans_time() {
        return trans_time;
    }

    public void setTrans_time(Date trans_time) {
        this.trans_time = trans_time;
    }

    public int getSender_acct_id() {
        return sender_acct_id;
    }

    public void setSender_acct_id(int sender_acct_id) {
        this.sender_acct_id = sender_acct_id;
    }

    public int getReceiver_acct_id() {
        return receiver_acct_id;
    }

    public void setReceiver_acct_id(int receiver_acct_id) {
        this.receiver_acct_id = receiver_acct_id;
    }

    public int getTransaction_amt() {
        return transaction_amt;
    }

    public void setTransaction_amt(int transaction_amt) {
        this.transaction_amt = transaction_amt;
    }

    public int getTransaction_type() {
        return Transaction_type;
    }

    public void setTransaction_type(int transaction_type) {
        Transaction_type = transaction_type;
    }

    public int getSender_bank_id() {
        return sender_bank_id;
    }

    public void setSender_bank_id(int sender_bank_id) {
        this.sender_bank_id = sender_bank_id;
    }

    public int getReceiver_bank_id() {
        return receiver_bank_id;
    }

    public void setReceiver_bank_id(int receiver_bank_id) {
        this.receiver_bank_id = receiver_bank_id;
    }

    public String getTransaction() {
        return Transaction;
    }

    public void setTransaction(String transaction) {
        Transaction = transaction;
    }

    public String getTo_bank_location() {
        return to_bank_location;
    }

    public void setTo_bank_location(String to_bank_location) {
        this.to_bank_location = to_bank_location;
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
}
