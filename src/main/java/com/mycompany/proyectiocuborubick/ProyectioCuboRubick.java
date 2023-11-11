/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectiocuborubick;

/**
 *
 * @author leonxjass
 */
public class ProyectioCuboRubick {
    
    public static int C1[][] = {{0, 0, 0, 0}, {0, 11, 12, 13}, {0, 14, 15, 16}, {0, 17, 18, 19}};
    public static int C2[][] = {{0, 0, 0, 0}, {0, 21, 22, 23}, {0, 24, 25, 26}, {0, 27, 28, 29}};
    public static int C3[][] = {{0, 0, 0, 0}, {0, 31, 32, 33}, {0, 34, 35, 36}, {0, 37, 38, 39}};
    public static int C4[][] = {{0, 0, 0, 0}, {0, 41, 42, 43}, {0, 44, 45, 46}, {0, 47, 48, 49}};
    public static int C5[][] = {{0, 0, 0, 0}, {0, 51, 52, 53}, {0, 54, 55, 56}, {0, 57, 58, 59}};
    public static int C6[][] = {{0, 0, 0, 0}, {0, 61, 62, 63}, {0, 64, 65, 66}, {0, 67, 68, 69}};
    public static int t,t2;

    public static void ImprimeCara(int C[][]) {
        for (int i = 1; i <= 3; i++) {
            System.out.print("         ");
            for (int j = 1; j <= 3; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
    public static void ImprimeTresCaras(int[][] Cx, int[][] Cy, int[][] Cz){
        for (int f = 1; f <= 3; f++) {
            for(int v = 1; v<=3;v++){
            for (int c = 1; c <= 3; c++){
                if(v==1) System.out.print(Cx[f][c] + " ");
                if(v==2) System.out.print(Cy[f][c] + " ");
                if(v==3) System.out.print(Cz[f][c] + " ");
                }
            }
            System.out.println(" ");
        }
    }
    
    public static void imprimeCubo(){
        ImprimeCara(C1);
        ImprimeTresCaras(C5,C2,C6);
        ImprimeCara(C3);
        ImprimeCara(C4);
    }
    
    public static void rotDerC5() {
    // Guardar los valores originales antes de realizar la rotación
    t = C5[1][3];
    C5[1][3] = C5[3][3];
    C5[3][3] = C5[3][1];
    C5[3][1] = C5[1][1];
    C5[1][1] = t;

    t = C5[2][3];
    C5[2][3] = C5[3][2];
    C5[3][2] = C5[2][1];
    C5[2][1] = C5[1][2];
    C5[1][2] = t;
    }
    
    public static void rotIzqC5() {
    t = C5[1][1];
    C5[1][1] = C5[3][1];
    C5[3][1] = C5[3][3];
    C5[3][3] = C5[1][3];
    C5[1][3] = t;

    t = C5[1][2];
    C5[1][2] = C5[2][1];
    C5[2][1] = C5[3][2];
    C5[3][2] = C5[2][3];
    C5[2][3] = t;
    }
    
    public static void rotDerC6(){
        t = C6[1][1];
        C6[1][3] = C6[1][1];
        C6[1][1] = C6[3][1];
        C6[3][1] = C6[3][3];
        C6[3][3] = t;
        
        t = C6[1][2];
        C6[1][2] = C6[2][1];
        C6[2][1] = C6[3][2];
        C6[3][2] = C6[2][3];
        C6[2][3] = t;
    }
    
    public static void rotIzqC6(){
        t = C6[1][1];
        C6[1][1] = C6[1][3];
        C6[1][3] = C6[3][3];
        C6[3][3] = C6[3][1];
        C6[3][1] = t;

        t = C6[1][2];
        C6[1][2] = C6[2][3];
        C6[2][3] = C6[3][2];
        C6[3][2] = C6[2][1];
        C6[2][1] = t;
    }
    
    public static void lineA1Up(){
        t = C1[1][1];
        C1[1][1] = C2[1][1];
        C2[1][1] = C3[1][1];
        C3[1][1] = C4[1][1];
        C4[1][1] = t;
        
        t = C1[2][1];
        C1[2][1] = C2[2][1];
        C2[2][1] = C3[2][1];
        C3[2][1] = C4[2][1];
        C4[2][1] = t;
        
        t = C1[3][1];
        C1[3][1] = C2[3][1];
        C2[3][1] = C3[3][1];
        C3[3][1] = C4[3][1];
        C4[3][1] = t;
    }
    
    public static void lineA2Up(){
        t=C1[1][2];
        C1[1][2]=C2[1][2];
        C2[1][2]=C3[1][2];
        C3[1][2]=C4[1][2];
        C4[1][2]=t;
        
        t=C1[2][2];
        C1[2][2]=C2[2][2];
        C2[2][2]=C3[2][2];
        C3[2][2]=C4[2][2];
        C4[2][2]=t;
        
        t=C1[3][2];
        C1[3][2]=C2[3][2];
        C2[3][2]=C3[3][2];
        C3[3][2]=C4[3][2];
        C4[3][2]=t;
        //rotDerC6();
        imprimeCubo();
    }
    
    public static void lineA3Up(){
        t=C1[1][3];
        C1[1][3]=C2[1][3];
        C2[1][3]=C3[1][3];
        C3[1][3]=C4[1][3];
        C4[1][3]=t;
        
        t=C1[2][3];
        C1[2][3]=C2[2][3];
        C2[2][3]=C3[2][3];
        C3[2][3]=C4[2][3];
        C4[2][3]=t;
        
        t=C1[3][3];
        C1[3][3]=C2[3][3];
        C2[3][3]=C3[3][3];
        C3[3][3]=C4[3][3];
        C4[3][3]=t;
        rotDerC6();
    }
    
    public static void lineB1Dwn(){
        t = C4[3][1];
        C4[3][1] = C3[3][1];
        C3[3][1] = C2[3][1];
        C2[3][1] = C1[3][1];
        C1[3][1] = t;
        
        t = C4[2][1];
        C4[2][1] = C3[2][1];
        C3[2][1] = C2[2][1];
        C2[2][1] = C1[2][1];
        C1[2][1] = t;
        
        t = C4[1][1];
        C4[1][1] = C3[1][1];
        C3[1][1] = C2[1][1];
        C2[1][1] = C1[1][1];
        C1[1][1] = t;
    }
    
    public static void lineB2Dwn(){
        t = C4[3][2];
        C4[3][2] = C3[3][2];
        C3[3][2] = C2[3][2];
        C2[3][2] = C1[3][2];
        C1[3][2] = t;
        
        t = C4[2][2];
        C4[2][2] = C3[2][2];
        C3[2][2] = C2[2][2];
        C2[2][2] = C1[2][2];
        C1[2][2] = t;
        
        t = C4[1][2];
        C4[1][2] = C3[1][2];
        C3[1][2] = C2[1][2];
        C2[1][2] = C1[1][2];
        C1[1][2] = t;
    }
    
    public static void lineB3Dwn(){
        t = C4[3][3];
        C4[3][3] = C3[3][3];
        C3[3][3] = C2[3][3];
        C2[3][3] = C1[3][3];
        C1[3][3] = t;
        
        t = C4[2][3];
        C4[2][3] = C3[2][3];
        C3[2][3] = C2[2][3];
        C2[2][3] = C1[2][3];
        C1[2][3] = t;
        
        t = C4[1][3];
        C4[1][3] = C3[1][3];
        C3[1][3] = C2[1][3];
        C2[1][3] = C1[1][3];
        C1[1][3] = t;
        rotIzqC6();
    }
    
    public static void main(String[] args) {
//       System.out.println("\t A1 A2 A3\n");
//       imprimeCubo();
//       System.out.println("");
//       lineA3Up();
//       imprimeCubo();
//       System.out.println("\n\t B1 B2 B3\n");
        ImprimeCara(C6);
        System.out.println("");
        rotDerC6();    
        ImprimeCara(C6);
    }
}
