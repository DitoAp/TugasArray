/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author user
 */
public class AritmatikaOrdo3X3 {
    public static void main(String[] args) {
        
        int matrix1 [][]= new int [3][3];
        matrix1 [0][0]=4;
        matrix1 [0][1]=7;
        matrix1 [0][2]=2;
        matrix1 [1][0]=8;
        matrix1 [1][1]=3;
        matrix1 [1][2]=4;
        matrix1 [2][0]=1;
        matrix1 [2][1]=7;
        matrix1 [2][2]=8;
        
        int matrix2 [][]= new int [3][3];
        matrix2 [0][0]=4;
        matrix2 [0][1]=6;
        matrix2 [0][2]=1;
        matrix2 [1][0]=8;
        matrix2 [1][1]=9;
        matrix2 [1][2]=5;
        matrix2 [2][0]=7;
        matrix2 [2][1]=3;
        matrix2 [2][2]=2;
    
        int matrix3 [][]= new int [3][3];
        matrix3 [0][0]=1;
        matrix3 [0][1]=2;
        matrix3 [0][2]=3;
        matrix3 [1][0]=4;
        matrix3 [1][1]=5;
        matrix3 [1][2]=6;
        matrix3 [2][0]=7;
        matrix3 [2][1]=8;
        matrix3 [2][2]=9;
        
        System.out.println("=====MATRIX 1=====");
        for (int a=0 ; a<matrix1.length ; a++){
            for (int b=0 ; b<matrix1[0].length ; b++){
                System.out.print(matrix1 [a][b]+" ");
            }
            System.out.println("");
        }
                System.out.println("=====MATRIX 2=====");
        for (int a=0 ; a<matrix2.length ; a++){
            for (int b=0 ; b<matrix2[0].length ; b++){
                System.out.print(matrix2 [a][b]+" ");
            }
            System.out.println("");
    }
                        System.out.println("=====MATRIX 3=====");
        for (int a=0 ; a<matrix3.length ; a++){
            for (int b=0 ; b<matrix3[0].length ; b++){
                System.out.print(matrix3 [a][b]+" ");
            }
            System.out.println("");
    }
                System.out.println("=====PENJUMLAHAN=====");
        for (int a=0 ; a<matrix1.length ; a++){
            for (int b=0 ; b<matrix1[0].length ; b++){
                int hasil = matrix1[a][b] + matrix2 [a][b]+ matrix3 [a][b];
                System.out.print(hasil + " ");
}
            System.out.println("");
}
                System.out.println("=====PENGURANGAN=====");
        for (int a=0 ; a<matrix1.length ; a++){
            for (int b=0 ; b<matrix1[0].length ; b++){
                int hasil = matrix1[a][b] - matrix2[a][b]- matrix3[a][b];
                System.out.print(hasil + " ");
            }
            System.out.println(" ");
        }
        System.out.println("=====PERKALIAN=====");
        for (int a=0 ; a<matrix1.length ; a++){
            for (int b=0 ; b<matrix1[0].length ; b++){
                int hasil = matrix1[a][b] * matrix2[a][b]* matrix3[a][b];
                System.out.print(hasil + " ");
            }
            System.out.println(" ");
    }
}
}

