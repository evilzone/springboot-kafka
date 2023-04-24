# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.springboot-kafka.springboot-kafka' is invalid and this project uses 'com.springbootkafka.springbootkafka' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.6/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.6/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#web)
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#messaging.kafka)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)


============================================================================================================ 

starting the kafka server
bin/kafka-server-start.sh config/server.properties

starting the zookeeper
bin/zookeeper-server-start.sh config/zookeeper.properties

reading message from kafka console
kafka % bin/kafka-console-consumer.sh --topic kafka_topic --from-beginning --bootstrap-server localhost:9092
