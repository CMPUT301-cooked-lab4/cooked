package com.example.cooked;

public abstract class Shape {
    public int x;
    public int y;
    public String color = "blue";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getColor() {
        return color;
    }
}
