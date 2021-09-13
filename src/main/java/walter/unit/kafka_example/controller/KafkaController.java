package walter.unit.kafka_example.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import walter.unit.kafka_example.consumer.KafkaConsumerService;
import walter.unit.kafka_example.sender.KafkaProducerService;

@RequiredArgsConstructor
@RestController
public class KafkaController {

    private final KafkaProducerService producerService;

    private final KafkaConsumerService consumerService;

    @GetMapping("/send/{message}")
    public void sendMessage(@PathVariable("message") String message){
        producerService.send(message);
    }
}
