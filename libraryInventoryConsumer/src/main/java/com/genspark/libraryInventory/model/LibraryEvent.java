package com.genspark.libraryInventory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LibraryEvent {

    private Integer libraryEventId;
    private LibraryEventType libraryEventType;
    private Book book;
}
