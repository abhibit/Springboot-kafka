package com.abhi.kafka.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
public class MessengerConsumer {


    @KafkaListener(topics = "Messenger")
    public void receiveMessage(String message) {

        System.out.println("Message Recieved in Consumer  :"+message);
    }

}
