package com.company.week_2;

public class IntBuffer {
    protected Integer value;

    public static void main(String[] args) {

        IntBuffer intBuffer = new IntBuffer();
        intBuffer.value = 11;

        LinkedIntBuffer linkedIntBuffer1 = new LinkedIntBuffer();
        LinkedIntBuffer linkedIntBuffer2 = new LinkedIntBuffer();
        LinkedIntBuffer linkedIntBuffer3 = new LinkedIntBuffer();
        LinkedIntBuffer linkedIntBuffer4 = new LinkedIntBuffer();

        linkedIntBuffer1.setValue(1);
        linkedIntBuffer2.setValue(3);
        linkedIntBuffer3.setValue(2);
        linkedIntBuffer4.setValue(4);

        linkedIntBuffer1.setNext(linkedIntBuffer2);
        linkedIntBuffer2.setNext(linkedIntBuffer3);
        linkedIntBuffer3.setNext(linkedIntBuffer4);

        intBuffer.toString();
        System.out.println(linkedIntBuffer1);
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        System.out.println(this.value);
        return null;
    }

}
