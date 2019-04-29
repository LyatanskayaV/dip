package com.example.sweater.controller;

import com.example.sweater.domain.FAQ;
import com.example.sweater.repos.FaqRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


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

    @DeleteMapping("{faq}")
    public ResponseEntity deleteFaq(@PathVariable Long faq) {
        faqRepo.deleteById(faq);
        return ResponseEntity.noContent().build();
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


/*
    @RequestMapping(value = "{faq}",method = RequestMethod.DELETE)
    public String removeAd(@PathVariable ("faq") Long id_faq) {
        //faqRepo.delete(id_faq);
        return "redirect:/faqAdmin";
    }*/

/* norm
    @RequestMapping(value = "/d/{id_faq}", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String faqDeleteForm(@PathVariable("id_faq") FAQ faq, Model model){
        model.addAttribute("faq", faq);
        System.out.println(faq);
        //faqRepo.delete(id);
        return "faqEdit";
    }
*/

/*  ошибка типов + лишнее в mapping
        @RequestMapping( value = "/delete/{faq}",method = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.DELETE})
  //  @PostMapping("/deleteFaq/{id_faq}")
    public String deleteFaq(@PathVariable("faq") Long id_faq, Model model){
            model.addAttribute("faq", id_faq);

            Long id = id_faq;
            System.out.println(id);
            faqRepo.delete(id);
        return "redirect:/faqAdmin";
    }*/

/*


 /*   @RequestMapping(method=RequestMethod.DELETE, value="{faq}")
    public @ResponseBody void removeFaq(@PathVariable FAQ faq) {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" +
                "!!!!!!!!!!!!!!!!!!!!!!!!");
        faqRepo.delete(faq.getId_faq());
    }*/

  //  @RequestMapping(value="{id_faq}/d", method=RequestMethod.DELETE)
  //  @PostMapping
/*    public String faqDelete(
            @RequestParam String question_faq,
            @RequestParam("id_faq") Long id_faq, FAQ faq) {

        faqRepo.delete(question_faq);

        faqRepo.save(faq);
        return "redirect:/faqAdmin";
    }*/
   /* public String deleteUser(@PathVariable("id_faq") Long id_faq,  FAQ faq, Model model) {
          //  String string = faq.getAnswer_faq();
            model.addAttribute("faq", faq);
     //   System.out.println(string);
        return "redirect:/faqAdmin";
    }*/






       /* @PostMapping("{faq}")
        public String delete_faq(@RequestParam(name = "id_faq") Long id_faq, FAQ faq){
        //Long id_faq = faq.getId_faq();
        System.out.println(id_faq);
   *//* faqRepo.deleteByName(id_faq);
    faqRepo.save(faq);*//*

  //  model.addAttribute("faq", faq);

    return "faqList";
}*/

    }
