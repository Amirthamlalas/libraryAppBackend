package com.nest.libraryapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class libraryController {

        @PostMapping("/")
        public  String AdminLogin(){
            return "welcome to adminlogin";
        }

        @PostMapping("/bookentry")
        public  String BookEntry(){
            return "welcome to Book entry";
        }
        @GetMapping("/viewbook")
        public  String ViewBook(){
            return "welcome to Book view";
        }

}
