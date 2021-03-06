package com.mycompany.test1;
// Generated 03-Mar-2014 20:24:34 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Emp558 generated by hbm2java
 */
@Entity
@Table(name="EMP558"
    ,catalog="test"
)
public class Emp558  implements java.io.Serializable {


     private int id;
     private String name;
     private Float salary;

    public Emp558() {
    }

	
    public Emp558(int id) {
        this.id = id;
    }
    public Emp558(int id, String name, Float salary) {
       this.id = id;
       this.name = name;
       this.salary = salary;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="NAME")
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="SALARY", precision=12, scale=0)
    public Float getSalary() {
        return this.salary;
    }
    
    public void setSalary(Float salary) {
        this.salary = salary;
    }




}


