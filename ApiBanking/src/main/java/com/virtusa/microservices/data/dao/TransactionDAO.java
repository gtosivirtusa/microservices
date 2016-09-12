package com.virtusa.microservices.data.dao;

import com.virtusa.microservices.data.connection.ConnectionFactory;
import com.virtusa.microservices.data.model.AccountOwner;
import com.virtusa.microservices.data.model.Transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TransactionDAO {

    public Transaction getTransactionById(int transaction_id){
        Transaction transaction = null;
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM SmartBankDb.Transaction where transaction_id=" + transaction_id + ";");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                transaction = new Transaction();
                transaction.setTransaction_id(resultSet.getInt("transaction_id"));
                transaction.setTransaction_date(resultSet.getDate("transaction_date"));
                transaction.setTrans_time(resultSet.getTime("trans_time"));
                transaction.setAcct_id(resultSet.getInt("sender_acct_id"));
                transaction.setCounterparty_acct_id(resultSet.getInt("receiver_acct_id"));
                transaction.setTransaction_amt(resultSet.getInt("transaction_amt"));
                transaction.setTransaction_type(resultSet.getString("Transaction_type"));
                transaction.setAcct_id(resultSet.getInt("sender_bank_id"));
                transaction.setCounterparty_bank_id(resultSet.getInt("receiver_bank_id"));
                transaction.setBank_location(resultSet.getString("from_bank_location"));
                transaction.setCounterparty_bank_location(resultSet.getString("to_bank_location"));
                transaction.setSwift_code(resultSet.getInt("swift_code"));
                transaction.setSwift_code_trace(resultSet.getString("swift_code_trace"));
                transaction.setPurpose(resultSet.getString("purpose"));
                transaction.setStatus(resultSet.getString("status"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TransactionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return transaction;
    }

    public List<Transaction> getTransactionByAccountId(int acct_id, String fromDate, String toDate, int startIndex, int pageSize){
        List<Transaction> transactions = new ArrayList<>();
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM SmartBankDb.Transaction as t where t.acct_id=" + acct_id + " and (t.transaction_date BETWEEN \"" + fromDate  + "\" AND \"" + toDate + "\") LIMIT " + startIndex + "," + pageSize + ";");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Transaction transaction = new Transaction();
                transaction.setTransaction_id(resultSet.getInt("transaction_id"));
                transaction.setTransaction_date(resultSet.getDate("transaction_date"));
                transaction.setTrans_time(resultSet.getTime("trans_time"));
                transaction.setAcct_id(resultSet.getInt("acct_id"));
                transaction.setCounterparty_acct_id(resultSet.getInt("counterparty_acct_id"));
                transaction.setTransaction_amt(resultSet.getInt("transaction_amt"));
                transaction.setTransaction_type(resultSet.getString("Transaction_type"));
                transaction.setAcct_id(resultSet.getInt("bank_id"));
                transaction.setCounterparty_bank_id(resultSet.getInt("counterparty_bank_id"));
                transaction.setBank_location(resultSet.getString("bank_location"));
                transaction.setCounterparty_bank_location(resultSet.getString("counterparty_bank_location"));
                transaction.setSwift_code(resultSet.getInt("swift_code"));
                transaction.setSwift_code_trace(resultSet.getString("swift_code_trace"));
                transaction.setPurpose(resultSet.getString("purpose"));
                transaction.setStatus(resultSet.getString("status"));
                transaction.setBalance(resultSet.getBigDecimal("balance"));
                transactions.add(transaction);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return transactions;
    }

    public List<AccountOwner> getCounterPartiesByPartyId(int party_id){
        List<AccountOwner> accountOwners = new ArrayList<>();
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM SmartBankDb.AccountOwners as aof INNER JOIN (SELECT DISTINCT t.counterparty_acct_id as counterparty_acct_id FROM SmartBankDb.Transaction as t INNER JOIN SmartBankDb.AccountOwners as ao ON t.acct_id=ao.account_id AND ao.party_id=" + party_id + ") as caid ON aof.account_id=caid.counterparty_acct_id;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                AccountOwner accountOwner = new AccountOwner();
                accountOwner.setAccount_owner_id_number(resultSet.getInt("account_owner_id_number"));
                accountOwner.setAccount_id(resultSet.getInt("account_id"));
                accountOwner.setParty_id(resultSet.getInt("party_id"));
                accountOwner.setAccountRefNumber(resultSet.getString("AccountRefNumber"));
                accountOwner.setIsOnlineAccessEnabled(resultSet.getString("IsOnlineAccessEnabled"));
                accountOwner.setPercentage_of_share(resultSet.getBigDecimal("percentage_of_share"));
                accountOwner.setStatus(resultSet.getString("status"));
                accountOwner.setAlter_date(resultSet.getDate("alter_date"));
                accountOwner.setStart_date(resultSet.getDate("start_date"));
                accountOwner.setEnd_date(resultSet.getDate("end_date"));
                accountOwners.add(accountOwner);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accountOwners;
    }
}
