package com.imagegallery.store.Service.implementation;

import com.imagegallery.store.DTO.AddBookDTO;
import com.imagegallery.store.Response.Response;
import org.springframework.stereotype.Repository;

@Repository
public interface BookStoreService {
    Response BookInfo(AddBookDTO addBookDTO);
}
