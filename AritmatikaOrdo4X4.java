/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author user
 */
public class AritmatikaOrdo4X4 {
    public static void main(String[] args) {
        
        int matrix1[][]=new int [4][4];
        matrix1 [0][0]=1;
        matrix1 [0][1]=2;
        matrix1 [0][2]=3;
        matrix1 [0][3]=4;
        matrix1 [1][0]=5;
        matrix1 [1][1]=6;
        matrix1 [1][2]=7;
        matrix1 [1][3]=8;
        matrix1 [2][0]=9;
        matrix1 [2][1]=10;
        matrix1 [2][2]=11;
        matrix1 [2][3]=12;
        matrix1 [3][0]=13;
        matrix1 [3][1]=14;
        matrix1 [3][2]=15;
        matrix1 [3][3]=16;
        
        int matrix2[][]=new int [4][4];
        matrix2 [0][0]=1;
        matrix2 [0][1]=9;
        matrix2 [0][2]=3;
        matrix2 [0][3]=4;
        matrix2 [1][0]=10;
        matrix2 [1][1]=6;
        matrix2 [1][2]=7;
        matrix2 [1][3]=8;
        matrix2 [2][0]=9;
        matrix2 [2][1]=10;
        matrix2 [2][2]=1;
        matrix2 [2][3]=8;
        matrix2 [3][0]=3;
        matrix2 [3][1]=7;
        matrix2 [3][2]=5;
        matrix2 [3][3]=2;
        
        int matrix3[][]=new int [4][4];
        matrix3 [0][0]=1;
        matrix3 [0][1]=2;
        matrix3 [0][2]=3;
        matrix3 [0][3]=2;
        matrix3 [1][0]=5;
        matrix3 [1][1]=6;
        matrix3 [1][2]=11;
        matrix3 [1][3]=8;
        matrix3 [2][0]=12;
        matrix3 [2][1]=9;
        matrix3 [2][2]=1;
        matrix3 [2][3]=2;
        matrix3 [3][0]=3;
        matrix3 [3][1]=4;
        matrix3 [3][2]=5;
        matrix3 [3][3]=6;
        
        int matrix4[][]=new int [4][4];
        matrix4 [0][0]=16;
        matrix4 [0][1]=15;
        matrix4 [0][2]=14;
        matrix4 [0][3]=13;
        matrix4 [1][0]=12;
        matrix4 [1][1]=11;
        matrix4 [1][2]=10;
        matrix4 [1][3]=9;
        matrix4 [2][0]=8;
        matrix4 [2][1]=7;
        matrix4 [2][2]=6;
        matrix4 [2][3]=5;
        matrix4 [3][0]=4;
        matrix4 [3][1]=3;
        matrix4 [3][2]=2;
        matrix4 [3][3]=1;
    
        System.out.println("=====MATRIX 1=====");
        for (int a=0 ; a<matrix1.length ; a++){
            for (int b=0 ; b<matrix1[0].length; b++){
                System.out.print(matrix1[a][b]+" ");
            }
            System.out.println("");
        }
                System.out.println("=====MATRIX 2=====");
        for (int a=0 ; a<matrix2.length ; a++){
            for (int b=0 ; b<matrix2[0].length ; b++){
                System.out.print(matrix2[a][b]+" ");
            }
            System.out.println("");
        }        
        System.out.println("=====MATRIX 3=====");
        for (int a=0 ; a<matrix3.length ; a++){
            for (int b=0 ; b<matrix3[0].length ; b++){
                System.out.print(matrix3[a][b]+" ");
            }
            System.out.println("");
        }        
        System.out.println("=====MATRIX 4=====");
        for (int a=0 ; a<matrix4.length ; a++){
            for (int b=0 ; b<matrix4[0].length ; b++){
                System.out.print(matrix4[a][b]+" ");
            }
            System.out.println("");
        }
         System.out.println("=====PENJUMLAHAN=====");
        for (int a=0 ; a<matrix1.length ; a++){
            for (int b=0 ; b<matrix1[0].length ; b++){
                int hasil = matrix1[a][b] + matrix2 [a][b]+ matrix3 [a][b]+ 
                        matrix4 [a][b];
                System.out.print(hasil + " ");
}
            System.out.println("");
}
                System.out.println("=====PENGURANGAN=====");
        for (int a=0 ; a<matrix1.length ; a++){
            for (int b=0 ; b<matrix1[0].length ; b++){
                int hasil = matrix1[a][b] - matrix2[a][b]- matrix3[a][b]- 
                        matrix4 [a][b];
                System.out.print(hasil + " ");
            }
            System.out.println(" ");
        }
        System.out.println("=====PERKALIAN=====");
        for (int a=0 ; a<matrix1.length ; a++){
            for (int b=0 ; b<matrix1[0].length ; b++){
                int hasil = matrix1[a][b] * matrix2[a][b]* matrix3[a][b] * 
                        matrix4[a][b];
                System.out.print(hasil + " ");
            }
            System.out.println(" ");
    }
    }
}
