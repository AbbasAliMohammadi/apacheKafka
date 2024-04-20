package com.example.kafka.services;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.example.kafka.domain.Student;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class ProducerService {
    private final KafkaTemplate<String,Student> kafkaTemplate;

    public void sendMessage(Student student){
        log.info("produce data"+student);
        Message<Student> message=MessageBuilder.withPayload(student).setHeader(KafkaHeaders.TOPIC, "testTopic").build();
        kafkaTemplate.send(message);
    }
    
}
