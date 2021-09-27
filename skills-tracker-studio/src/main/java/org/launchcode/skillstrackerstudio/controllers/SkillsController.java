package org.launchcode.skillstrackerstudio.controllers;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("home")
    public String homePage(){
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> Programming Languages offered are: </h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("form")
    public String programmingLanguage(){
        return "<html>" +
                "<body>" +
                "<form action='' method='POST'>" +
                "<label for='name'>Name: </label>" +
                "<input type='text' id='name' name='name'>" +
                "</br>" +
                "<label for='first'> My Favorite Language: </label>" +
                "</br>" +
                "<select name='first' id='first-select'>" +
                "<option value='Java'> Java </option>" +
                "<option value='Python'> Python </option>" +
                "<option value='Javascript'> JavaScript </option>" +
                "</select>" +
                "</br>" +
                "<select name='second' id='second-select'>" +
                "<option value='Java'> Java </option>" +
                "<option value='Python'> Python </option>" +
                "<option value='Javascript'> JavaScript </option>" +
                "</select>" +
                "</br>" +
                "<select name='third' id='third-select'>" +
                "<option value='Java'> Java </option>" +
                "<option value='Python'> Python </option>" +
                "<option value='Javascript'> JavaScript </option>" +
                "</select>" +
                "</br>" +
                "<input type='submit' value='submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
    @PostMapping("form")
    public String userChoices(@RequestParam String name,
                              @RequestParam String first,
                              @RequestParam String second,
                              @RequestParam String third){
        return "<html>" +
                "<body>" +
                "<h1 style='color:goldenrod;'> " + name + "</h1>" +
                "<h2> Favorite Programming Languages</h2>" +
                "<ol>" +
                "<li style='color:red;'>" + first + "</li>" +
                "<li style='color:goldenrod;'>" + second + "</li>" +
                "<li style='color:blue;'>" + third + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
