package com.andrea.canteen.Domain;


import javax.persistence.*;


@Entity
public class Employee {

    @Id
    @SequenceGenerator(name="employee_id_seq", sequenceName="employee_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.AUTO, generator="employee_id_seq")
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
