package com.nest.libraryapp_backend.controller;

import com.nest.libraryapp_backend.dao.LibraryDao;
import com.nest.libraryapp_backend.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

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
        @CrossOrigin(origins = "*")
        @GetMapping("/viewbook")
        public List<Library> ViewBook(){
            return (List<Library>)dao.findAll();
        }
        @CrossOrigin(origins = "*")
        @PostMapping(path = "/searchbook",consumes = "application/json",produces = "application/json")
        public List<Library> SearchBook(@RequestBody Library l){
            String title=String.valueOf(l.getTitle());
            System.out.println(title);

            return (List<Library>)dao.SearchBook(l.getTitle());
        }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/deletebook",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> DeleteBook(@RequestBody Library l){
        String id=String.valueOf(l.getId());
        System.out.println(id);
        dao.DeleteBook(l.getId());
        HashMap<String,String>map=new HashMap<>();
        map.put("status","success");
        return map;


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
