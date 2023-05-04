package com.imagegallery.store.Repo;

import com.imagegallery.store.Model.Bookdetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookStoreRepo extends JpaRepository<Bookdetails,Long > {

}
