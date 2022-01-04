package com.teachmeskills.lesson_7_8.vector.example2.Vector;


public abstarct class BaseVector {
    protected double x;
    protected double y;

    public BaseVector() {
    }

    public BaseVector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}
