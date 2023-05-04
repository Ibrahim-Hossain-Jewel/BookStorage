package com.imagegallery.store.Model;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity(name = "bookdetails")
@Repository
public class Bookdetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long serial_number;
    @Column
    private String title_book;
    @Column
    private String name_publisher;
    @Column
    private Long date_publication;
    @Column
    private Long page;
    @Column
    private String bookType;
    public Bookdetails(Long id) {
    }

    public Bookdetails() {
    }

    public Bookdetails(Long id, Long serial_number, String title_book, String name_publisher, Long date_publication, Long page, String bookType) {
        this.id = id;
        this.serial_number = serial_number;
        this.title_book = title_book;
        this.name_publisher = name_publisher;
        this.date_publication = date_publication;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(Long serial_number) {
        this.serial_number = serial_number;
    }

    public String getTitle_book() {
        return title_book;
    }

    public void setTitle_book(String title_book) {
        this.title_book = title_book;
    }

    public String getName_publisher() {
        return name_publisher;
    }

    public void setName_publisher(String name_publisher) {
        this.name_publisher = name_publisher;
    }

    public Long getDate_publication() {
        return date_publication;
    }

    public void setDate_publication(Long date_publication) {
        this.date_publication = date_publication;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return "Bookdetails{" +
                "id=" + id +
                ", serial_number=" + serial_number +
                ", title_book='" + title_book + '\'' +
                ", name_publisher='" + name_publisher + '\'' +
                ", date_publication=" + date_publication +
                ", page=" + page +
                ", bookType='" + bookType + '\'' +
                '}';
    }
}
