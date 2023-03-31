package com.example.kafkaconsumer.component;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumer {

    @KafkaListener(topics = "NewTopic", groupId = "test111", containerFactory = "concurrentKafkaListenerContainerFactory" )
    public void consume(String message)
    {
        System.out.println("message = " + message);
    }
}
