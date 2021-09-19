package com.company.week_10.Runnable;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                BufferedWriter writer = null;
                try {
                    writer = new BufferedWriter(new FileWriter("C:\\Users\\Acer\\Desktop\\Adobe_JAVA_Homeworks\\src\\com\\company\\week_10\\Runnable\\filetest.txt"));
                    String text = "";
                    for (int j = 0; j < 10000; j++) {
                        text += UUID.randomUUID().toString() + "\n";
                    }
                    writer.write(text);
                    writer.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).run();
    }
}
