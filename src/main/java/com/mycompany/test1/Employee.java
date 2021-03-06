package com.mycompany.test1;
// Generated 03-Mar-2014 20:24:34 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Employee generated by hbm2java
 */
@Entity
@Table(name="EMPLOYEE"
    ,catalog="test"
)
public class Employee  implements java.io.Serializable {


     private int id;
     private String firstname;
     private String lastname;
     private String email;
     private String telephone;

    public Employee() {
    }

    public Employee(int id, String firstname, String lastname, String email, String telephone) {
       this.id = id;
       this.firstname = firstname;
       this.lastname = lastname;
       this.email = email;
       this.telephone = telephone;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="FIRSTNAME", nullable=false, length=20)
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    
    @Column(name="LASTNAME", nullable=false, length=30)
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    
    @Column(name="EMAIL", nullable=false, length=30)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="TELEPHONE", nullable=false, length=20)
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }




}


