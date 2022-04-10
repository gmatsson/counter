package com.matssgus.counter.repository;

import com.matssgus.counter.entity.Counter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CounterRepository extends JpaRepository<Counter, Integer> {
}
