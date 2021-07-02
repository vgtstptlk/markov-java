package com.vgtstptlk.runner.service;

import com.vgtstptlk.runner.domain.Run;

import java.time.LocalDateTime;
import java.util.List;

public interface RunService {
    public List<Run> getAllRunsByUser(Long userId);
    public Run saveRun(Long userId, String name, Double length, Integer heavily,
                       String description, Integer timeRun, LocalDateTime date, String status);

}
