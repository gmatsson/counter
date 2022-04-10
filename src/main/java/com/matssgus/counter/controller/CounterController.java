package com.matssgus.counter.controller;

import com.matssgus.counter.entity.Counter;
import com.matssgus.counter.services.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1")
public class CounterController {

    @Autowired
    private CounterService counterService;

    @GetMapping("/counters")
    public ResponseEntity<List<Counter>> getAllCounters(){
        return ResponseEntity.ok(counterService.getCounterList());
    }

    @PostMapping("/addCounter")
    public ResponseEntity<Counter> addCounter(@RequestBody Counter counter){
        return ResponseEntity.ok(counterService.createCounter(counter));
    }

    @PutMapping("/updateCounter")
    public ResponseEntity<Counter> updateCounter(@RequestBody Counter counter){
        return ResponseEntity.ok(counterService.updateCounterById(counter));
    }

    @DeleteMapping("/deleteCounter/{id}")
    public HttpStatus deleteUser(@PathVariable int id) {
        counterService.deleteCounterById(id);
        return HttpStatus.OK;
    }
}
