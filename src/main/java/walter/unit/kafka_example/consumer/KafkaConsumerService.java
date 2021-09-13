package walter.unit.kafka_example.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import walter.unit.kafka_example.sender.KafkaProducerService;

import java.io.IOException;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = KafkaProducerService.TOPIC_NAME, autoStartup = "true")
    public void consumer(String message){
        System.out.println("receive message : " + message);
    }
}
