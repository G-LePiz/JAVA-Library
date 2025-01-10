package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
 //클래스를 만드는 것은 타입을 만들 뿐 // 클래스도 하나의 자료형이다.
// 클래스도 기능을 만들 뿐
public class Library {
    ArrayList<Book> bookList = new ArrayList<>(); //book도 클래스이기때문에 가능하다.


    public Library(){ // 생성자: 초기화
        bookList.clear();
    }

    public void addBook(Book book) { //책 추가
        bookList.add(book);
    }

    public void removeBook(Book book){ // 책 제거
        bookList.remove(book);
    }
    // 클래스, 매개변수와 구분
    public Book searchBook(String title){ // 책 이름으로 조회
        for (Book book : bookList) {
            String booktitle = book.getTitle();
            if (booktitle.equals(title)) {
                System.out.println("검색하신 책이 있습니다." + title);
                return book;
            }
        }
        return null;
    }

    public void searchAllBook() { // 전체 책 찾기
        for (Book book : bookList) {
            book.bookDetail();
        }
    }
    public void borrowBook(String title) { // 책을 빌리는 것
        Book book = searchBook(title);
        if(book != null && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("당신이 빌린 책은: "+ title);
        } else {
            System.out.println("빌릴 수 없는 책입니다.");
        }
    }

    public void returnBook(String title) { // 책 반납
        Book book = searchBook(title);
        if(book != null && !book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("책이 반납되었습니다.");
        } else if (book == null) {
            System.out.println("책이 없습니다.");
        } else {
            book.setAvailable(false);
            System.out.println("이미 대여를 한 책입니다.");
        }
    }





}
