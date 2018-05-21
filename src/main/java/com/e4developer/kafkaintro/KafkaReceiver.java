package com.e4developer.kafkaintro;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaReceiver {

    @KafkaListener(topics = "topic1")
    public void receiveTopic1(ConsumerRecord<?, ?> consumerRecord) {
        System.out.println("Receiver on topic1: "+consumerRecord.toString());
    }

    @KafkaListener(topics = "topic2")
    public void receiveTopic2(ConsumerRecord<?, ?> consumerRecord) {
        System.out.println("Receiver on topic2: "+consumerRecord.toString());
    }

}
