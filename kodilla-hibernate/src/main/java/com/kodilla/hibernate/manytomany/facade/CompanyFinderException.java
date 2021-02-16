package com.kodilla.hibernate.manytomany.facade;

public class CompanyFinderException extends Exception {
    public static String ERR_COMPANY_NOT_FOUND = "Company does not exist in database";
    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee does not exist in database";

    public CompanyFinderException(String message) {
        super(message);
    }
}