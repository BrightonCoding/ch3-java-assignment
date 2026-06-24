/*
 * Squares.java
 * Brighton Ng
 * Stores the square of each element's index in an
 *              integer array of 5 elements, then displays them.
 */

package oned_arrays;

public class Squares {

    public static void main(String[] args) {

        int[] squares = new int[5];

        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i;
        }

        for (int i = 0; i < squares.length; i++) {
            System.out.println("Index " + i + ": " + squares[i]);
        }
    }
}