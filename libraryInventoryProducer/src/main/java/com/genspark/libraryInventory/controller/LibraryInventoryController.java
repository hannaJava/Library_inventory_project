package com.genspark.libraryInventory.controller;

import com.genspark.libraryInventory.model.LibraryEvent;
import com.genspark.libraryInventory.model.LibraryEventType;
import com.genspark.libraryInventory.producer.LibraryEventProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LibraryInventoryController {
    @Autowired
    LibraryEventProducer libraryEventProducer;

    @PostMapping("/publish")
    public String publishEvent(@RequestBody LibraryEvent libraryEvent){
        libraryEvent.setLibraryEventType(LibraryEventType.NEW);
        libraryEventProducer.sendMessage(libraryEvent);
        return " library event was successfully added to library_event topic...";
    }
}
