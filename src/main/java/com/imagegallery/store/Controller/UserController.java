package com.imagegallery.store.Controller;
import com.imagegallery.store.DTO.AddBookDTO;
import com.imagegallery.store.Model.Bookdetails;
import com.imagegallery.store.Repo.BookStoreRepo;
import com.imagegallery.store.Response.Response;
import com.imagegallery.store.Service.implementation.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired(required = true)
    private BookStoreService bookStoreService;
    @Autowired
    private BookStoreRepo bookStoreRepo;
    @PostMapping(path = "/addbooks")
    public ResponseEntity<?> registration(@RequestBody AddBookDTO addBookDTO) {
        Response response = bookStoreService.BookInfo(addBookDTO);
        return ResponseEntity.ok(response);
    }
//    @GetMapping(value = "/alluserInfo")
//    public List<Bookdetails> getTreeById() {
//        return bookStoreRepo.findAll();
//    }

}
