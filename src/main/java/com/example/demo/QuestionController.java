package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@Controller
public class QuestionController {

    @Autowired
    QuestionService questionService;


    @GetMapping("/greeting")
    public String greeting(Model model) {
//        Question question = questionService.getQuestionById(1);
//        model.addAttribute("question", question);

        List<Question> questions = questionService.getAllQuestions();

        Question question = questions.get(0);
        model.addAttribute("question", question);
        questions.remove(0);

        return "greeting";
}


    @GetMapping("/questions")
    private List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/questions/{id}")
    private Question getQuestion(@PathVariable("id") int id) {
        return questionService.getQuestionById(id);
    }

}