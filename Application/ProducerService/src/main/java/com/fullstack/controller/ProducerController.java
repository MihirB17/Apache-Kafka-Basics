package com.fullstack.controller;

import com.fullstack.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ProducerController {

    private final ProducerService producerService;

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody String msg) {
        producerService.send(msg);
        return new ResponseEntity<>("Please check message in Off set Explorer and check consumer service log also , Message Sent Successfully", HttpStatus.OK);
    }

}
