package com.teachmeskills.lesson_7_8.vector.example2;

import com.teachmeskills.lesson_7_8.vector.example2.Vector.DoubleVector;
import com.teachmeskills.lesson_7_8.vector.example2.Vector.TripleVector;

public class Main {

        public static void main(String[] args) {

            DoubleVector vector2D1 = new DoubleVector(3,-3);
            DoubleVector vector2D2 = new DoubleVector(3, -3);
            TripleVector vector3D1 = new TripleVector(5,4,4);
            TripleVector vector3D2 = new TripleVector(1,-5,4);

            System.out.println("Double-vector length is " + vector2D1.length());
            System.out.println("Triple-vector length is " + vector3D2.length());
            System.out.println("scalar 2D is " + vector2D1.scalarVector(vector2D2));
            System.out.println("scalar 3D is " + vector3D1.scalarVector(vector3D2));
            System.out.println("addition 2D is " + vector2D1.addVector(vector2D2));
            System.out.println("addition 3D is " + vector3D1.addVector(vector3D2));
            System.out.println("subtraction 2D is " + vector2D1.minusVector(vector2D2));
            System.out.println("subtraction 3D is " + vector3D1.minusVector(vector3D2));

            if (vector3D1.equals(vector3D2)){
                System.out.println("they are equal");
            } else {
                System.out.println("they aren't equal");
            }
   }
}
