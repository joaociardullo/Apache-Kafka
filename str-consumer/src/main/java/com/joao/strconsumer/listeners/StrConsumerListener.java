package com.joao.strconsumer.listeners;


import com.joao.strconsumer.custom.StrConsumerCustomLister;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

    @StrConsumerCustomLister(groupId = "group-1")
    public void create(String message) {
        log.info("CREATE ::: receive message {}", message);

    }

    @StrConsumerCustomLister(groupId = "group-1")
    public void log(String message) {
        log.info("LOG ::: receive message {}", message);
    }

    @KafkaListener(groupId = "group-2", topics = "str-topic", containerFactory = "validMessageContainerFactory")
    public void history(String message) {
        log.info("HISTORY ::: receive message {}", message);
    }


}