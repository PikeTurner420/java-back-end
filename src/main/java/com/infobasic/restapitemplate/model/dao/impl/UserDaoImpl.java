package com.infobasic.restapitemplate.model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.infobasic.restapitemplate.model.Company;
import com.infobasic.restapitemplate.model.Private;
import com.infobasic.restapitemplate.model.dao.UserDao;
import com.infobasic.restapitemplate.util.ConnectionManager;

public class UserDaoImpl implements UserDao {

    //User mi arriva dal service! 
    /*
    @Override
    public void save(User user) {
        Connection connection = ConnectionManager.getConnetion(); 
        
        try (PreparedStatement saveUserStatement = connection
                    .prepareStatement("INSERT INTO userTable ('username', 'email') VALUES (?,?")) {
                                            
            saveUserStatement.setString(1, user.getUsername()); // Sostituisco il PRIMO ? con lo username                                           
            saveUserStatement.setString(2, user.getEmail()); //  
            
            int rowInserted = saveUserStatement.executeUpdate(); 

            System.out.println("LOG: Inserimento di " + rowInserted + "righe" ); 


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    */

    @Override
    public ArrayList<Private> getAllPrivates() {
        Connection connection = ConnectionManager.getConnetion(); 
        try(
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM private");
        ) {	
            ArrayList<Private> list = new ArrayList<>();     
            while(rs.next()){
                String name = rs.getString("name");
                String country = rs.getString("country");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                String tel = rs.getString("tel");
                String iban = rs.getString("iban");
                int age = rs.getInt("age");
                int id = rs.getInt("id");
                
                Private c = new Private(id, name, surname, age, tel, country,  iban, email );
                list.add(c);
            }
            return list;
      } catch (SQLException e) {
         e.printStackTrace();
      } 
      return null;
    }

    @Override
    public ArrayList<Company> getAllCompanies() {
        Connection connection = ConnectionManager.getConnetion(); 
        try(
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM company");
        ) {	
            ArrayList<Company> list = new ArrayList<>();     
            while(rs.next()){
                String name = rs.getString("name");
                String country = rs.getString("country");
                String site = rs.getString("site");
                String email = rs.getString("email");
                String iban = rs.getString("iban");
                int employees_n = rs.getInt("employees_n");
                int id = rs.getInt("id");
                Company c = new Company(id, employees_n, name, country, site, iban, email, name);
                list.add(c);
            }
            return list;
      } catch (SQLException e) {
         e.printStackTrace();
      } 
      return null;
    }

    @Override
    public void deleteCompanyById(int id) {
        Connection connection = ConnectionManager.getConnetion(); 
        System.out.println(id);

        try(PreparedStatement deleteCompany = connection.prepareStatement("DELETE FROM company WHERE id = ?");
        PreparedStatement deleteCompanyPurchase = connection.prepareStatement("DELETE FROM company_purchase WHERE id_company = ?"))
        {
            deleteCompanyPurchase.setInt(1, id); 
            deleteCompanyPurchase.executeUpdate();
            deleteCompany.setInt(1, id); 
            deleteCompany.executeUpdate();
            
        } catch (SQLException e) {
         e.printStackTrace();
      } 
    }


    @Override
    public void deletePrivateById(int id) {
        Connection connection = ConnectionManager.getConnetion(); 
        System.out.println(id);

        try(PreparedStatement deleteCompany = connection.prepareStatement("DELETE FROM private WHERE id = ?");
        PreparedStatement deleteCompanyPurchase = connection.prepareStatement("DELETE FROM private_purchase WHERE id_private = ?"))
        {
            deleteCompanyPurchase.setInt(1, id); 
            deleteCompanyPurchase.executeUpdate();
            deleteCompany.setInt(1, id); 
            deleteCompany.executeUpdate();
            
        } catch (SQLException e) {
         e.printStackTrace();
      } 
    }
}
