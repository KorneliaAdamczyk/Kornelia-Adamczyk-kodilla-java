package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class Facade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> searching(String arg) {
        return companyDao.search(arg);
    }

    public List<Employee>searchingEmployee(String arg){return employeeDao.searchEmployee(arg);}

}

