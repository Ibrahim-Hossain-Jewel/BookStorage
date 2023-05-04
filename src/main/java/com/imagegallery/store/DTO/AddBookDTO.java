package com.imagegallery.store.DTO;

import javax.persistence.Column;

public class AddBookDTO {
    private Long id;
    private Long serial_number;
    private String title_book;
    private String name_publisher;
    private Long date_publication;
    private Long page;
    private String bookType;

    public AddBookDTO(Long id, Long serial_number, String title_book, String name_publisher, Long date_publication, Long page, String bookType) {
        this.id = id;
        this.serial_number = serial_number;
        this.title_book = title_book;
        this.name_publisher = name_publisher;
        this.date_publication = date_publication;
        this.page = page;
        this.bookType = bookType;
    }

    public AddBookDTO() {
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
        return "AddBookDTO{" +
                "serial_number=" + serial_number +
                ", title_book='" + title_book + '\'' +
                ", name_publisher='" + name_publisher + '\'' +
                ", date_publication=" + date_publication +
                ", page=" + page +
                ", bookType='" + bookType + '\'' +
                '}';
    }
}
