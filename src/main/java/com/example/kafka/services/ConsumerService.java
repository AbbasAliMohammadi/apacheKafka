package com.example.kafka.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.kafka.domain.Student;
import com.example.kafka.repository.StudentRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class ConsumerService {
     private final StudentRepository studentRepository;

    @KafkaListener(topics = "testTopic",groupId = "testGroup")
    public void consumeMessage(Student student){
      log.info("consume the message from testTopic"+student);
      studentRepository.save(student);
    }
    
}
