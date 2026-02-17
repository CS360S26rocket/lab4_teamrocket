package com.example.rocket_events;


public class Square extends Shape {

    private int sideLength;

    // Constructor
    public Square(int x, int y, int sideLength) {
        super(x, y);   // calls Shape constructor
        this.sideLength = sideLength;
    }

    // Getter
    public int getSideLength() {
        return sideLength;
    }

    // Setter
    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }
}
