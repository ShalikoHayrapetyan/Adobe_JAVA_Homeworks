package com.company.week_10.Binary_file;

import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        File file = new File("C:\\Users\\Acer\\Desktop\\Adobe_JAVA_Homeworks\\src\\com\\company\\week_10\\Binary_file\\filetest.txt");


        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println(Integer.toBinaryString(new Random().nextInt(200)));
        printWriter.println(Integer.toBinaryString(new Random().nextInt(300)));

        printWriter.close();

        Thread.sleep(10000);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line;
        Integer sum = 0;
        while ((line = bufferedReader.readLine()) != null) {
            sum += Integer.parseInt(line, 2);
        }
        bufferedReader.close();


        PrintWriter printWriter1 = new PrintWriter(new FileOutputStream(file,true));
        printWriter1.append(Integer.toBinaryString(sum));
        printWriter1.close();

    }
}
