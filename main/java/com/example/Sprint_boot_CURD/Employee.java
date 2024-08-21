package com.example.Sprint_boot_CURD;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data                //--> For getter setter
@Entity
@AllArgsConstructor  //--> for consturctors
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id")
    private String emailId;

    public Employee() {

    }

}