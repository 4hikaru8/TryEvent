package com.tryevent.tryeve.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHello(Model model , String[] args) throws IOException{
        model.addAttribute("title", "Hello World");
        model.addAttribute("message", "ようこそ、プログラミングの世界へ！！");

            Document document = Jsoup.connect("https://kyoto-design.jp/event").get();
            Elements event = document.getElementsByClass("wrap clearfix");
           
            List<String> sample1 = new ArrayList<String>();
            List<String> sample2 = new ArrayList<String>();
            List<String> sample3 = new ArrayList<String>();
            int a = 0;


            for (Element course : event) {
                sample1.add(course.getElementsByClass("title").text());
                sample2.add(course.getElementsByClass("date nowrap").text());

                sample3.add(sample1.get(a) +"　開催期間："+ sample2.get(a));
                a++;
            }

            model.addAttribute("sample3", sample3);
            model.addAttribute("sample1", sample1);
            model.addAttribute("sample2", sample2);
           


            // for (Element course : event) {
            //     model.addAttribute("festival", course.getElementsByClass("title").text() + "　　");
            //     model.addAttribute("date", course.getElementsByClass("date nowrap").text());
            // }
    

        return "hello";
    }
     
}
