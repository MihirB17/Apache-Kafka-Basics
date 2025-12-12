package com.fullstack.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerService {

    private final KafkaTemplate kafkaTemplate;

    @Value("${kafka.topic.name}")
    private String topicName;


    public void send(String msg){
        kafkaTemplate.send(topicName,msg);
    }



}
