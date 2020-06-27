package com.cosson.controller;

import com.cosson.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private CommonService commonService;

    @GetMapping("/test")
    public ResponseEntity<Boolean> testControllerMethod() {
        return ResponseEntity.ok(commonService.testService());
    }
}