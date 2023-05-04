package com.imagegallery.store.Service.implementation;

import com.imagegallery.store.DTO.AddBookDTO;
import com.imagegallery.store.Model.Bookdetails;
import com.imagegallery.store.Repo.BookStoreRepo;
import com.imagegallery.store.Response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookStoreServiceImplement implements BookStoreService {
    @Autowired(required = true)
    BookStoreRepo bookStoreRepo;
    @Override
    public Response BookInfo(AddBookDTO addBookDTO) {
        Bookdetails Bookdetails1 = new Bookdetails(
                addBookDTO.getId(),
                addBookDTO.getSerial_number(),
                addBookDTO.getTitle_book(),
                addBookDTO.getName_publisher(),
                addBookDTO.getDate_publication(),
                addBookDTO.getPage(),
                addBookDTO.getBookType()
        );
        bookStoreRepo.save(Bookdetails1);
        return new Response("Add success", true);
    }
}
