package com.mike.stickers.controller;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;

@Slf4j
@RestController
@RequestMapping("/api/v1/logging")
public class LoggingController {

//    private static final Logger log = LoggerFactory.getLogger(LoggingController.class);

    @GetMapping
        public ResponseEntity<String> testLogging(){
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
          return  ResponseEntity.ok().body("Logging tested successfully");

        }
}

