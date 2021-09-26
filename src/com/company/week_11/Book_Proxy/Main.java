package com.company.week_11.Book_Proxy;

public class Main {
    public static void main(String[] args) {
        ProxyBook proxyBook = new ProxyBook("title", "author");
        proxyBook.load();
        System.out.println(proxyBook.getTitle());
        System.out.println(proxyBook.getAuthor());
        proxyBook.load();
    }
}
