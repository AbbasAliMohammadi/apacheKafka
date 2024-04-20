package com.example.kafka.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka.domain.Student;
import com.example.kafka.services.ProducerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api")
public class TesResource {

 private final ProducerService producerService;
 public TesResource(ProducerService producerService){
    this.producerService=producerService;
 }


 @PostMapping("sendMessage")
 public void sendMessage(@Valid @RequestBody Student student){
    producerService.sendMessage(student);
 }
    
}
