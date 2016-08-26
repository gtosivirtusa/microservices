package com.virtusa.microservices.data.model;

/**
 * Created by DDEZOYSA on 8/26/2016.
 */
public class _AccountByPartyID {
    private int account_id;
    private int account_owner_id_number;
    private String AccountRefNumber;
    private int businessunit_id;
    private int bank_id;
    private int account_type_id;
    private double balance;

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getAccount_owner_id_number() {
        return account_owner_id_number;
    }

    public void setAccount_owner_id_number(int account_owner_id_number) {
        this.account_owner_id_number = account_owner_id_number;
    }

    public String getAccountRefNumber() {
        return AccountRefNumber;
    }

    public void setAccountRefNumber(String accountRefNumber) {
        AccountRefNumber = accountRefNumber;
    }

    public int getBusinessunit_id() {
        return businessunit_id;
    }

    public void setBusinessunit_id(int businessunit_id) {
        this.businessunit_id = businessunit_id;
    }

    public int getBank_id() {
        return bank_id;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    public int getAccount_type_id() {
        return account_type_id;
    }

    public void setAccount_type_id(int account_type_id) {
        this.account_type_id = account_type_id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
