package com.company.week_10.Files_analyzer_runnable;

import java.io.*;
import java.nio.file.Files;
import java.util.UUID;


public class Main {
    public static void main(String[] args) throws IOException {


        for (int i = 0; i < 10; i++) {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Acer\\Desktop\\Adobe_JAVA_Homeworks\\src\\com\\company\\week_10\\Files_analyzer_runnable\\files\\filetest" + i + ".txt"));
            writer.write(UUID.randomUUID().toString());
            writer.close();
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                File path = new File("C:\\Users\\Acer\\Desktop\\Adobe_JAVA_Homeworks\\src\\com\\company\\week_10\\Files_analyzer_runnable\\files");
                File[] files = path.listFiles();
                for (File file : files) {
                    try {
                        System.out.println(file.getName() + " contains " + Files.readString(file.toPath()));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).run();

    }
}


