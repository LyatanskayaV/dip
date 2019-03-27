package com.example.sweater.controller;

import com.example.sweater.domain.Message;
import com.example.sweater.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.ErrorPageFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private MessageRepo messageRepo;

    @GetMapping("/")
    public String home(Map<String, Object> model) {
        return "committee1";
    }



   @GetMapping("/committee1")
    public String main(@RequestParam(required = false, defaultValue = "") Map<String, Object> model   ) {
        Iterable<Message> messages = messageRepo.findAll();

        model.put("messages", messages);
        System.out.println("?????????????????????????????????????????????????????????" +
                "???????????????????????????????????????????????????????????????" +
                "??????????????????????????????????????????????????????????????"+messages);

        return "committee1";
    }


/*
    @PostMapping("/committee1")
    public String add(
            @AuthenticationPrincipal User user,
            @RequestParam String text,
            @RequestParam String tag, Map<String, Object> model
    ) {
        Message message = new Message(text, tag, user);

        messageRepo.save(message);

        Iterable<Message> messages = messageRepo.findAll();

        model.put("messages", messages);

        return "committee1";
    }*/
}