package com.vgtstptlk.runner.service;

import com.vgtstptlk.runner.domain.Run;

import java.util.List;

public interface RunService {
    public List<Run> getAllRunsByUser(Long userId);
    public Run saveRun(Long userId, String name, Integer length);
}
