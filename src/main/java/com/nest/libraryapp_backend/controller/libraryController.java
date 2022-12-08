package com.nest.libraryapp_backend.controller;

import com.nest.libraryapp_backend.dao.LibraryDao;
import com.nest.libraryapp_backend.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class libraryController {
@Autowired
private LibraryDao dao;
        @PostMapping("/")
        public  String AdminLogin(){
            return "welcome to adminlogin";
        }
        @CrossOrigin(origins = "*")
        @PostMapping(path = "/bookentry",consumes = "application/json",produces = "application/json")
        public  String BookEntry(@RequestBody Library l){
            System.out.println(l.getTitle());
        dao.save(l);
            return "welcome to Book entry";
        }
        @GetMapping("/viewbook")
        public  String ViewBook(){
            return "welcome to Book view";
        }
        @PostMapping("/searchbook")
        public  String SearchBook(){
            return "welcome to Book search";
        }
        @PostMapping("/deletebook")
        public  String DeleteBook(){
            return "This is book delete";
        }
        @PostMapping("/editbook")
        public  String EditBook(){
            return "This is book edit";
        }
        @PostMapping("/issuebook")
        public  String IssueBook(){
            return "This is book issue";
        }

        @PostMapping("/userregister")
        public  String UserRegister(){
            return "This is user register";
        }

        @PostMapping("/userlogin")
        public  String UserLogin(){
            return "This is user login";
        }

}
