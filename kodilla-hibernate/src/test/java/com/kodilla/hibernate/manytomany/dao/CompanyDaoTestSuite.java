package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
    @Test
    public void testNamedQueriesEmployee() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee martinSmith = new Employee("Martin", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");




        //When
        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int stephanieClarcksonId = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaKovalskyId = lindaKovalsky.getId();
        employeeDao.save(martinSmith);
        int martinSmithId = martinSmith.getId();
        List<Employee> resultEmployeeList = employeeDao.findEmployeeByLastname("Smith");

        //Then
        Assertions.assertEquals(2, resultEmployeeList.size());

        //CleanUp
        try {

            employeeDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }
    @Test
    public void testNamedQueriesCompanies() {
        //Given
        Company sqlExperts = new Company("SQL experts");
        Company javaExperts = new Company("Java experts");
        Company javaMasters = new Company("Java masters");
        Company javax = new Company("Javax");
        Company javageeks = new Company("Java Geeks");
        //When
        companyDao.save(sqlExperts);
        int sqlExpertsId = sqlExperts.getId();
        companyDao.save(javaExperts);
        int javaExpertsId = javaExperts.getId();
        companyDao.save(javaMasters);
        int javaMastersId = javaMasters.getId();
        companyDao.save(javax);
        int javaxId = javax.getId();
        companyDao.save(javageeks);
        int javageeksId = javageeks.getId();
        List<Company> resultCompanies = companyDao.retrieveCompanyByFirstThreeLetters("Jav");

        //Then
        Assertions.assertEquals(4, resultCompanies.size());

        //CleanUp
        try {
            companyDao.deleteById(sqlExpertsId);
            companyDao.deleteById(javaExpertsId);
            companyDao.deleteById(javaMastersId);
            companyDao.deleteById(javaxId);
            companyDao.deleteById(javageeksId);
        } catch (Exception e){
            //Do nothing
        }
        }
    }
