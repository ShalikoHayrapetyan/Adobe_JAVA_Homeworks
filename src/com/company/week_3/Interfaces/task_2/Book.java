package com.company.week_3.Interfaces.task_2;

public interface Book {

    String author = "unknown author";
    String title = "";
    int numberOfPages = 0;
    String genre = "";
    double sizeInMB = 0;

    public void open();

    public void close();

    public void browsePages();
}
