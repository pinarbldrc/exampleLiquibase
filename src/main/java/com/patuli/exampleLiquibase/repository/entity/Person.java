package com.patuli.exampleLiquibase.repository.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_person")
public class Person implements Serializable {

    @Id
    @Column(name = "id")
     int id;

    @Column(name = "person_name")
   String person_name;
    @Column(name = "person_surname")
    String person_surname;
    @Column(name = "state")
    String state;


}
