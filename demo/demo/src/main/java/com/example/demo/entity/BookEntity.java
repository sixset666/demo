package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Generated;

import javax.persistence.*;


@Data
    @Entity
    @AllArgsConstructor
    @Table(name = "books")
public class BookEntity {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String publishing;
    private int year;
    private String kind;
}
