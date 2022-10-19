/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author user
 */
public class AritmatikaOrdo2X2 {
    public static void main(String[] args) {
        int matrix1 [] []=new int [2][2];
        
        matrix1 [0][0]=2;
        matrix1 [0][1]=4;
        matrix1 [1][0]=1;
        matrix1 [1][1]=5;
        
        int matrix2 [][]=new int [2][2];
        matrix2 [0][0]=1;
        matrix2 [0][1]=5;
        matrix2 [1][0]=3;
        matrix2 [1][1]=2;
        
        System.out.println("====MATRIX 1=====");
        for (int a=0 ; a<matrix1.length ; a++){
            for(int b=0 ; b<matrix1[0].length ; b++){
                System.out.print(matrix1[a][b]+ " ");
            }
            System.out.println(" ");
        }
        System.out.println("=====MATRIX 2=====");
        
        for (int a=0 ; a<matrix2.length ; a++){
            for (int b=0 ; b<matrix2[0].length ; b++){
                System.out.print(matrix2 [a][b] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("=====PENJUMLAHAN=====");
        for (int a=0 ; a<matrix1.length ; a++){
            for (int b=0 ; b<matrix1[0].length ; b++){
                int hasil = matrix1[a][b] + matrix2 [a][b];
                System.out.print(hasil + " ");
            }
            System.out.println(" ");
        }
        System.out.println("=====PENGURANGAN=====");
        for (int a=0 ; a<matrix1.length ; a++){
            for (int b=0 ; b<matrix1[0].length ; b++){
                int hasil = matrix1[a][b] - matrix2[a][b];
                System.out.print(hasil + " ");
            }
            System.out.println(" ");
        }
        System.out.println("=====PERKALIAN=====");
        for (int a=0 ; a<matrix1.length ; a++){
            for (int b=0 ; b<matrix1[0].length ; b++){
                int hasil = matrix1[a][b] * matrix2[a][b];
                System.out.print(hasil + " ");
            }
            System.out.println(" ");
        }
    }
}
