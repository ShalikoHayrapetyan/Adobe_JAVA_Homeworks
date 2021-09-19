package com.company.week_5.task_1;

import java.util.Arrays;

public class CustomArrayList<T extends Comparable> {
    private int MAX_SIZE = 1000;
    private int size = 0;
    private int length;
    private T[] array;

    public CustomArrayList() {

        this.array = (T[]) new Comparable[size];
    }

    public void addToBeginning(T element) {

        addByIndex(element, 0);
//        T[] tempArray = (T[]) new Comparable[++size];
//        tempArray[0]=element;
//        for (int i=1; i<array.length; i++ ){
//            tempArray[i]=array[i-1];
//        }
//        array=tempArray;
    }

    public void addToEnd(T element) {
        this.addByIndex(element, size);
//        T[] tempArray = (T[]) new Comparable[++size];
//        tempArray[size-1]=element;
//        for (int i=0; i<size-1; i++ ){
//            tempArray[i]=array[i];
//        }
//        array=tempArray;
    }

    public void addByIndex(T element, Integer index) {
        if (++size > MAX_SIZE) {
            throw new RuntimeException("Array is full");
        }
        T[] tempArray = (T[]) new Comparable[size];
        tempArray[index] = element;
        for (int i = 0; i < size; i++) {
            if (i < index) {
                tempArray[i] = array[i];
            } else if (i > index) {
                tempArray[i] = array[i - 1];
            }
        }
        array = tempArray;
    }

    public void deleteElement(T element) {
        int index = findIndex(element);
        if (index != -1) deleteByIndex(index);
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index > size) {
            throw new RuntimeException(index + " is out of bound");
        }
        T[] tempArray = (T[]) new Comparable[--size];
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                tempArray[i] = array[i];
            } else if (i > index) {
                tempArray[i - 1] = array[i];
            }
        }
        array = tempArray;
    }

    public int findIndex(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
