package com.genspark.libraryInventory.consumer;

import com.genspark.libraryInventory.model.LibraryEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LibraryEventConsumer {

    @KafkaListener(topics = "library_topic",groupId = "Group100",containerFactory = "ConcurrentKafkaListenerContainerFactory")
    public void consumeMessage(LibraryEvent libraryEvent){
        System.out.println(" consuming messages from library_topic..."+libraryEvent.toString());
    }

}
