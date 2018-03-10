package com.andrea.canteen.Domain;


import javax.persistence.Entity;
import java.math.BigInteger;


public class EmployeeReport {



    private String employeeName;
    private BigInteger sumPrice;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public BigInteger getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(BigInteger sumPrice) {
        this.sumPrice = sumPrice;
    }
}
