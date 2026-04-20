package com.example.kafkapayservice.service;

import com.example.kafkapayservice.dto.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentConsumer {

    @KafkaListener(topics = "order-topic", groupId = "payment-group")
    public void consume(OrderEvent event) {

        System.out.println("📥 Received Order Event:");
        System.out.println("Order ID: " + event.getOrderId());
        System.out.println("Product: " + event.getProduct());
        System.out.println("Price: " + event.getPrice());

        // Simulate payment processing
        processPayment(event);
    }

    private void processPayment(OrderEvent event) {
        System.out.println("💳 Processing payment for Order: " + event.getOrderId());

        // Add business logic here
        System.out.println("✅ Payment successful for: " + event.getProduct());
    }
}