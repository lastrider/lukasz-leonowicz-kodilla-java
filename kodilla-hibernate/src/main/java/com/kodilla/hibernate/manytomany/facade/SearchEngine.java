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
public class SearchEngine {
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchEngine.class);
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public List<Employee> searchEmployeeLastname(final String searchPhrase){
        LOGGER.info("Searching " +searchPhrase +  " from employees employees");
        List<Employee> employees = employeeDao.retrieveByScrapOfLastName(searchPhrase);
        LOGGER.info("Searching " +searchPhrase +  " from employees finished");
        return employees;
    }

    public List<Company> searchCompanyName(final String searchPhrase) {
        LOGGER.info("Searching " +searchPhrase +  " from companies started");
        List<Company> companies = companyDao.retrieveCompanyByScrapOfName(searchPhrase);
        LOGGER.info("Searching " +searchPhrase +  " from  companies finished");
        return companies;

    }
}
