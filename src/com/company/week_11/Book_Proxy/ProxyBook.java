package com.company.week_11.Book_Proxy;

public class ProxyBook extends Book {

    private boolean isLoaded = false;

    public ProxyBook(String title, String author) {
        super(title, author);
    }

    public boolean isLoaded() {
        return isLoaded;
    }

    public void load() {

        if (isLoaded) {
            throw new RuntimeException("The book already loaded");
        }
        isLoaded = true;
    }

    @Override
    public String getTitle() {
        if (!isLoaded) throw new RuntimeException("The book is not loaded");
        return super.getTitle();
    }

    @Override
    public String getAuthor() {
        if (!isLoaded) throw new RuntimeException("The book is not loaded");
        return super.getAuthor();
    }


}
