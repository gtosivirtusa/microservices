package com.virtusa.microservices.data.dao;

import com.virtusa.microservices.data.connection.ConnectionFactory;
import com.virtusa.microservices.data.model.Bank;
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

    /*public List<Bank> getAllBanks() {
        List<Bank> banks = new ArrayList<>();
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM SmartBankDb.Banks;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Bank bank = new Bank();
                bank.setBank_id(resultSet.getInt("bank_id"));
                bank.setBank_reg_number(resultSet.getString("bank_reg_number"));
                bank.setBank_name(resultSet.getString("bank_name"));
                bank.setCountry(resultSet.getString("country"));
                bank.setRegistered_address(resultSet.getString("registered_address"));
                banks.add(bank);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TransactionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return banks;
    }*/


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
                transaction.setTrans_time(resultSet.getDate("trans_time"));
                transaction.setSender_acct_id(resultSet.getInt("sender_acct_id"));
                transaction.setReceiver_acct_id(resultSet.getInt("receiver_acct_id"));
                transaction.setTransaction_amt(resultSet.getInt("transaction_amt"));
                transaction.setTransaction_type(resultSet.getInt("Transaction_type"));
                transaction.setSender_acct_id(resultSet.getInt("sender_bank_id"));
                transaction.setReceiver_bank_id(resultSet.getInt("receiver_bank_id"));
                transaction.setTransaction(resultSet.getString("Transaction"));
                transaction.setTo_bank_location(resultSet.getString("to_bank_location"));
                transaction.setSwift_code(resultSet.getInt("swift_code"));
                transaction.setSwift_code_trace(resultSet.getString("swift_code_trace"));
                transaction.setPurpose(resultSet.getString("purpose"));
                transaction.setStatus(resultSet.getString("status"));            }
        } catch (SQLException ex) {
            Logger.getLogger(TransactionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return transaction;
    }

}
