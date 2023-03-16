package com.genspark.libraryInventory.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Builder
public class Book {
    private Integer bookId;
    private String bookName;
    private String bookAuthor;
}
