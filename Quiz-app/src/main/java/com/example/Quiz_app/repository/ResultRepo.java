package com.example.Quiz_app.repository;

import com.example.Quiz_app.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepo extends JpaRepository<Result,Integer> {
}
