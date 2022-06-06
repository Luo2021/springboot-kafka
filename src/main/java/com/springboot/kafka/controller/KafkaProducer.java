package com.springboot.kafka.controller;

import com.alibaba.fastjson.JSON;
import com.springboot.kafka.pojo.AcceptAuditResultVo;
import com.springboot.kafka.pojo.TypeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author liluo
 * @create 2022/5/16 14:16
 */
@Slf4j
@RestController
@RequestMapping("/kafka")
public class KafkaProducer {

    @Resource
    private KafkaTemplate<String, Object> kafkaTemplate;

    // 发送消息
    @GetMapping("/normal/{message}")
    public void sendMessage1(@PathVariable("message") String normalMessage) {
        log.info("------------------------------"+normalMessage+"---------------------------------");
        kafkaTemplate.send("topic1","key1" ,normalMessage);
    }

    //业务系统权限检查通知
    @PostMapping("/notify-audit-check")
    public void sendMessage2(@RequestBody TypeVo typeVo) {
        log.info("------------------------------发送消息："+typeVo.toString()+"---------------------------------");
        kafkaTemplate.send("test_devops_notify-audit-check", JSON.toJSONString(typeVo));
    }

    //接收业务权限结果
    @PostMapping("/accept-audit-result")
    public void sendMessage3(@RequestBody AcceptAuditResultVo acceptAuditResultVo) {
        log.info("------------------------------发送消息："+acceptAuditResultVo.toString()+"---------------------------------");
        kafkaTemplate.send("test_devops_accept-audit-result", JSON.toJSONString(acceptAuditResultVo));
    }


}
