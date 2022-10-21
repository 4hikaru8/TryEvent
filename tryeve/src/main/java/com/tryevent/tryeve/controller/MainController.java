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
           
            List<String> titleList = new ArrayList<String>();
            List<String> dateList = new ArrayList<String>();
            List<String> collabo = new ArrayList<String>();
            int a = 0;


            for (Element course : event) {
                titleList.add(course.getElementsByClass("title").text());
                dateList.add(course.getElementsByClass("date nowrap").text());

                collabo.add(titleList.get(a) +"　開催期間："+ dateList.get(a));
                a++;
            }

            model.addAttribute("collabo", collabo);
           
    

        return "hello";
    }
    @RequestMapping("/result")
    public String resultPage() {
        return "result";
    }
     
}
