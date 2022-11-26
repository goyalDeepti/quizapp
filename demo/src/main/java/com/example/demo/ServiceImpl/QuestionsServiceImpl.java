package com.example.demo.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.IDao.IQuestionsDao;
import com.example.demo.IRest.IQuestionRest;
import com.example.demo.entities.Questions;

@Service
public class QuestionsServiceImpl implements IQuestionRest{

	@Autowired
	private IQuestionsDao questionDao;
	
	@Override
	public Questions createQuestion(Questions question) {
      return questionDao.save(question);
}
	}
