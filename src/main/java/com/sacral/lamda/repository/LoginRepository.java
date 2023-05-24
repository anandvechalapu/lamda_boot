package com.sacral.lamda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

    @Query("SELECT l FROM Login l WHERE l.username = ?1 and l.password = ?2")
    Login findLoginByUsernameAndPassword(String username, String password);

    boolean existsByUsername(String username);

    boolean existsByPassword(String password);

    void deleteByUsername(String username);

}