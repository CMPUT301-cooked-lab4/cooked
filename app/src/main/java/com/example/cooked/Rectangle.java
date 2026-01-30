package com.example.cooked;

public class Rectangle extends Shape {
    private int width;
    private int height;
    
    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(int x, int y, int width, int height, String color) {
        super(x, y);
        this.width = width;
        this.height = height;
        this.colour = color;
    }
    
    public int getArea() {
        return width * height;
    }
    
    public int getPerimeter() {
        return 2 * (width + height);
    }

    public boolean containsPoint(int px, int py) {
        return px >= x && px <= x + width && py >= y && py <= y + height;
    }

    public int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    @Override
    public String toString() {
        return String.format("Rectangle at (%d, %d), size: %dx%d, color: %s", 
                           x, y, width, height, colour);
    }
}
