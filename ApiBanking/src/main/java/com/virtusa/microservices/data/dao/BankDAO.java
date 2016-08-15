package com.virtusa.microservices.data.dao;

import com.virtusa.microservices.data.connection.ConnectionFactory;
import com.virtusa.microservices.data.model.Bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BankDAO {

    public List<Bank> getAll() {
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
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return banks;
    }

    public Bank get(int bank_id){
        Bank bank = null;
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM SmartBankDb.Banks where bank_id=" + bank_id + ";");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                bank = new Bank();
                bank.setBank_id(resultSet.getInt("bank_id"));
                bank.setBank_reg_number(resultSet.getString("bank_reg_number"));
                bank.setBank_name(resultSet.getString("bank_name"));
                bank.setCountry(resultSet.getString("country"));
                bank.setRegistered_address(resultSet.getString("registered_address"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bank;
    }
}
