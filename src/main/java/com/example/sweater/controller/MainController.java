package com.example.sweater.controller;

import com.example.sweater.domain.*;
import com.example.sweater.repos.*;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.*;


@Controller
public class MainController {
    @Autowired
    private CommitteeRepo committeeRepo;
    @Autowired
    FooterRepo footerRepo;
    @Autowired
    ImageRepo imageRepo;
    @Autowired
    private NewsRepo newsRepo;
    @Autowired
    private QuestRepo questRepo;
    @Autowired
    private FeedbackRepo feedbackRepo;
    @Autowired
    UserRepo userRepo;
    @Autowired
    FaqRepo faqRepo;


    @GetMapping("/")
    public String home(@RequestParam(name = "mess", required = false, defaultValue = "Title") String mess, Model model) {
        List<Footer> footers_home =  (List<Footer>) footerRepo.findAll();
        model.addAttribute("footers_home",  footers_home);

        List<Footer> footers_home1 =  (List<Footer>) footerRepo.findById(1);
        String img_home1 = footers_home1.iterator().next().getImg_footer();
        model.addAttribute("img_home1",  img_home1);

        List<Footer> footers_home2 =  (List<Footer>) footerRepo.findById(2);
        String img_home2 = footers_home2.iterator().next().getImg_footer();
        model.addAttribute("img_home2",  img_home2);

        List<Footer> footers_home3 =  (List<Footer>) footerRepo.findById(3);
        String img_home3 = footers_home3.iterator().next().getImg_footer();
        model.addAttribute("img_home3",  img_home3);

        List<Footer> footers_home4 =  (List<Footer>) footerRepo.findById(4);
        String img_home4 = footers_home4.iterator().next().getImg_footer();
        model.addAttribute("img_home4",  img_home4);

        List<Footer> footers_home5 =  (List<Footer>) footerRepo.findById(5);
        String img_home5 = footers_home5.iterator().next().getImg_footer();
        model.addAttribute("img_home5",  img_home5);
        return "home.html";
    }


    @GetMapping("/committee1")
    public String greeting(@RequestParam(name = "mess", required = false, defaultValue = "Title") String mess, Model model) {
        Iterable<Committee> messages = committeeRepo.findById(1);
        String mess1 = messages.iterator().next().getTitle();
        String body1 = messages.iterator().next().getBody();
        String img_committee = messages.iterator().next().getImg_committee();
        model.addAttribute("img_committee", img_committee);
        model.addAttribute("body1", body1);
        model.addAttribute("mess1", mess1);

        Iterable<Committee> messages2 = committeeRepo.findById(2);
        String mess2 = messages2.iterator().next().getTitle();
        String body2 = messages2.iterator().next().getBody();
        String img_committee2 = messages2.iterator().next().getImg_committee();
        model.addAttribute("img_committee2", img_committee2);
        model.addAttribute("body2", body2);
        model.addAttribute("mess2", mess2);

        Iterable<Committee> messages3 = committeeRepo.findById(3);
        String mess3 = messages3.iterator().next().getTitle();
        String body3 = messages3.iterator().next().getBody();
        String img_committee3 = messages3.iterator().next().getImg_committee();
        model.addAttribute("img_committee3", img_committee3);
        model.addAttribute("body3", body3);
        model.addAttribute("mess3", mess3);

        Iterable<Committee> messages4 = committeeRepo.findById(4);
        String mess4 = messages4.iterator().next().getTitle();
        String body4 = messages4.iterator().next().getBody();
        String img_committee4 = messages4.iterator().next().getImg_committee();
        model.addAttribute("img_committee4", img_committee4);
        model.addAttribute("body4", body4);
        model.addAttribute("mess4", mess4);

        List<Footer> footers_committee =  (List<Footer>) footerRepo.findAll();
        model.addAttribute("footers_committee",  footers_committee);

        List<Footer> footers_committee1 =  (List<Footer>) footerRepo.findById(1);
        String img_committeeF1 = footers_committee1.iterator().next().getImg_footer();
        model.addAttribute("img_committeeF1",  img_committeeF1);

        List<Footer> footers_committee2 =  (List<Footer>) footerRepo.findById(2);
        String img_committeeF2 = footers_committee2.iterator().next().getImg_footer();
        model.addAttribute("img_committeeF2",  img_committeeF2);

        List<Footer> footers3 =  (List<Footer>) footerRepo.findById(3);
        String img_committeeF3 = footers3.iterator().next().getImg_footer();
        model.addAttribute("img_committeeF3",  img_committeeF3);

        List<Footer> footers_committee4 =  (List<Footer>) footerRepo.findById(4);
        String img_committeeF4 = footers_committee4.iterator().next().getImg_footer();
        model.addAttribute("img_committeeF4",  img_committeeF4);

        List<Footer> footers_committee5 =  (List<Footer>) footerRepo.findById(5);
        String img_committeeF5 = footers_committee5.iterator().next().getImg_footer();
        model.addAttribute("img_committeeF5",  img_committeeF5);
        return "committee1.html";
    }



