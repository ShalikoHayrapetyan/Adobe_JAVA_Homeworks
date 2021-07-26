package com.company.week_3.Interfaces.task_2;

public class BooksParent implements Book {
    public  String author;
    public  String title;
    public  int numberOfPages;
    public String genre;
    public  double sizeInMB;
    public boolean isBookOpen = false;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public double getSizeInMB() {
        return sizeInMB;
    }

    public boolean isBookOpen() {
        return isBookOpen;
    }

    public int getOpenedPage() {
        return this.openedPage;
    }

    public int openedPage = 0;

    public void open() {
        this.isBookOpen = true;
        System.out.println("The book has opened");

    }

    public void close() {
        this.isBookOpen = false;
        System.out.println("The book has closed");

    }

    public void browsePages() {
        if (isBookOpen) {

            if (openedPage < numberOfPages) {
                this.openedPage++;
                System.out.println("Open page : " + openedPage);
            } else {
                System.out.println("You finished the book");
                close();
            }

        } else System.out.println("First open is book");
    }
}
