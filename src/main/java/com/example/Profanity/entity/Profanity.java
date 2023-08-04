package com.example.Profanity.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reserved_names")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Profanity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String value;
    @Column(nullable = false)
    private Integer reason;
    @Column(nullable = false)
    private String lang;

}
