package com.springbootkafka.springbootkafka.kafka;

import com.springbootkafka.springbootkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "kafka_topic_json", groupId = "myGroup")
    public void consume(User user) {
        LOGGER.info(String.format("json message received: %s ", user.toString()));
    }
}
