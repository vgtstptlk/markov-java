package com.vgtstptlk.runner.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Run {
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private Long userId;
    private String name;
    private Double length;
    private byte heavily;
    private String description;
    private LocalDateTime date;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public byte getHeavily() {
        return heavily;
    }

    public void setHeavily(byte heavily) {
        this.heavily = heavily;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Run() {
    }

    public Run(Long userId, String name, Double length, byte heavily, String description, LocalDateTime date, String status) {
        this.userId = userId;
        this.name = name;
        this.length = length;
        this.heavily = heavily;
        this.description = description;
        this.date = date;
        this.status = status;
    }
}
