package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class CompanyFacade {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    public static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);

    public List<Company> companyFinder() throws CompanyFinderException {
        List<Company> companies = companyDao.getCompanyByNameLike("%Jav%");
        LOGGER.info("Companies: " + companies);
        if (companies.isEmpty()) {
            LOGGER.error(CompanyFinderException.ERR_COMPANY_NOT_FOUND);
            throw new CompanyFinderException(CompanyFinderException.ERR_COMPANY_NOT_FOUND);
        }
        return companies;
    }

    public List<Employee> employeeFinder() throws CompanyFinderException {
        List<Employee> employees = employeeDao.findEmployeeByLastname("%Smi%");
        LOGGER.info("Employees: " + employees);
        if (employees.isEmpty()) {
            LOGGER.error(CompanyFinderException.ERR_EMPLOYEE_NOT_FOUND);
            throw new CompanyFinderException(CompanyFinderException.ERR_EMPLOYEE_NOT_FOUND);
        }
        return employees;
    }
}