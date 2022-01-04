package com.teachmeskills.Vectors.Vector;


public abstract class BaseVector implements IVector{
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

    @Override
    public double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    @Override
    public double scalarVector(BaseVector v) {
        return this.x * v.x + this.y * v.y;
    }

    @Override
    public IVector addVector(BaseVector v) {
        return new BaseVector(this.x + v.x, this.y + v.y);
    }

    @Override
    public IVector minusVector(BaseVector v) {
        return new BaseVector(this.x - v.x, this.y - v.y);
    }

    @Override
    public IVector[] randomVector() {
        return new IVector[0];
    }
}
