package com.example.kafkaorderservice.Controller;

import com.example.kafkaorderservice.DTO.OrderEvent;
import com.example.kafkaorderservice.Service.OrderProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderProducer producer;

    @PostMapping
    public String createOrder(@RequestBody OrderEvent event) {
        System.out.println("OrderController.createOrder invoked");
        System.out.println("Received order event: orderId=" + event.getOrderId() + ", product=" + event.getProduct() + ", price=" + event.getPrice());
        producer.sendOrder(event);
        System.out.println("OrderController.createOrder completed");
        return "Order event sent to Kafka";
    }
}
