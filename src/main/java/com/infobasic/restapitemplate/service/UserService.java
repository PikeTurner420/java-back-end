package com.infobasic.restapitemplate.service;

import java.util.List;

import com.infobasic.restapitemplate.model.Company;
import com.infobasic.restapitemplate.model.Private;
import com.infobasic.restapitemplate.model.dao.UserDao;
import com.infobasic.restapitemplate.model.dao.impl.UserDaoImpl;

public class UserService {
    UserDao userDao; 

    public UserService() {
 
        userDao = new UserDaoImpl(); 

    }

    public List<Private> getAllPrivates() {
        return userDao.getAllPrivates();
    }

    public List<Company> getAllCompanies() {
        return userDao.getAllCompanies();
    }


    public void deleteCompanyById(int id) {
        userDao.deleteCompanyById(id);
    }

    public void deletePrivateById(int id) {
        userDao.deletePrivateById(id);
    }

}
