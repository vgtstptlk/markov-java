package com.vgtstptlk.runner.repository;

import com.vgtstptlk.runner.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public List<User> getAll();
    public Optional<User> findByUsername(String username);
}
