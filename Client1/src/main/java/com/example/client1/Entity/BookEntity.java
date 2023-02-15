package com.example.client1.Entity;


import lombok.*;




@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class BookEntity {
    private Long book_id;
    private String title;
    private String author;
    private String publishing;
    private int yearPub;
    private String kind;

}
