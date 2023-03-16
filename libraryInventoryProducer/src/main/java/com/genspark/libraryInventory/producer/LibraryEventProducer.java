package com.genspark.libraryInventory.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.genspark.libraryInventory.model.LibraryEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class LibraryEventProducer {

    @Autowired
    private KafkaTemplate<String,LibraryEvent> kafkaTemplate;
    private String topic="library_event";

    public void sendMessage(LibraryEvent libraryEvent){
        kafkaTemplate.send(topic,libraryEvent);
    }
}
