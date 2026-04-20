package com.example.kafkaorderservice.Service;

import com.example.kafkaorderservice.DTO.OrderEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {

    @Autowired
    private KafkaTemplate<String, OrderEvent> kafkaTemplate;

    private static final String TOPIC = "order-topic";

    public void sendOrder(OrderEvent event) {
        System.out.println("OrderProducer.sendOrder invoked for topic=" + TOPIC + ", key=" + event.getOrderId());
        kafkaTemplate.send(TOPIC, event.getOrderId(), event);
        System.out.println("OrderProducer.sendOrder kafkaTemplate.send returned");
    }
}
