package com.gaurang.myproject;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
@Component
public class Listener {
	
	
	@RabbitListener(queues="queue1")
    public void Fanoutforq1recievedMessage(String msg) {
        System.out.println("Queue name is :  queue1");

        System.out.println("Recieved Message: "  + msg);
    }
	@RabbitListener(queues="queue2")
    public void Fanoutforq2recievedMessage(String msg) {
        System.out.println("Queue name is :  queue2");

        System.out.println("Recieved Message: "  + msg);
    }
	
	@RabbitListener(queues="wing")
    public void DirectMessage(String msg) {
        System.out.println("Queue name is :  wing");

        System.out.println("Recieved Message: "  + msg);
    }
	
	
}
