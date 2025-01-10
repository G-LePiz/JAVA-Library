package com.example;

import java.sql.PreparedStatement;

public class Book {
    /* 필드 */
    private String title;
    private String author;
    private boolean isAvailable;

    Library l = new Library();

    /* 생성자 */

    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    /* 메소드 */

    public String getTitle() { // 책 이름 조회 //get
        return title;
    }

    public boolean isAvailable() { // 책 대여여부 조회 //get
        return isAvailable;
    }

    public void setAvailable(boolean isAvailableavailable) { // 책 대여여부 설정 //set
        isAvailable = isAvailableavailable;
    }

    public void bookDetail() { // 책의 상세정보
        System.out.println("책 이름: " + title);
        System.out.println("저자: " + author);
    }
}
