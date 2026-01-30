package com.example.cooked;

public class Heart extends Shape {
    private int size;

    public Heart(int size, String color) {
        super(color);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a heart of size " + size + " and color " + color);
    }
}
