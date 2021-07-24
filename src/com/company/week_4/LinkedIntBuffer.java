package com.company.week_4;

public class LinkedIntBuffer extends IntBuffer {
    LinkedIntBuffer next;

    public LinkedIntBuffer getNext() {
        return this.next;
    }

    public void setNext(LinkedIntBuffer nextNew) {
        this.next = nextNew;
    }

    @Override
    public String toString() {
        return this.getValue() + " -> " + this.getNext();
    }
}
