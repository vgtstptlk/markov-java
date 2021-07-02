package com.vgtstptlk.runner.repository;

import com.vgtstptlk.runner.domain.Run;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RunRepository extends JpaRepository<Run, Long> {
    public List<Run> getAll();
    public List<Run> findRunByUserId(Long userId);
}
