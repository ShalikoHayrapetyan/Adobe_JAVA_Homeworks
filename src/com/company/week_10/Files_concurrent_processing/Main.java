package com.company.week_10.Files_concurrent_processing;

import java.io.*;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws IOException {
        String string = "ab";

        for (int i = 0; i < 10; i++) {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Acer\\Desktop\\Adobe_JAVA_Homeworks\\src\\com\\company\\week_10\\Files_concurrent_processing\\files\\filetest" + i + ".txt"));
            String text = "";
            for (int j = 0; j < 10000; j++) {

                text += UUID.randomUUID().toString() + "\n";
            }
            writer.write(text);
            writer.close();
        }

        File path = new File("C:\\Users\\Acer\\Desktop\\Adobe_JAVA_Homeworks\\src\\com\\company\\week_10\\Files_concurrent_processing\\files");
        File[] files = path.listFiles();

        for (File file : files) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int lineCount = 0;
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                        String line = bufferedReader.readLine();
                        while (line != null) {
                            if (line.contains(string)) {
                                lineCount++;
                            }
                            line = bufferedReader.readLine();
                        }
                        bufferedReader.close();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println(file.getName() + " has " + lineCount + " lines which includes " + string);
                }
            }).start();
        }
    }
}

