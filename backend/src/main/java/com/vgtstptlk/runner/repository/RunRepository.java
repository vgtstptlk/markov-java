package com.vgtstptlk.runner.repository;

import com.vgtstptlk.runner.domain.Run;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RunRepository extends JpaRepository<Run, Long> {
    public List<Run> getAll();
    public List<Run> findRunByUserId(Long userId);
}
