package walter.unit.kafka_example.sender;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class KafkaProducerService {
    public static final String TOPIC_NAME = "walter";

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(String data){
        try{
            kafkaTemplate.send(TOPIC_NAME, data);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