    @GetMapping("/home")
    public String footer(@RequestParam(name = "mess", required = false, defaultValue = "Title") String mess, Model model) {

        List<Footer> footers_home =  (List<Footer>) footerRepo.findAll();
        model.addAttribute("footers_home",  footers_home);

        List<Footer> footers_home1 =  (List<Footer>) footerRepo.findById(1);
        String img_home1 = footers_home1.iterator().next().getImg_footer();
        model.addAttribute("img_home1",  img_home1);

        List<Footer> footers_home2 =  (List<Footer>) footerRepo.findById(2);
        String img_home2 = footers_home2.iterator().next().getImg_footer();
        model.addAttribute("img_home2",  img_home2);

        List<Footer> footers_home3 =  (List<Footer>) footerRepo.findById(3);
        String img_home3 = footers_home3.iterator().next().getImg_footer();
        model.addAttribute("img_home3",  img_home3);

        List<Footer> footers_home4 =  (List<Footer>) footerRepo.findById(4);
        String img_home4 = footers_home4.iterator().next().getImg_footer();
        model.addAttribute("img_home4",  img_home4);

        List<Footer> footers_home5 =  (List<Footer>) footerRepo.findById(5);
        String img_home5 = footers_home5.iterator().next().getImg_footer();
        model.addAttribute("img_home5",  img_home5);
        return "home.html";
    }


    @GetMapping("/news")
    public String news(Model model) {

        List<News> news =  (List<News>) newsRepo.findAll();
        model.addAttribute("news",  news);



        List<Footer> footers_news =  (List<Footer>) footerRepo.findAll();
        model.addAttribute("footers_news",  footers_news);

        List<Footer> footers_news1 =  (List<Footer>) footerRepo.findById(1);
        String img_news1 = footers_news1.iterator().next().getImg_footer();
        model.addAttribute("img_news1",  img_news1);

        List<Footer> footers_news2 =  (List<Footer>) footerRepo.findById(2);
        String img_news2 = footers_news2.iterator().next().getImg_footer();
        model.addAttribute("img_news2",  img_news2);

        List<Footer> footers_news3 =  (List<Footer>) footerRepo.findById(3);
        String img_news3 = footers_news3.iterator().next().getImg_footer();
        model.addAttribute("img_news3",  img_news3);

        List<Footer> footers_news4 =  (List<Footer>) footerRepo.findById(4);
        String img_news4 = footers_news4.iterator().next().getImg_footer();
        model.addAttribute("img_news4",  img_news4);

        List<Footer> footers_news5 =  (List<Footer>) footerRepo.findById(5);
        String img_news5 = footers_news5.iterator().next().getImg_footer();
        model.addAttribute("img_news5",  img_news5);
        return "news.html";
    }


    @GetMapping("/contacts")
    public String footer_contacts(Model model) {

        List<Footer> footers_contacts =  (List<Footer>) footerRepo.findAll();
        model.addAttribute("footers_contacts",  footers_contacts);

        List<Footer> footers_contacts1 =  (List<Footer>) footerRepo.findById(1);
        String img_contacts1 = footers_contacts1.iterator().next().getImg_footer();
        model.addAttribute("img_contacts1",  img_contacts1);

        List<Footer> footers_contacts2 =  (List<Footer>) footerRepo.findById(2);
        String img_contacts2 = footers_contacts2.iterator().next().getImg_footer();
        model.addAttribute("img_contacts2",  img_contacts2);

        List<Footer> footers_contacts3 =  (List<Footer>) footerRepo.findById(3);
        String img_contacts3 = footers_contacts3.iterator().next().getImg_footer();
        model.addAttribute("img_contacts3",  img_contacts3);

        List<Footer> footers_contacts4 =  (List<Footer>) footerRepo.findById(4);
        String img_contacts4 = footers_contacts4.iterator().next().getImg_footer();
        model.addAttribute("img_contacts4",  img_contacts4);

        List<Footer> footers_contacts5 =  (List<Footer>) footerRepo.findById(5);
        String img_contacts5 = footers_contacts5.iterator().next().getImg_footer();
        model.addAttribute("img_contacts5",  img_contacts5);


        return "contacts.html";
    }


