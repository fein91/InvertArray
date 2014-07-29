/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invertarray;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author otatarik
 */
public class InvertArray {

    private static final int MAX_INT = 10000;

    private static int[] createMatrix(int size) {
        Random rnd = new Random();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = rnd.nextInt(MAX_INT);
        }
        return result;
    }

    private static void invertArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                temp = array[j + 1];
                array[j + 1] = array[j];
                array[j] = temp;
            }
            System.out.println("Step "+i+": "+Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] a = createMatrix(6);
        System.out.println("Input: "+Arrays.toString(a));
        invertArray(a);
        System.out.println("Output: "+Arrays.toString(a));
    }

}
