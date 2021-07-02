package com.vgtstptlk.runner.service;

import com.vgtstptlk.runner.domain.Run;
import com.vgtstptlk.runner.repository.RunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RunServiceImpl implements RunService{

    private RunRepository runRepository;

    @Override
    public List<Run> getAllRunsByUser(Long userId) {
        return runRepository.findRunByUserId(userId);
    }

    @Override
    public Run saveRun(Long userId, String name, Double length, Integer heavily,
                       String description, Integer timeRun, LocalDateTime date, String status) {

        Run run = new Run(userId, name, length, heavily, description, timeRun, date, status);

        return runRepository.save(run);
    }

    @Autowired
    public RunServiceImpl(RunRepository runRepository) {
        this.runRepository = runRepository;
    }
}
