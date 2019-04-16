package com.example.sweater.controller;

import com.example.sweater.domain.*;
import com.example.sweater.repos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String home(Model model) {
        List<Footer> footers =  (List<Footer>) footerRepo.findAll();
        model.addAttribute("footers",  footers);

        List<Footer> footers1 =  (List<Footer>) footerRepo.findById(1);
        String img1 = footers1.iterator().next().getImg();
        model.addAttribute("img1",  img1);

        List<Footer> footers2 =  (List<Footer>) footerRepo.findById(2);
        String img2 = footers2.iterator().next().getImg();
        model.addAttribute("img2",  img2);

        List<Footer> footers3 =  (List<Footer>) footerRepo.findById(3);
        String img3 = footers3.iterator().next().getImg();
        model.addAttribute("img3",  img3);

        List<Footer> footers4 =  (List<Footer>) footerRepo.findById(4);
        String img4 = footers4.iterator().next().getImg();
        model.addAttribute("img4",  img4);

        List<Footer> footers5 =  (List<Footer>) footerRepo.findById(5);
        String img5 = footers5.iterator().next().getImg();
        model.addAttribute("img5",  img5);
        return "home.html";
    }


    @GetMapping("/committee1")
    public String greeting(@RequestParam(name = "mess", required = false, defaultValue = "Title") String mess, Model model) {
        Iterable<Committee> messages = committeeRepo.findById(1);
        String mess1 = messages.iterator().next().getTitle();
        String body1 = messages.iterator().next().getBody();
        model.addAttribute("body1", body1);
        model.addAttribute("mess1", mess1);

        Iterable<Committee> messages2 = committeeRepo.findById(2);
        String mess2 = messages2.iterator().next().getTitle();
        String body2 = messages2.iterator().next().getBody();
        model.addAttribute("body2", body2);
        model.addAttribute("mess2", mess2);

        Iterable<Committee> messages3 = committeeRepo.findById(3);
        String mess3 = messages3.iterator().next().getTitle();
        String body3 = messages3.iterator().next().getBody();
        model.addAttribute("body3", body3);
        model.addAttribute("mess3", mess3);

        Iterable<Committee> messages4 = committeeRepo.findById(4);
        String mess4 = messages4.iterator().next().getTitle();
        String body4 = messages4.iterator().next().getBody();
        model.addAttribute("body4", body4);
        model.addAttribute("mess4", mess4);

        List<Footer> footers =  (List<Footer>) footerRepo.findAll();
        model.addAttribute("footers",  footers);

        List<Footer> footers1 =  (List<Footer>) footerRepo.findById(1);
        String img1 = footers1.iterator().next().getImg();
        model.addAttribute("img1",  img1);

        List<Footer> footers2 =  (List<Footer>) footerRepo.findById(2);
        String img2 = footers2.iterator().next().getImg();
        model.addAttribute("img2",  img2);

        List<Footer> footers3 =  (List<Footer>) footerRepo.findById(3);
        String img3 = footers3.iterator().next().getImg();
        model.addAttribute("img3",  img3);

        List<Footer> footers4 =  (List<Footer>) footerRepo.findById(4);
        String img4 = footers4.iterator().next().getImg();
        model.addAttribute("img4",  img4);

        List<Footer> footers5 =  (List<Footer>) footerRepo.findById(5);
        String img5 = footers5.iterator().next().getImg();
        model.addAttribute("img5",  img5);
        return "committee1.html";
    }



    @GetMapping("/home")
    public String footer(@RequestParam(name = "mess", required = false, defaultValue = "Title") String mess, Model model) {

        List<Footer> footers =  (List<Footer>) footerRepo.findAll();
        List<ImageC> images1 = (List<ImageC>) imageRepo.findAll();
        model.addAttribute("footers",  footers);
        model.addAttribute("images1", images1);

        List<Footer> footers1 =  (List<Footer>) footerRepo.findById(1);
        String img1 = footers1.iterator().next().getImg();
        model.addAttribute("img1",  img1);

        List<Footer> footers2 =  (List<Footer>) footerRepo.findById(2);
        String img2 = footers2.iterator().next().getImg();
        model.addAttribute("img2",  img2);

        List<Footer> footers3 =  (List<Footer>) footerRepo.findById(3);
        String img3 = footers3.iterator().next().getImg();
        model.addAttribute("img3",  img3);

        List<Footer> footers4 =  (List<Footer>) footerRepo.findById(4);
        String img4 = footers4.iterator().next().getImg();
        model.addAttribute("img4",  img4);

        List<Footer> footers5 =  (List<Footer>) footerRepo.findById(5);
        String img5 = footers5.iterator().next().getImg();
        model.addAttribute("img5",  img5);
        return "home.html";
    }


    @GetMapping("/news")
    public String news(Model model) {

        List<News> news =  (List<News>) newsRepo.findAll();
        model.addAttribute("news",  news);

        List<Footer> footers =  (List<Footer>) footerRepo.findAll();
        model.addAttribute("footers",  footers);

        List<Footer> footers1 =  (List<Footer>) footerRepo.findById(1);
        String img1 = footers1.iterator().next().getImg();
        model.addAttribute("img1",  img1);

        List<Footer> footers2 =  (List<Footer>) footerRepo.findById(2);
        String img2 = footers2.iterator().next().getImg();
        model.addAttribute("img2",  img2);

        List<Footer> footers3 =  (List<Footer>) footerRepo.findById(3);
        String img3 = footers3.iterator().next().getImg();
        model.addAttribute("img3",  img3);

        List<Footer> footers4 =  (List<Footer>) footerRepo.findById(4);
        String img4 = footers4.iterator().next().getImg();
        model.addAttribute("img4",  img4);

        List<Footer> footers5 =  (List<Footer>) footerRepo.findById(5);
        String img5 = footers5.iterator().next().getImg();
        model.addAttribute("img5",  img5);
        return "news.html";
    }


    @GetMapping("/contacts")
    public String footer_contacts(Model model) {

        List<Footer> footers =  (List<Footer>) footerRepo.findAll();
        model.addAttribute("footers",  footers);

        List<Footer> footers1 =  (List<Footer>) footerRepo.findById(1);
        String img1 = footers1.iterator().next().getImg();
        model.addAttribute("img1",  img1);

        List<Footer> footers2 =  (List<Footer>) footerRepo.findById(2);
        String img2 = footers2.iterator().next().getImg();
        model.addAttribute("img2",  img2);

        List<Footer> footers3 =  (List<Footer>) footerRepo.findById(3);
        String img3 = footers3.iterator().next().getImg();
        model.addAttribute("img3",  img3);

        List<Footer> footers4 =  (List<Footer>) footerRepo.findById(4);
        String img4 = footers4.iterator().next().getImg();
        model.addAttribute("img4",  img4);

        List<Footer> footers5 =  (List<Footer>) footerRepo.findById(5);
        String img5 = footers5.iterator().next().getImg();
        model.addAttribute("img5",  img5);


        return "contacts.html";
    }


    @GetMapping("/quest")
    public String footer_quest(Model model) {

        List<Footer> footers =  (List<Footer>) footerRepo.findAll();
        model.addAttribute("footers",  footers);

        List<Quest> quests = (List<Quest>) questRepo.findAll();
        model.addAttribute("quests", quests);

        List<Feedback> feedbacks = (List<Feedback>) feedbackRepo.findAll();
        model.addAttribute("feedbacks", feedbacks);

        List<Footer> footers1 =  (List<Footer>) footerRepo.findById(1);
        String img1 = footers1.iterator().next().getImg();
        model.addAttribute("img1",  img1);

        List<Footer> footers2 =  (List<Footer>) footerRepo.findById(2);
        String img2 = footers2.iterator().next().getImg();
        model.addAttribute("img2",  img2);

        List<Footer> footers3 =  (List<Footer>) footerRepo.findById(3);
        String img3 = footers3.iterator().next().getImg();
        model.addAttribute("img3",  img3);

        List<Footer> footers4 =  (List<Footer>) footerRepo.findById(4);
        String img4 = footers4.iterator().next().getImg();
        model.addAttribute("img4",  img4);

        List<Footer> footers5 =  (List<Footer>) footerRepo.findById(5);
        String img5 = footers5.iterator().next().getImg();
        model.addAttribute("img5",  img5);


        /*List<ImageC> images = (List<ImageC>) imageRepo.findAll();
        model.addAttribute("images", images);*/

        return "quest.html";
    }


    @GetMapping("/faq")
    public String footer_faq(Model model) {
        List<FAQ> faqs =  (List<FAQ>) faqRepo.findAll();
        model.addAttribute("faqs",  faqs);

        List<Footer> footers =  (List<Footer>) footerRepo.findAll();
        model.addAttribute("footers",  footers);

        List<Footer> footers1 =  (List<Footer>) footerRepo.findById(1);
        String img1 = footers1.iterator().next().getImg();
        model.addAttribute("img1",  img1);

        List<Footer> footers2 =  (List<Footer>) footerRepo.findById(2);
        String img2 = footers2.iterator().next().getImg();
        model.addAttribute("img2",  img2);

        List<Footer> footers3 =  (List<Footer>) footerRepo.findById(3);
        String img3 = footers3.iterator().next().getImg();
        model.addAttribute("img3",  img3);

        List<Footer> footers4 =  (List<Footer>) footerRepo.findById(4);
        String img4 = footers4.iterator().next().getImg();
        model.addAttribute("img4",  img4);

        List<Footer> footers5 =  (List<Footer>) footerRepo.findById(5);
        String img5 = footers5.iterator().next().getImg();
        model.addAttribute("img5",  img5);

        return "faq.html";
    }
}