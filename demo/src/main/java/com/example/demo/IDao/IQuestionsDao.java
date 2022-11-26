package com.example.demo.IDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Questions;

@Repository
public interface IQuestionsDao extends JpaRepository<Questions, Integer>{

}
