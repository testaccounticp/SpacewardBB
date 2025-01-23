package com.example.spaceward2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScheduleController {
    @GetMapping("/scheduleView")
    public String main(Model model) {
        return "scheduleView";
    }
}