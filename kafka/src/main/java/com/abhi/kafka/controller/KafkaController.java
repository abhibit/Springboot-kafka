package com.abhi.kafka.controller;

import com.abhi.kafka.producer.MessengerProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    @Autowired
    MessengerProducer messengerProducer;


    @GetMapping("/push")
    public void pushMessageToKafka(@RequestParam String message)
    {
        messengerProducer.sendMessage(message);
    }
}
