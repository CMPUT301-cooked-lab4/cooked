package com.example.cooked;

public abstract class Shape {
    public int x;
    public int y;
    String color = "blue";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}
