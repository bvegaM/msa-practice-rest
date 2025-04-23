package com.cat.practice.rest.domain;

import jakarta.persistence.*;
import lombok.*;
import java.time.*;

@Entity
@Table(name = "T_RECEIVINGS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Receiving {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate receivingDate;
    private String origin;
}
