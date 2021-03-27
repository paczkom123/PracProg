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
        System.out.println(questions);

        Question question = questions.get(0);
        Question question1 = questions.get(0);

        Question question2 = questions.get(1);

        Question question3 = questions.get(2);

        Question question4 = questions.get(3);

        Question question5 = questions.get(4);
        Question question6 = questions.get(5);
        Question question7 = questions.get(6);
        Question question8 = questions.get(7);

        model.addAttribute("question", question);
        model.addAttribute("question1", question1);
        model.addAttribute("question2", question2);
        model.addAttribute("question3", question3);
        model.addAttribute("question4", question4);
        model.addAttribute("question5", question5);
        model.addAttribute("question6", question6);
        model.addAttribute("question7", question7);
        model.addAttribute("question8", question8);
        model.addAttribute("questions", questions);


        return "greeting";
}


    @GetMapping("/questions")
    private List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/result/{x}/{y}")
    private String result(@PathVariable("x") int x, @PathVariable("y") int y, Model model) {

        Result result = new Result();
        result.setxValue(x);
        result.setyValue(y);
        model.addAttribute("result", result);

        return "result";
    }

    @GetMapping("/questions/{id}")
    private Question getQuestion(@PathVariable("id") int id) {
        return questionService.getQuestionById(id);
    }

}