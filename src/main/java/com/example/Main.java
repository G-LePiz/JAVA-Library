package com.example;

public class Main {
    public static void main(String[] args) {
        Library l = new Library(); //도서관 객체 생성

        // alt + enter;
        //

        Book bookA = new Book("bookA", "해밍웨이", true); // 책 객체 4개 생성
        Book bookB = new Book("소년이 온다", "한강", false);
        Book bookC = new Book("채식주의자", "한강", true);
        Book bookD = new Book("흔한 남매 18", "백난도", false);

       l.addBook(bookA); // 책 추가
       l.addBook(bookB);
       l.addBook(bookC);
       l.addBook(bookD);

       l.removeBook(bookD); // 책 삭제

       l.searchAllBook(); // 책 전체 확인

       l.borrowBook("bookA");

       l.returnBook("bookA");


    }
}
