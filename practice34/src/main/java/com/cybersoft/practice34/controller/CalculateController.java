package com.cybersoft.practice34.controller;

import com.cybersoft.practice34.services.TinhToanServices;
import com.cybersoft.practice34.services.imp.TinhToanServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculateController {

    @Autowired
    private TinhToanServices tinhToanServices;

    @GetMapping("/add")
    public ResponseEntity<?> add(@RequestParam int x, @RequestParam int y){
        return ResponseEntity.ok(tinhToanServices.add(x, y));
    }

    @GetMapping("/subtract")
    public ResponseEntity<?> subtract(@RequestParam int x, @RequestParam int y){
        return ResponseEntity.ok(tinhToanServices.subtract(x, y));
    }

    @GetMapping("multiply")
    public ResponseEntity<?> multiply(@RequestParam int x, @RequestParam int y){
        return ResponseEntity.ok(tinhToanServices.multiply(x, y));
    }

    @GetMapping("/divide")
    public ResponseEntity<?> divide(@RequestParam int x, @RequestParam int y){
        return ResponseEntity.ok(tinhToanServices.divide(x, y));
    }
}
