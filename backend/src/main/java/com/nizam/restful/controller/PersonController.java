package com.nizam.restful.controller;

import com.nizam.restful.dto.InputRequest;
import com.nizam.restful.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

//@RestController
//@RequestMapping("/api")
//@CrossOrigin // supaya React bisa akses
//public class PersonController {
//
//    private final PersonService service;
//
//    public PersonController(PersonService service) {
//        this.service = service;
//    }
//
//    @PostMapping("/submit")
//    public Map<String, String> submit(@RequestBody InputRequest req) {
//        service.process(req.getRawInput());
//        return Map.of("message", "Data saved successfully");
//    }
//}

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/person")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody InputRequest request) {
        System.out.println("INPUT DARI REACT = " + request.getInput());
        service.process(request.getInput());
        return ResponseEntity.ok().build();
    }
}
