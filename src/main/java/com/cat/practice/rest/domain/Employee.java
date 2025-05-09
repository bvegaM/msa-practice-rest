package com.cat.practice.rest.domain;

import jakarta.persistence.*;
import lombok.*;
import java.time.*;

@Entity
@Table(name = "T_EMPLOYEES")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String position;
}
