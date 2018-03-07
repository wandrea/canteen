package com.andrea.canteen.Domain;

import javax.persistence.*;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Sale {

    @Id
    @SequenceGenerator(name="sale_id_seq", sequenceName="sale_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.AUTO, generator="sale_id_seq")

    private Integer id;
    private Timestamp saleTime;

    @OneToOne
    @JoinColumn(name="employee_id")
    private Employee employee;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "sale")
    private Set<SaleProduct> saleProducts= new HashSet<>();

    public void addSaleProduct (SaleProduct saleProduct){
        this.saleProducts.add(saleProduct);
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Timestamp saleTime) {
        this.saleTime = saleTime;
    }
}
