package com.example.sweater.controller;

import com.example.sweater.domain.FAQ;
import com.example.sweater.repos.FaqRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
    @RequestMapping("/faqAdmin")
    @PreAuthorize("hasAuthority('ADMIN')")
    public class FaqController {
        @Autowired
        private FaqRepo faqRepo;

        @GetMapping
        public String faqList(Model model){
            model.addAttribute("faqs", faqRepo.findAll());
            return "faqList";
        }
        @GetMapping("{faq}")
        public String faqEditForm(@PathVariable FAQ faq, Model model){
            model.addAttribute("faq", faq);
            return "faqEdit";
        }
        @PostMapping
        public String faqSave(
                @RequestParam String question_faq,
                @RequestParam String answer_faq,
                @RequestParam("id_faq") FAQ faq
        ) {
            faq.setQuestion_faq(question_faq);
            faq.setAnswer_faq(answer_faq);

            faqRepo.save(faq);
            return "redirect:/faqAdmin";
        }




    }
