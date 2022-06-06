package com.springboot.kafka.Listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Author liluo
 * @create 2022/5/16 14:21
 */
@Slf4j
@Component
public class KafkaConsumer {
    // 消费监听
    @KafkaListener(topics = {"topic1"})
    public void onMessage1(ConsumerRecord<?, ?> record){
        log.info("------------------------------收到消息："+record.toString()+"---------------------------------");
        // 消费的哪个topic、partition的消息,打印出消息内容
        System.out.println("简单消费1："+record.toString());
    }

    // 消费监听业务系统权限检查通知
    @KafkaListener(topics = {"test_devops_notify-audit-check"})
    public void onMessage2(ConsumerRecord<?, ?> record){
        log.info("------------------------------收到消息："+record.toString()+"---------------------------------");
        // 消费的哪个topic、partition的消息,打印出消息内容
        System.out.println("简单消费2："+ record.toString());
    }

    // 消费监听接收业务权限结果
    @KafkaListener(topics = {"test_devops_accept-audit-result"})
    public void onMessage3(ConsumerRecord<?, ?> record){
        log.info("------------------------------收到消息："+record.toString()+"---------------------------------");
        // 消费的哪个topic、partition的消息,打印出消息内容
        System.out.println("简单消费3："+ record.toString());
    }

}
