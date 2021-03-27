package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    public List<Question> getAllQuestions() {
        List<Question> questions = new ArrayList<Question>();
        questionRepository.findAll().forEach(question -> questions.add(question));
        Collections.shuffle(questions);
        return questions;
    }

    public Question getQuestionById(int id) {
        return questionRepository.findById(id).get();
    }

}