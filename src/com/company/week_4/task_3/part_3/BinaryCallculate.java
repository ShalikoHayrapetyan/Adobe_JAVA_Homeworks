package com.company.week_4.task_3.part_3;

public class BinaryCallculate {
    public static void convertBinary(int num, int delay) {

        if(num<=0){
            throw new RuntimeException("Number should be >0");
        }
        System.out.println("Process start");
        int binary[] = new int[40];
        int index = 0;
        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }
        long startTime=System.currentTimeMillis();
        while (true){
            if(System.currentTimeMillis()-startTime>=delay){
                break;
            }
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        System.out.println();

    }
}

