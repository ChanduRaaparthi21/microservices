package com.chandu.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandu.Model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
