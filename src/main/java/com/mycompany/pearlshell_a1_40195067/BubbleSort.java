/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pearlshell_a1_40195067;

/**
 *
 * @author 40195067
 */
public class BubbleSort {
    public static void sortAscending(int[] temp23, int[] temp24, String[] months) {

        for (int i = 0; i < temp23.length - 1; i++) {
            for (int j = 0; j < temp23.length - 1 - i; j++) {

                if (temp23[j] > temp23[j + 1]) {

                    int temp = temp23[j];
                    temp23[j] = temp23[j + 1];
                    temp23[j + 1] = temp;

                    int temp2 = temp24[j];
                    temp24[j] = temp24[j + 1];
                    temp24[j + 1] = temp2;

                    String temp3 = months[j];
                    months[j] = months[j + 1];
                    months[j + 1] = temp3;
                }
            }
        }
    }
}


