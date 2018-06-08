package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    public Facade facade;

    @Autowired
    public CompanyDao companyDao;

    @Autowired
    public EmployeeDao employeeDao;

    @Test
    public void testFacade() {

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarcksky = new Employee("Stephanie", "Clarcksky");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        employeeDao.save(stephanieClarcksky);
        int stephanieClarckskyId = stephanieClarcksky.getId();
        employeeDao.save(lindaKovalsky);
        int lindaKovalskyId = lindaKovalsky.getId();

        List<Company> res = facade.searching("er");
        List<Employee> result = facade.searchingEmployee("sky");

        //Then
        Assert.assertEquals(2, res.size());
        Assert.assertEquals(2, result.size());

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
            employeeDao.deleteById(johnSmithId);
            employeeDao.deleteById(stephanieClarckskyId);
            employeeDao.deleteById(lindaKovalskyId);

        } catch (Exception e)

        {
        }
    }
}