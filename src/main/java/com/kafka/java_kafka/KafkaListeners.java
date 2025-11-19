package com.kafka.java_kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
        topics = "notification",
        groupId = "groupId01"
    )
    void listener(String data){
        System.out.println("LIstener received " + data);
    }
}
