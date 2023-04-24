package com.springbootkafka.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaTopicConfig {

    @Bean
    public NewTopic kafkaTopic() {
        return TopicBuilder.name("kafka_topic")
            .build();
    }

    @Bean
    public NewTopic kafkaTopicJson() {
        return TopicBuilder.name("kafka_topic_json")
                .build();
    }
}
