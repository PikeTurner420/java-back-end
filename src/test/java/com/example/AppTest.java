package com.example;


import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
import com.infobasic.restapitemplate.model.Company;

import com.infobasic.restapitemplate.util.ConnectionManager;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void dioCane()
    {
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
          Company c = new Company(id, employees_n, name, country, site, iban, email, "bbb");
            list.add(c);
         }
        System.out.println(list);
      } catch (SQLException e) {
         e.printStackTrace();
      } 
    }
}
