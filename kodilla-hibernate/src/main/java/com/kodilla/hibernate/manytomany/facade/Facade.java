package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class Facade {

    private String arg;
    @Autowired
    private CompanyDao companyDao;

    public List<Company> searching(String arg) {
        return companyDao.search();
    }

}

