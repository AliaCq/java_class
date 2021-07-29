package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DemoController {
    @GetMapping("/some-list")
    public String someList(Model model){
        List<String> list = new ArrayList<>();
        list.add("你好");
        list.add("世界");
        list.add("你好");
        list.add("中国");
        list.add("爱你");
        model.addAttribute("theList",list);
        return "someTemplate";
    }

    @GetMapping("/get-student")
    @ResponseBody
    public Student student(){
        Student student = new Student();
        student.sid = 18;
        student.name = "毛十八";
        student.age = 188;
        return student;
    }

    @GetMapping("/some-redirect")
    public String redirect(){
        return "redirect:/redirect-result";
    }
}