    @GetMapping("/quest")
    public String footer_quest(Model model) {

        List<Footer> footers_quest =  (List<Footer>) footerRepo.findAll();
        model.addAttribute("footers_quest",  footers_quest);

        List<Quest> quests = (List<Quest>) questRepo.findAll();
        model.addAttribute("quests", quests);

        List<Feedback> feedbacks = (List<Feedback>) feedbackRepo.findAll();
        model.addAttribute("feedbacks", feedbacks);

        List<Footer> footers_quest1 =  (List<Footer>) footerRepo.findById(1);
        String img_quest1 = footers_quest1.iterator().next().getImg_footer();
        model.addAttribute("img_quest1",  img_quest1);

        List<Footer> footers_quest2 =  (List<Footer>) footerRepo.findById(2);
        String img_quest2 = footers_quest2.iterator().next().getImg_footer();
        model.addAttribute("img_quest2",  img_quest2);

        List<Footer> footers_quest3 =  (List<Footer>) footerRepo.findById(3);
        String img_quest3 = footers_quest3.iterator().next().getImg_footer();
        model.addAttribute("img_quest3",  img_quest3);

        List<Footer> footers_quest4 =  (List<Footer>) footerRepo.findById(4);
        String img_quest4 = footers_quest4.iterator().next().getImg_footer();
        model.addAttribute("img_quest4",  img_quest4);

        List<Footer> footers_quest5 =  (List<Footer>) footerRepo.findById(5);
        String img_quest5 = footers_quest5.iterator().next().getImg_footer();
        model.addAttribute("img_quest5",  img_quest5);

        return "quest.html";
    }


    @GetMapping("/faq")
    public String footer_faq(Model model) {
        List<FAQ> faqs =  (List<FAQ>) faqRepo.findAll();
        model.addAttribute("faqs",  faqs);

        List<Footer> footers_faq =  (List<Footer>) footerRepo.findAll();
        model.addAttribute("footers_faq",  footers_faq);

        List<Footer> footers_faq1 =  (List<Footer>) footerRepo.findById(1);
        String img_faq1 = footers_faq1.iterator().next().getImg_footer();
        model.addAttribute("img_faq1",  img_faq1);

        List<Footer> footers_faq2 =  (List<Footer>) footerRepo.findById(2);
        String img_faq2 = footers_faq2.iterator().next().getImg_footer();
        model.addAttribute("img_faq2",  img_faq2);

        List<Footer> footers_faq3 =  (List<Footer>) footerRepo.findById(3);
        String img_faq3 = footers_faq3.iterator().next().getImg_footer();
        model.addAttribute("img_faq3",  img_faq3);

        List<Footer> footers_faq4 =  (List<Footer>) footerRepo.findById(4);
        String img_faq4 = footers_faq4.iterator().next().getImg_footer();
        model.addAttribute("img_faq4",  img_faq4);

        List<Footer> footers_faq5 =  (List<Footer>) footerRepo.findById(5);
        String img_faq5 = footers_faq5.iterator().next().getImg_footer();
        model.addAttribute("img_faq5",  img_faq5);

        return "faq.html";
    }
    @GetMapping("/new_feedback")
    public String feeds(Model model){
        return "new_feedback";
    }

    @GetMapping("/new_faq")
    public String new_news(Model model){
        return "new_faq";
    }

    @PostMapping("/new_faq")
    public String addNewFaq (@RequestParam String answer_faq,
                                  @RequestParam String question_faq,
                                  @AuthenticationPrincipal User user,
                                  Model model) {

        User username = userRepo.findByUsername(user.getUsername());

        FAQ faq = new FAQ(answer_faq, question_faq, username);
        faqRepo.save(faq);

        return "redirect:/faqAdmin";
    }


    @GetMapping("/new_new")
    public String new_new(Model model){
        return "new_new";
    }

    @PostMapping("/new_new")
    public String addNewNew (@RequestParam String title_news,
                             @RequestParam String body_news,
                             @RequestParam("img_news") String img_news,
                             Model model) {


        String date = LocalDate.now().toString();

        ImageC imageC = new ImageC(img_news);
        imageRepo.save(imageC);

        News news = new News(title_news,body_news,date, imageC);

        newsRepo.save(news);

        return "redirect:/newsAdmin";
    }

    @PostMapping("/new_feedback")
    public String addNewFeedback (@RequestParam String title_feedback,
                                  @RequestParam String body_feedback,
                                   @AuthenticationPrincipal User user,
                                  Model model) {

        String date = LocalDate.now().toString();

        User username = userRepo.findByUsername(user.getUsername());

        Feedback feedback = new Feedback(  body_feedback, date, title_feedback, username);
        feedbackRepo.save(feedback);

        return "redirect:/quest";
    }
/*
    @PostMapping("/delete_faq")
    public String deleteFaq (@RequestParam Integer id_faq) {

        Iterable<FAQ> faq = faqRepo.findById_faq(id_faq);
        faqRepo.delete((FAQ) faq);

        return "redirect:/faqAdmin";
    }*/

}