package com.matssgus.counter.services;

import com.matssgus.counter.entity.Counter;
import com.matssgus.counter.repository.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CounterService {

    @Autowired
    private CounterRepository counterRepository;

    public Counter createCounter(Counter counter) {
        return counterRepository.save(counter);
    }

    public List<Counter> getCounterList() {
        List<Counter> counterList = counterRepository.findAll();
        Collections.reverse(counterList);
        return counterList;
    }

    public Counter updateCounterById(Counter counter) {
        Optional<Counter> foundCounter = counterRepository.findById(counter.getId());
        if (foundCounter.isPresent() && foundCounter.get().getCount() != counter.getCount()) {
            Counter updatedCounter = foundCounter.get();
            updatedCounter.setName(counter.getName());
            updatedCounter.setCount(counter.getCount());
            return counterRepository.save(counter);
        } else return null;
    }

    public String deleteCounterById(int id) {
        counterRepository.deleteById(id);
        return "Counter "+ id +" deleted";
    }
}
