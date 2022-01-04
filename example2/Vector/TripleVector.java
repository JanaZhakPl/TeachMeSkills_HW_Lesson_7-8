package com.teachmeskills.lesson_7_8.vector.example2.Vector;

public class TripleVector extends BaseVector{
    private double z;

    public TripleVector(double z) {
        this.z = z;
    }

    public TripleVector(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


    public double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

       public double scalarVector(TripleVector v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

       public TripleVector addVector(TripleVector v) {
        return new TripleVector(this.x + v.x, this.y + v.y, this.z + v.z);
    }

      public TripleVector minusVector(TripleVector v) {
        return new TripleVector(this.x - v.x, this.y - v.y, this.z - v.z);
    }

        public TripleVector[] randomVector(int n) {
        TripleVector[] vectors = new TripleVector[n];
            for(int i =0; i < n; i++){
                vectors[i] = new TripleVector (Math.random(), Math.random(), Math.random());
            }
             for (int i = 0; i < vectors.length; i++) {
                  System.out.println(vectors[i]);
    }return vectors;}


    @Override
    public String toString() {
        return "TripleVector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}


