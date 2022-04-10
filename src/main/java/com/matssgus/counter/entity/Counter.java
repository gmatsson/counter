package com.matssgus.counter.entity;

import javax.persistence.*;

@Entity
@Table
public class Counter {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "count")
    private int count;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public int getId() {
        return id;
    }
}
