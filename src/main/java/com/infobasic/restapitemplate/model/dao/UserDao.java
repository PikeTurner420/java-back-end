package com.infobasic.restapitemplate.model.dao;

import java.util.ArrayList;

import com.infobasic.restapitemplate.model.Company;
import com.infobasic.restapitemplate.model.Private;

public interface UserDao {

    public ArrayList<Company> getAllCompanies();

    public ArrayList<Private> getAllPrivates();
    
    public void deleteCompanyById(int id);

    public void deletePrivateById(int id);
    
}
