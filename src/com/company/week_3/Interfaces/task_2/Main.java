package com.company.week_3.Interfaces.task_2;

public class Main {
    public static void main(String[] args) {
        final PaperBooks paperBooks1 = new PaperBooks("Antoine de Saint-Exupéry", "The Little Prince", 200, 5.5);
        paperBooks1.open();
        paperBooks1.browsePages();
        paperBooks1.browsePages();
        paperBooks1.browsePages();
        paperBooks1.browsePages();
        paperBooks1.close();
        paperBooks1.browsePages();

    }
}
