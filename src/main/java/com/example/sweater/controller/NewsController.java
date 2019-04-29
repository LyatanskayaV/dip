package com.example.sweater.controller;

import com.example.sweater.domain.FAQ;
import com.example.sweater.domain.News;
import com.example.sweater.repos.FaqRepo;
import com.example.sweater.repos.NewsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/newsAdmin")
@PreAuthorize("hasAuthority('ADMIN')")
public class NewsController {
    @Autowired
    private NewsRepo newsRepo;

    @GetMapping
    public String newsList(Model model){
        model.addAttribute("news", newsRepo.findAll());
        return "newsList";
    }
    @GetMapping("{news}")
    public String faqEditForm(@PathVariable News news, Model model){
        model.addAttribute("news", news);
        return "newsEdit";
    }
    @PostMapping
    public String newsSave(
            @RequestParam String title_news,
            @RequestParam String body_news,
            @RequestParam("id_news") News news
    ) {
        news.setTitle_news(title_news);
        news.setBody_news(body_news);

        newsRepo.save(news);
        return "redirect:/newsAdmin";
    }
}
