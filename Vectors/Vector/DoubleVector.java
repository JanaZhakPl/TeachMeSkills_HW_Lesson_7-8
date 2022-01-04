package com.teachmeskills.Vectors.Vector;

public class DoubleVector extends BaseVector {

    public DoubleVector() {
    }

    public DoubleVector(double x, double y) {
        super(x, y);
    }

    public double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }


    public double scalarVector(DoubleVector v) {
        return this.x * v.x + this.y * v.y;
    }


    public DoubleVector addVector(DoubleVector v) {
        return new DoubleVector(this.x + v.x, this.y + v.y);
    }


    public DoubleVector minusVector(DoubleVector v) {
        return new DoubleVector(this.x - v.x, this.y - v.y);
    }


    public DoubleVector[] randomVector(int n) {
        DoubleVector[] vectors = new DoubleVector[n];
        for(int i =0; i < n; i++){
            vectors[i] = new DoubleVector(Math.random(), Math.random());
        }
        return vectors;
    }

    public String toString() {
        return "DoubleVector{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

