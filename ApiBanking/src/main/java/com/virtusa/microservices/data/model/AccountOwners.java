package com.virtusa.microservices.data.model;

import java.sql.Date;

/**
 * Created by DDEZOYSA on 8/26/2016.
 */
public class AccountOwners {

    private int account_owner_id_number;
    private int account_id;
    private int party_id;
    private String AccountRefNumber;
    private String IsOnlineAccessEnabled;
    private double percentage_of_share;
    private String status;
    private Date alter_date;
    private Date start_date;
    private Date end_date;

    public int getAccount_owner_id_number() {
        return account_owner_id_number;
    }

    public void setAccount_owner_id_number(int account_owner_id_number) {
        this.account_owner_id_number = account_owner_id_number;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getParty_id() {
        return party_id;
    }

    public void setParty_id(int party_id) {
        this.party_id = party_id;
    }

    public String getAccountRefNumber() {
        return AccountRefNumber;
    }

    public void setAccountRefNumber(String accountRefNumber) {
        AccountRefNumber = accountRefNumber;
    }

    public String getIsOnlineAccessEnabled() {
        return IsOnlineAccessEnabled;
    }

    public void setIsOnlineAccessEnabled(String isOnlineAccessEnabled) {
        IsOnlineAccessEnabled = isOnlineAccessEnabled;
    }

    public double getPercentage_of_share() {
        return percentage_of_share;
    }

    public void setPercentage_of_share(double percentage_of_share) {
        this.percentage_of_share = percentage_of_share;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getAlter_date() {
        return alter_date;
    }

    public void setAlter_date(Date alter_date) {
        this.alter_date = alter_date;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
}
