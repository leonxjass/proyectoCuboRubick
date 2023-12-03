/* Anderson Jassiel Leon Zelaya 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectiocuborubick;

//import static com.mycompany.proyectiocuborubick.ProyectioCuboRubick.C1;
//import static com.mycompany.proyectiocuborubick.ProyectioCuboRubick.C2;
//import static com.mycompany.proyectiocuborubick.ProyectioCuboRubick.C3;
//import static com.mycompany.proyectiocuborubick.ProyectioCuboRubick.C4;
//import static com.mycompany.proyectiocuborubick.ProyectioCuboRubick.C5;
//import static com.mycompany.proyectiocuborubick.ProyectioCuboRubick.C6;
//import static com.mycompany.proyectiocuborubick.ProyectioCuboRubick.imprimeCubo;
//import static com.mycompany.proyectiocuborubick.ProyectioCuboRubick.rotDerC6;
//import static com.mycompany.proyectiocuborubick.ProyectioCuboRubick.t;

import java.awt.Color;

/**
 *
 * @author leonj
 */
public class FormCubo extends javax.swing.JFrame {
    //variables publicas utiles
    public static int contadorClicks=0;
    public static int contadorClicksColores=0;
    public static int t;
    
    //Matrices de colores
    public static int C1[][] = {{0, 0, 0, 0}, {0, 11, 12, 13}, {0, 14, 15, 16}, {0, 17, 18, 19}};
    public static int C2[][] = {{0, 0, 0, 0}, {0, 21, 22, 23}, {0, 24, 25, 26}, {0, 27, 28, 29}};
    public static int C3[][] = {{0, 0, 0, 0}, {0, 31, 32, 33}, {0, 34, 35, 36}, {0, 37, 38, 39}};
    public static int C4[][] = {{0, 0, 0, 0}, {0, 41, 42, 43}, {0, 44, 45, 46}, {0, 47, 48, 49}};
    public static int C5[][] = {{0, 0, 0, 0}, {0, 51, 52, 53}, {0, 54, 55, 56}, {0, 57, 58, 59}};
    public static int C6[][] = {{0, 0, 0, 0}, {0, 61, 62, 63}, {0, 64, 65, 66}, {0, 67, 68, 69}};
    
    //creamos una matriz que maneje colores
    public static Color Rojo =      Color.red;
    public static Color Amarilla =  Color.yellow;
    public static Color Naranja =   Color.orange;
    public static Color Blanco =    Color.white;
    public static Color Verde =     Color.green;
    public static Color Azul =      Color.cyan;
     
    public static Color COL1[][] = {{Rojo, Rojo, Rojo, Rojo}, {Rojo, Rojo, Rojo, Rojo},{Rojo, Rojo, Rojo, Rojo},{Rojo, Rojo, Rojo, Rojo}};
    public static Color COL2[][] = {{Amarilla, Amarilla, Amarilla, Amarilla},{Amarilla, Amarilla, Amarilla, Amarilla},{Amarilla, Amarilla, Amarilla, Amarilla},{Amarilla, Amarilla, Amarilla, Amarilla}};
    public static Color COL3[][] = {{Naranja, Naranja, Naranja, Naranja},{Naranja, Naranja, Naranja, Naranja},{Naranja, Naranja, Naranja, Naranja},{Naranja, Naranja, Naranja, Naranja}};
    public static Color COL4[][] = {{Blanco, Blanco, Blanco, Blanco},{Blanco, Blanco, Blanco, Blanco},{Blanco, Blanco, Blanco, Blanco},{Blanco, Blanco, Blanco, Blanco}};
    public static Color COL5[][] = {{Verde, Verde, Verde, Verde},{Verde, Verde, Verde, Verde},{Verde, Verde, Verde, Verde},{Verde, Verde, Verde, Verde}};
    public static Color COL6[][] = {{Azul, Azul, Azul, Azul},{Azul, Azul, Azul, Azul},{Azul, Azul, Azul, Azul},{Azul, Azul, Azul, Azul}};
    
    //Acciones de matrices y colores
    
    public void ColoresOnC1(){
       txtC1_11.setBackground(COL1[1][1]);
       txtC1_12.setBackground(COL1[1][2]);
       txtC1_13.setBackground(COL1[1][3]);
       txtC1_21.setBackground(COL1[2][1]);
       txtC1_22.setBackground(COL1[2][2]);
       txtC1_23.setBackground(COL1[2][3]);
       txtC1_31.setBackground(COL1[3][1]);
       txtC1_32.setBackground(COL1[3][2]);
       txtC1_33.setBackground(COL1[3][3]);
    }
    
    public void ColoresOFFC1(){
       txtC1_11.setBackground(Blanco);
       txtC1_12.setBackground(Blanco);
       txtC1_13.setBackground(Blanco);
       txtC1_21.setBackground(Blanco);
       txtC1_22.setBackground(Blanco);
       txtC1_23.setBackground(Blanco);
       txtC1_31.setBackground(Blanco);
       txtC1_32.setBackground(Blanco);
       txtC1_33.setBackground(Blanco);
    }
    
    public void ColoresOnC2(){
       txtC2_11.setBackground(COL2[1][1]);
       txtC2_12.setBackground(COL2[1][2]);
       txtC2_13.setBackground(COL2[1][3]);
       txtC2_21.setBackground(COL2[2][1]);
       txtC2_22.setBackground(COL2[2][2]);
       txtC2_23.setBackground(COL2[2][3]);
       txtC2_31.setBackground(COL2[3][1]);
       txtC2_32.setBackground(COL2[3][2]);
       txtC2_33.setBackground(COL2[3][3]);
    }
    
    public void ColoresOFFC2(){
       txtC2_11.setBackground(Blanco);
       txtC2_12.setBackground(Blanco);
       txtC2_13.setBackground(Blanco);
       txtC2_21.setBackground(Blanco);
       txtC2_22.setBackground(Blanco);
       txtC2_23.setBackground(Blanco);
       txtC2_31.setBackground(Blanco);
       txtC2_32.setBackground(Blanco);
       txtC2_33.setBackground(Blanco);
    }
    
    public void ColoresOnC3(){
       txtC3_11.setBackground(COL3[1][1]);
       txtC3_12.setBackground(COL3[1][2]);
       txtC3_13.setBackground(COL3[1][3]);
       txtC3_21.setBackground(COL3[2][1]);
       txtC3_22.setBackground(COL3[2][2]);
       txtC3_23.setBackground(COL3[2][3]);
       txtC3_31.setBackground(COL3[3][1]);
       txtC3_32.setBackground(COL3[3][2]);
       txtC3_33.setBackground(COL3[3][3]);
    }
    
    public void ColoresOFFC3(){
       txtC3_11.setBackground(Blanco);
       txtC3_12.setBackground(Blanco);
       txtC3_13.setBackground(Blanco);
       txtC3_21.setBackground(Blanco);
       txtC3_22.setBackground(Blanco);
       txtC3_23.setBackground(Blanco);
       txtC3_31.setBackground(Blanco);
       txtC3_32.setBackground(Blanco);
       txtC3_33.setBackground(Blanco);;
    }
    
    public void ColoresOnC4(){
       txtC4_11.setBackground(COL4[1][1]);
       txtC4_12.setBackground(COL4[1][2]);
       txtC4_13.setBackground(COL4[1][3]);
       txtC4_21.setBackground(COL4[2][1]);
       txtC4_22.setBackground(COL4[2][2]);
       txtC4_23.setBackground(COL4[2][3]);
       txtC4_31.setBackground(COL4[3][1]);
       txtC4_32.setBackground(COL4[3][2]);
       txtC4_33.setBackground(COL4[3][3]);
    }
    
    public void ColoresOFFC4(){
       txtC4_11.setBackground(Blanco);
       txtC4_12.setBackground(Blanco);
       txtC4_13.setBackground(Blanco);
       txtC4_21.setBackground(Blanco);
       txtC4_22.setBackground(Blanco);
       txtC4_23.setBackground(Blanco);
       txtC4_31.setBackground(Blanco);
       txtC4_32.setBackground(Blanco);
       txtC4_33.setBackground(Blanco);
    }
    
    public void ColoresOnC5(){
       txtC5_11.setBackground(COL5[1][1]);
       txtC5_12.setBackground(COL5[1][2]);
       txtC5_13.setBackground(COL5[1][3]);
       txtC5_21.setBackground(COL5[2][1]);
       txtC5_22.setBackground(COL5[2][2]);
       txtC5_23.setBackground(COL5[2][3]);
       txtC5_31.setBackground(COL5[3][1]);
       txtC5_32.setBackground(COL5[3][2]);
       txtC5_33.setBackground(COL5[3][3]);
    }
    
    public void ColoresOFFC5(){
       txtC5_11.setBackground(Blanco);
       txtC5_12.setBackground(Blanco);
       txtC5_13.setBackground(Blanco);
       txtC5_21.setBackground(Blanco);
       txtC5_22.setBackground(Blanco);
       txtC5_23.setBackground(Blanco);
       txtC5_31.setBackground(Blanco);
       txtC5_32.setBackground(Blanco);
       txtC5_33.setBackground(Blanco);
    }
    
    public void ColoresOnC6(){
       txtC6_11.setBackground(COL6[1][1]);
       txtC6_12.setBackground(COL6[1][2]);
       txtC6_13.setBackground(COL6[1][3]);
       txtC6_21.setBackground(COL6[2][1]);
       txtC6_22.setBackground(COL6[2][2]);
       txtC6_23.setBackground(COL6[2][3]);
       txtC6_31.setBackground(COL6[3][1]);
       txtC6_32.setBackground(COL6[3][2]);
       txtC6_33.setBackground(COL6[3][3]);
    }
    
    public void ColoresOFFC6(){
       txtC6_11.setBackground(Blanco);
       txtC6_12.setBackground(Blanco);
       txtC6_13.setBackground(Blanco);
       txtC6_21.setBackground(Blanco);
       txtC6_22.setBackground(Blanco);
       txtC6_23.setBackground(Blanco);
       txtC6_31.setBackground(Blanco);
       txtC6_32.setBackground(Blanco);
       txtC6_33.setBackground(Blanco);
    }
    
    void ColoresON(){
        ColoresOnC1();
        ColoresOnC2();
        ColoresOnC3();
        ColoresOnC4();
        ColoresOnC5();
        ColoresOnC6();
    }
    
    void ColoresOFF(){
        ColoresOFFC1();
        ColoresOFFC2();
        ColoresOFFC3();
        ColoresOFFC4();
        ColoresOFFC5();
        ColoresOFFC6();
    }
    
    //Rotaciones absolutas
    
    public void rotIzqC(int C[][]) {
        int t;
        
        t= C[1][3];
        C[1][3]= C[3][3];
        C[3][3]= C[3][1];
        C[3][1]= C[1][1];
        C[1][1]= t;
        
        t= C[1][2];
        C[1][2]= C[2][3];
        C[2][3]= C[3][2];
        C[3][2]= C[2][1];
        C[2][1]= t;
    }
    
    public void rotDerC(int C[][]) {
        int t;
        
        //Movimiento rotación a la derecha de las esquinas
        t      = C[1][3];
        C[1][3]= C[1][1];
        C[1][1]= C[3][1];
        C[3][1]= C[3][3];
        C[3][3]= t;
        
        //Movimiento rotación a la derecha de los centros
        t      = C[1][2];
        C[1][2]= C[2][1];
        C[2][1]= C[3][2];
        C[3][2]= C[2][3];
        C[2][3]= t;
    }
    
    //Movimientos
    
    public void rotDerC5() {
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
    
    public void rotIzqC5() {
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
    
    public void rotDerC6() {
        // Rotación de las esquinas
        t = C6[1][3];
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
    
    public void rotIzqC6(){        
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
    
    public void lineA1Up(){
        for(int i=1; i<=3;i++){
        t = C1[i][1];
        C1[i][1] = C2[i][1];
        C2[i][1] = C3[i][1];
        C3[i][1] = C4[i][1];
        C4[i][1] = t;
        }
        A1Col();
        rotDerC5();
        if(contadorClicks == 1) etiquetasOn();
        if(contadorClicksColores == 1) ColoresON();
    }
    
    public void lineA2Up(){
        for(int i=0; i<=3;i++){
        t=C1[i][2];
        C1[i][2]=C2[i][2];
        C2[i][2]=C3[i][2];
        C3[i][2]=C4[i][2];
        C4[i][2]=t;
        }
        A2Col();
        if(contadorClicks == 1) etiquetasOn();
        if(contadorClicksColores == 1) ColoresON();
    }
    
    public void lineA3Up(){
        for(int i=1; i<=3;i++){
        t=C1[i][3];
        C1[i][3]=C2[i][3];
        C2[i][3]=C3[i][3];
        C3[i][3]=C4[i][3];
        C4[i][3]=t;
        }
        
        A3Col();
        rotDerC6();
        if(contadorClicks == 1) etiquetasOn();
        if(contadorClicksColores == 1) ColoresON();
    }
    
    public void lineB1Dwn(){
        for(int k=0; k<=3; k++){
        t = C4[k][1];
        C4[k][1] = C3[k][1];
        C3[k][1] = C2[k][1];
        C2[k][1] = C1[k][1];
        C1[k][1] = t;
        }
        B1Col();
        rotIzqC5();
        if(contadorClicks == 1) etiquetasOn();
        if(contadorClicksColores == 1) ColoresON();
    }
    
    public void lineB2Dwn(){
        for(int i=1; i<=3;i++){
        t = C4[i][2];
        C4[i][2] = C3[i][2];
        C3[i][2] = C2[i][2];
        C2[i][2] = C1[i][2];
        C1[i][2] = t;}
        B2Col();
        etiquetasOn();
        if(contadorClicks == 1) etiquetasOn();
        if(contadorClicksColores == 1) ColoresON();
    }
    
    public void lineB3Dwn(){
        for(int k=1; k<=3;k++){
            t = C4[k][3];
            C4[k][3] = C3[k][3];
            C3[k][3] = C2[k][3];
            C2[k][3] = C1[k][3];
            C1[k][3] = t;
        }
        B3Col();
        rotIzqC6();
        if(contadorClicks == 1) etiquetasOn();
        if(contadorClicksColores == 1) ColoresON();    
    }
    
    public void D1(){
        int t;
        for(int i=1;i<=3;i++) {
            t= C2[1][i];
            C2[1][i]= C5[1][i];
            C5[1][i]= C4[3][i];
            C4[3][i]= C6[1][i];
            C6[1][i]= t;
        }
        rotIzqC(C1);
        RotIzqCCol(COL1);
        D1Col();
        if(contadorClicks == 1) etiquetasOn();
        if(contadorClicksColores == 1) ColoresON();
    }
    
    public void D2(){
        int t;
        for(int k=0; k<3;k++){
        t= C2[2][k];
        C2[2][k]= C5[2][k];
        C5[2][k]= C4[2][k];
        C4[2][k]= C6[2][k];
        C6[2][k]= t;
        }
        
        D2Col();
        if(contadorClicks == 1) etiquetasOn();
        if(contadorClicksColores == 1) ColoresON();
    }
    
    public void D3(){
        int t;
        for(int i=1;i<=3;i++) {
            t= C2[3][i];
            C2[3][i]= C5[3][i];
            C5[3][i]= C4[1][i];
            C4[1][i]= C6[3][i];
            C6[3][i]= t;
        }
        
        rotDerC(C3);
        RotDerCCol(COL3);
        D3Col();
        if(contadorClicks == 1) etiquetasOn();
        if(contadorClicksColores == 1) ColoresON();
    }
    
    public void I1(){
        int t;
        for(int i=1;i<=3;i++) {
            t= C6[1][i];
            C6[1][i]= C4[3][i];
            C4[3][i]= C5[1][i];
            C5[1][i]= C2[1][i];
            C2[1][i]= t;
        }
        rotDerC(C1);
        RotDerCCol(COL1);
        I1Col();
        if(contadorClicks == 1) etiquetasOn();
        if(contadorClicksColores == 1) ColoresON();
    }
    
    public void I2(){
        int t;
        for(int j=0; j<3; j++){
            t= C6[2][1];
            C6[2][1]= C4[2][3];
            C4[2][3]= C5[2][1];
            C5[2][1]= C2[2][1];
            C2[2][1]= t;
        }
        I2Col();
        if(contadorClicks == 1) etiquetasOn();
        if(contadorClicksColores == 1) ColoresON();
    }
    
    public void I3(){
        int t;
        for(int i=1;i<=3;i++) {
            t       = C6[3][i];
            C6[3][i]= C4[1][i];
            C4[1][i]= C5[3][i];
            C5[3][i]= C2[3][i];
            C2[3][i]= t;
        }
        rotIzqC(C3);
        RotIzqCCol(COL3);
        if(contadorClicks == 1) etiquetasOn();
        if(contadorClicksColores == 1) ColoresON();
    }
    
    public void RI1(){}
    public void RI2(){}
    public void RI3(){}
    
    public void RD1(){}
    public void RD2(){}
    public void RD3(){}
    
    //Asignar color a las etiquetas
    
    public void A1Col(){
        Color t2;
        for(int i=1; i<=3;i++){
        t2=COL1[i][1];
        COL1[i][1]=COL2[i][1];
        COL2[i][1]=COL3[i][1];
        COL3[i][1]=COL4[i][1];
        COL4[i][1]=t2;
        }
    }
    
    public void A2Col(){
        Color t2;
        for(int i=1; i<=3;i++){
        t2=COL1[i][2];
        COL1[i][2]=COL2[i][2];
        COL2[i][2]=COL3[i][2];
        COL3[i][2]=COL4[i][2];
        COL4[i][2]=t2;
        }
    }
    
    public void A3Col(){
        Color t3;
        for(int i=1; i<=3;i++){
        t3=COL1[i][3];
        COL1[i][3]=COL2[i][3];
        COL2[i][3]=COL3[i][3];
        COL3[i][3]=COL4[i][3];
        COL4[i][3]=t3;
        }
    }
    
    public void B1Col(){
    for(int k=0; k<=3; k++){
    Color t = COL4[k][1];
    COL4[k][1] = COL3[k][1];
    COL3[k][1] = COL2[k][1];
    COL2[k][1] = COL1[k][1];
    COL1[k][1] = t;
        }
    }
    
    public void B2Col(){
    for(int k=0; k<=3; k++){
    Color t = COL4[k][2];
    COL4[k][2] = COL3[k][2];
    COL3[k][2] = COL2[k][2];
    COL2[k][2] = COL1[k][2];
    COL1[k][2] = t;
        }
    }
    
    public void B3Col(){
    for(int k=0; k<=3; k++){
    Color t = COL4[k][3];
    COL4[k][3] = COL3[k][3];
    COL3[k][3] = COL2[k][3];
    COL2[k][3] = COL1[k][3];
    COL1[k][3] = t;
        }
    }
    
    public void D1Col() {
        Color t;
        for(int i=1;i<=3;i++) {
            t       = COL2[1][i];
            COL2[1][i]= COL5[1][i];
            COL5[1][i]= COL4[3][i];
            COL4[3][i]= COL6[1][i];
            COL6[1][i]= t;
        }
    }
    
    public void D2Col() {
        Color t;
  
        t= COL2[2][1];
        COL2[2][1]= COL5[2][1];
        COL5[2][1]= COL4[2][3];
        COL4[2][3]= COL6[2][1];
        COL6[2][1]= t;
        
        t= COL2[2][2];
        COL2[2][2]= COL5[2][2];
        COL5[2][2]= COL4[2][2];
        COL4[2][2]= COL6[2][2];
        COL6[2][2]= t;
        
        t= COL2[2][3];
        COL2[2][3]= COL5[2][3];
        COL5[2][3]= COL4[2][1];
        COL4[2][1]= COL6[2][3];
        COL6[2][3]= t;
    }
    
    public void D3Col(){
        Color t;
        for(int i=1;i<=3;i++) {
            t= COL2[3][i];
            COL2[3][i]= COL5[3][i];
            COL5[3][i]= COL4[1][i];
            COL4[1][i]= COL6[3][i];
            COL6[3][i]= t;
        }
    }
    
    public void I1Col(){
        Color t;
        for(int i=1;i<=3;i++) {
            t= COL6[1][i];
            COL6[1][i]= COL4[3][i];
            COL4[3][i]= COL5[1][i];
            COL5[1][i]= COL2[1][i];
            COL2[1][i]= t;
        }
    }
    
    public void I2Col(){
        Color t;
        
        for(int o=0; 0<3;o++){
            t= COL6[2][o];
            COL6[2][o]= COL4[2][o];
            COL4[2][o]= COL5[2][o];
            COL5[2][o]= COL2[2][o];
            COL2[2][o]= t;
        }
    }
    
    public void I3Col(){
        Color t;
        for(int i=1;i<=3;i++) {
            t= COL6[3][i];
            COL6[3][i]= COL4[1][i];
            COL4[1][i]= COL5[3][i];
            COL5[3][i]= COL2[3][i];
            COL2[3][i]= t;
        }
    }
    
    public void RI1Col(){}
    public void RI2Col(){}
    public void RI3Col(){}
    
    public void RD1Col(){}
    public void RD2Col(){}
    public void RD3Col(){}
    
    //Movimientos de columnas de color
    
    public void RotDerCCol(Color COL[][]) {
        Color t;
        
        //Movimiento rotación a la derecha de las esquinas
        t= COL[1][3];
        COL[1][3]= COL[1][1];
        COL[1][1]= COL[3][1];
        COL[3][1]= COL[3][3];
        COL[3][3]= t;
        
        //Movimiento rotación a la derecha de los centros
        t        = COL[1][2];
        COL[1][2]= COL[2][1];
        COL[2][1]= COL[3][2];
        COL[3][2]= COL[2][3];
        COL[2][3]= t;
    }
    
    public void RotIzqCCol(Color COL[][]) {
        Color t;
        
        //Movimiento rotación a la izquierda de las esquinas
        t= COL[1][3];
        COL[1][3]= COL[3][3];
        COL[3][3]= COL[3][1];
        COL[3][1]= COL[1][1];
        COL[1][1]= t;
        
        //Movimiento rotación a la izquierda de los centros
        t= COL[1][2];
        COL[1][2]= COL[2][3];
        COL[2][3]= COL[3][2];
        COL[3][2]= COL[2][1];
        COL[2][1]= t;
    }
    
    /**
     * Creates new form FormCubo, Segmentos de etiquetas
     */
    
    public FormCubo() {
        initComponents();
    }
    
    void etiquetasOn1(){
        //Texto de la cara 1
        txtC1_11.setText(String.valueOf(C1[1][1]));
        txtC1_12.setText(String.valueOf(C1[1][2]));
        txtC1_13.setText(String.valueOf(C1[1][3]));
        txtC1_21.setText(String.valueOf(C1[2][1]));
        txtC1_22.setText(String.valueOf(C1[2][2]));
        txtC1_23.setText(String.valueOf(C1[2][3]));
        txtC1_31.setText(String.valueOf(C1[3][1]));
        txtC1_32.setText(String.valueOf(C1[3][2]));
        txtC1_33.setText(String.valueOf(C1[3][3]));
    }    
    
    void etiquetasOn2(){ 
        txtC2_11.setText(String.valueOf(C2[1][1]));
        txtC2_12.setText(String.valueOf(C2[1][2]));
        txtC2_13.setText(String.valueOf(C2[1][3]));
        txtC2_21.setText(String.valueOf(C2[2][1]));
        txtC2_22.setText(String.valueOf(C2[2][2]));
        txtC2_23.setText(String.valueOf(C2[2][3]));
        txtC2_31.setText(String.valueOf(C2[3][1]));
        txtC2_32.setText(String.valueOf(C2[3][2]));
        txtC2_33.setText(String.valueOf(C2[3][3]));
    }    
    
    void etiquetasOn3(){ 
        txtC3_11.setText(String.valueOf(C3[1][1]));
        txtC3_12.setText(String.valueOf(C3[1][2]));
        txtC3_13.setText(String.valueOf(C3[1][3]));
        txtC3_21.setText(String.valueOf(C3[2][1]));
        txtC3_22.setText(String.valueOf(C3[2][2]));
        txtC3_23.setText(String.valueOf(C3[2][3]));
        txtC3_31.setText(String.valueOf(C3[3][1]));
        txtC3_32.setText(String.valueOf(C3[3][2]));
        txtC3_33.setText(String.valueOf(C3[3][3]));
    }    
    
    void etiquetasOn4(){ 
        txtC4_11.setText(String.valueOf(C4[1][1]));
        txtC4_12.setText(String.valueOf(C4[1][2]));
        txtC4_13.setText(String.valueOf(C4[1][3]));
        txtC4_21.setText(String.valueOf(C4[2][1]));
        txtC4_22.setText(String.valueOf(C4[2][2]));
        txtC4_23.setText(String.valueOf(C4[2][3]));
        txtC4_31.setText(String.valueOf(C4[3][1]));
        txtC4_32.setText(String.valueOf(C4[3][2]));
        txtC4_33.setText(String.valueOf(C4[3][3]));
    }    
        
    void etiquetasOn5(){ 
        txtC5_11.setText(String.valueOf(C5[1][1]));
        txtC5_12.setText(String.valueOf(C5[1][2]));
        txtC5_13.setText(String.valueOf(C5[1][3]));
        txtC5_21.setText(String.valueOf(C5[2][1]));
        txtC5_22.setText(String.valueOf(C5[2][2]));
        txtC5_23.setText(String.valueOf(C5[2][3]));
        txtC5_31.setText(String.valueOf(C5[3][1]));
        txtC5_32.setText(String.valueOf(C5[3][2]));
        txtC5_33.setText(String.valueOf(C5[3][3]));
    }    
    
    void etiquetasOn6(){ 
        txtC6_11.setText(String.valueOf(C6[1][1]));
        txtC6_12.setText(String.valueOf(C6[1][2]));
        txtC6_13.setText(String.valueOf(C6[1][3]));
        txtC6_21.setText(String.valueOf(C6[2][1]));
        txtC6_22.setText(String.valueOf(C6[2][2]));
        txtC6_23.setText(String.valueOf(C6[2][3]));
        txtC6_31.setText(String.valueOf(C6[3][1]));
        txtC6_32.setText(String.valueOf(C6[3][2]));
        txtC6_33.setText(String.valueOf(C6[3][3]));
    }
    
    void etiquetasOf1(){
        //Texto de la cara 1
        txtC1_11.setText(String.valueOf(""));
        txtC1_12.setText(String.valueOf(""));
        txtC1_13.setText(String.valueOf(""));
        txtC1_21.setText(String.valueOf(""));
        txtC1_22.setText(String.valueOf(""));
        txtC1_23.setText(String.valueOf(""));
        txtC1_31.setText(String.valueOf(""));
        txtC1_32.setText(String.valueOf(""));
        txtC1_33.setText(String.valueOf(""));
    }
    
    void etiquetasOf2(){
        //Texto de la cara 2
        txtC2_11.setText(String.valueOf(""));
        txtC2_12.setText(String.valueOf(""));
        txtC2_13.setText(String.valueOf(""));
        txtC2_21.setText(String.valueOf(""));
        txtC2_22.setText(String.valueOf(""));
        txtC2_23.setText(String.valueOf(""));
        txtC2_31.setText(String.valueOf(""));
        txtC2_32.setText(String.valueOf(""));
        txtC2_33.setText(String.valueOf(""));
    }    
    
    void etiquetasOf3(){
        //Texto de la cara 3
        txtC3_11.setText(String.valueOf(""));
        txtC3_12.setText(String.valueOf(""));
        txtC3_13.setText(String.valueOf(""));
        txtC3_21.setText(String.valueOf(""));
        txtC3_22.setText(String.valueOf(""));
        txtC3_23.setText(String.valueOf(""));
        txtC3_31.setText(String.valueOf(""));
        txtC3_32.setText(String.valueOf(""));
        txtC3_33.setText(String.valueOf(""));
    }    
    
    void etiquetasOf4(){
        //Texto de la cara 4
        txtC4_11.setText(String.valueOf(""));
        txtC4_12.setText(String.valueOf(""));
        txtC4_13.setText(String.valueOf(""));
        txtC4_21.setText(String.valueOf(""));
        txtC4_22.setText(String.valueOf(""));
        txtC4_23.setText(String.valueOf(""));
        txtC4_31.setText(String.valueOf(""));
        txtC4_32.setText(String.valueOf(""));
        txtC4_33.setText(String.valueOf(""));
    }

    void etiquetasOf5(){
        //Texto de la cara 5
        txtC5_11.setText(String.valueOf(""));
        txtC5_12.setText(String.valueOf(""));
        txtC5_13.setText(String.valueOf(""));
        txtC5_21.setText(String.valueOf(""));
        txtC5_22.setText(String.valueOf(""));
        txtC5_23.setText(String.valueOf(""));
        txtC5_31.setText(String.valueOf(""));
        txtC5_32.setText(String.valueOf(""));
        txtC5_33.setText(String.valueOf(""));
    }
    
    void etiquetasOf6(){
        //Texto de la cara 6
        txtC6_11.setText(String.valueOf(""));
        txtC6_12.setText(String.valueOf(""));
        txtC6_13.setText(String.valueOf(""));
        txtC6_21.setText(String.valueOf(""));
        txtC6_22.setText(String.valueOf(""));
        txtC6_23.setText(String.valueOf(""));
        txtC6_31.setText(String.valueOf(""));
        txtC6_32.setText(String.valueOf(""));
        txtC6_33.setText(String.valueOf(""));
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtC1_11 = new javax.swing.JTextField();
        txtC1_12 = new javax.swing.JTextField();
        txtC1_13 = new javax.swing.JTextField();
        txtC1_21 = new javax.swing.JTextField();
        txtC1_22 = new javax.swing.JTextField();
        txtC1_23 = new javax.swing.JTextField();
        txtC1_31 = new javax.swing.JTextField();
        txtC1_32 = new javax.swing.JTextField();
        txtC1_33 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtC2_11 = new javax.swing.JTextField();
        txtC2_12 = new javax.swing.JTextField();
        txtC2_13 = new javax.swing.JTextField();
        txtC2_21 = new javax.swing.JTextField();
        txtC2_22 = new javax.swing.JTextField();
        txtC2_23 = new javax.swing.JTextField();
        txtC2_31 = new javax.swing.JTextField();
        txtC2_32 = new javax.swing.JTextField();
        txtC2_33 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtC3_11 = new javax.swing.JTextField();
        txtC3_12 = new javax.swing.JTextField();
        txtC3_13 = new javax.swing.JTextField();
        txtC3_21 = new javax.swing.JTextField();
        txtC3_22 = new javax.swing.JTextField();
        txtC3_23 = new javax.swing.JTextField();
        txtC3_31 = new javax.swing.JTextField();
        txtC3_32 = new javax.swing.JTextField();
        txtC3_33 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtC5_11 = new javax.swing.JTextField();
        txtC5_12 = new javax.swing.JTextField();
        txtC5_13 = new javax.swing.JTextField();
        txtC5_21 = new javax.swing.JTextField();
        txtC5_22 = new javax.swing.JTextField();
        txtC5_23 = new javax.swing.JTextField();
        txtC5_31 = new javax.swing.JTextField();
        txtC5_32 = new javax.swing.JTextField();
        txtC5_33 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        txtC4_11 = new javax.swing.JTextField();
        txtC4_12 = new javax.swing.JTextField();
        txtC4_13 = new javax.swing.JTextField();
        txtC4_21 = new javax.swing.JTextField();
        txtC4_22 = new javax.swing.JTextField();
        txtC4_23 = new javax.swing.JTextField();
        txtC4_31 = new javax.swing.JTextField();
        txtC4_32 = new javax.swing.JTextField();
        txtC4_33 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        txtC6_11 = new javax.swing.JTextField();
        txtC6_12 = new javax.swing.JTextField();
        txtC6_13 = new javax.swing.JTextField();
        txtC6_21 = new javax.swing.JTextField();
        txtC6_22 = new javax.swing.JTextField();
        txtC6_23 = new javax.swing.JTextField();
        txtC6_31 = new javax.swing.JTextField();
        txtC6_32 = new javax.swing.JTextField();
        txtC6_33 = new javax.swing.JTextField();
        btn_A1 = new javax.swing.JButton();
        btn_A2 = new javax.swing.JButton();
        btn_A3 = new javax.swing.JButton();
        btn_B1 = new javax.swing.JButton();
        btn_B2 = new javax.swing.JButton();
        btn_B3 = new javax.swing.JButton();
        btn_etiquetasOn = new javax.swing.JButton();
        btn_Colores = new javax.swing.JButton();
        btn_D1 = new javax.swing.JButton();
        btn_D2 = new javax.swing.JButton();
        btn_D3 = new javax.swing.JButton();
        btn_I1 = new javax.swing.JButton();
        btn_I2 = new javax.swing.JButton();
        btn_I3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtC1_11.setEditable(false);
        txtC1_11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC1_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC1_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC1_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC1_11ActionPerformed(evt);
            }
        });

        txtC1_12.setEditable(false);
        txtC1_12.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC1_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC1_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC1_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC1_12ActionPerformed(evt);
            }
        });

        txtC1_13.setEditable(false);
        txtC1_13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC1_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC1_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC1_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC1_13ActionPerformed(evt);
            }
        });

        txtC1_21.setEditable(false);
        txtC1_21.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC1_21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC1_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC1_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC1_21ActionPerformed(evt);
            }
        });

        txtC1_22.setEditable(false);
        txtC1_22.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC1_22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC1_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC1_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC1_22ActionPerformed(evt);
            }
        });

        txtC1_23.setEditable(false);
        txtC1_23.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC1_23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC1_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC1_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC1_23ActionPerformed(evt);
            }
        });

        txtC1_31.setEditable(false);
        txtC1_31.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC1_31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC1_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC1_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC1_31ActionPerformed(evt);
            }
        });

        txtC1_32.setEditable(false);
        txtC1_32.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC1_32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC1_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC1_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC1_32ActionPerformed(evt);
            }
        });

        txtC1_33.setEditable(false);
        txtC1_33.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC1_33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC1_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC1_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC1_33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtC1_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC1_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC1_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtC1_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txtC1_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtC1_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC1_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtC1_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC1_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtC1_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC1_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC1_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC1_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC1_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC1_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtC1_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtC1_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtC1_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel7.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 100, 100));

        txtC2_11.setEditable(false);
        txtC2_11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC2_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC2_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC2_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC2_11ActionPerformed(evt);
            }
        });

        txtC2_12.setEditable(false);
        txtC2_12.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC2_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC2_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC2_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC2_12ActionPerformed(evt);
            }
        });

        txtC2_13.setEditable(false);
        txtC2_13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC2_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC2_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC2_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC2_13ActionPerformed(evt);
            }
        });

        txtC2_21.setEditable(false);
        txtC2_21.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC2_21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC2_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC2_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC2_21ActionPerformed(evt);
            }
        });

        txtC2_22.setEditable(false);
        txtC2_22.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC2_22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC2_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC2_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC2_22ActionPerformed(evt);
            }
        });

        txtC2_23.setEditable(false);
        txtC2_23.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC2_23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC2_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC2_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC2_23ActionPerformed(evt);
            }
        });

        txtC2_31.setEditable(false);
        txtC2_31.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC2_31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC2_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC2_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC2_31ActionPerformed(evt);
            }
        });

        txtC2_32.setEditable(false);
        txtC2_32.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC2_32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC2_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC2_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC2_32ActionPerformed(evt);
            }
        });

        txtC2_33.setEditable(false);
        txtC2_33.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC2_33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC2_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC2_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC2_33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtC2_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC2_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtC2_21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtC2_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txtC2_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtC2_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC2_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtC2_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC2_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtC2_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC2_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC2_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC2_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC2_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC2_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtC2_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtC2_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtC2_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel7.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 100, -1));

        txtC3_11.setEditable(false);
        txtC3_11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC3_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC3_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC3_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC3_11ActionPerformed(evt);
            }
        });

        txtC3_12.setEditable(false);
        txtC3_12.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC3_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC3_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC3_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC3_12ActionPerformed(evt);
            }
        });

        txtC3_13.setEditable(false);
        txtC3_13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC3_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC3_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC3_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC3_13ActionPerformed(evt);
            }
        });

        txtC3_21.setEditable(false);
        txtC3_21.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC3_21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC3_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC3_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC3_21ActionPerformed(evt);
            }
        });

        txtC3_22.setEditable(false);
        txtC3_22.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC3_22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC3_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC3_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC3_22ActionPerformed(evt);
            }
        });

        txtC3_23.setEditable(false);
        txtC3_23.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC3_23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC3_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC3_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC3_23ActionPerformed(evt);
            }
        });

        txtC3_31.setEditable(false);
        txtC3_31.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC3_31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC3_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC3_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC3_31ActionPerformed(evt);
            }
        });

        txtC3_32.setEditable(false);
        txtC3_32.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC3_32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC3_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC3_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC3_32ActionPerformed(evt);
            }
        });

        txtC3_33.setEditable(false);
        txtC3_33.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC3_33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC3_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC3_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC3_33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtC3_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC3_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC3_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtC3_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txtC3_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtC3_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC3_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtC3_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC3_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtC3_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC3_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC3_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC3_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC3_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC3_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtC3_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtC3_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtC3_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel7.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        txtC5_11.setEditable(false);
        txtC5_11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC5_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC5_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC5_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC5_11ActionPerformed(evt);
            }
        });

        txtC5_12.setEditable(false);
        txtC5_12.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC5_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC5_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC5_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC5_12ActionPerformed(evt);
            }
        });

        txtC5_13.setEditable(false);
        txtC5_13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC5_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC5_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC5_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC5_13ActionPerformed(evt);
            }
        });

        txtC5_21.setEditable(false);
        txtC5_21.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC5_21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC5_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC5_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC5_21ActionPerformed(evt);
            }
        });

        txtC5_22.setEditable(false);
        txtC5_22.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC5_22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC5_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC5_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC5_22ActionPerformed(evt);
            }
        });

        txtC5_23.setEditable(false);
        txtC5_23.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC5_23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC5_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC5_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC5_23ActionPerformed(evt);
            }
        });

        txtC5_31.setEditable(false);
        txtC5_31.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC5_31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC5_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC5_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC5_31ActionPerformed(evt);
            }
        });

        txtC5_32.setEditable(false);
        txtC5_32.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC5_32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC5_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC5_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC5_32ActionPerformed(evt);
            }
        });

        txtC5_33.setEditable(false);
        txtC5_33.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC5_33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC5_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC5_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC5_33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtC5_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC5_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC5_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtC5_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txtC5_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtC5_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC5_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtC5_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC5_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtC5_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC5_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC5_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC5_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC5_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC5_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtC5_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtC5_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtC5_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel7.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, 110));

        txtC4_11.setEditable(false);
        txtC4_11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC4_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC4_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC4_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC4_11ActionPerformed(evt);
            }
        });

        txtC4_12.setEditable(false);
        txtC4_12.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC4_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC4_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC4_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC4_12ActionPerformed(evt);
            }
        });

        txtC4_13.setEditable(false);
        txtC4_13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC4_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC4_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC4_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC4_13ActionPerformed(evt);
            }
        });

        txtC4_21.setEditable(false);
        txtC4_21.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC4_21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC4_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC4_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC4_21ActionPerformed(evt);
            }
        });

        txtC4_22.setEditable(false);
        txtC4_22.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC4_22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC4_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC4_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC4_22ActionPerformed(evt);
            }
        });

        txtC4_23.setEditable(false);
        txtC4_23.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC4_23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC4_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC4_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC4_23ActionPerformed(evt);
            }
        });

        txtC4_31.setEditable(false);
        txtC4_31.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC4_31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC4_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC4_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC4_31ActionPerformed(evt);
            }
        });

        txtC4_32.setEditable(false);
        txtC4_32.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC4_32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC4_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC4_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC4_32ActionPerformed(evt);
            }
        });

        txtC4_33.setEditable(false);
        txtC4_33.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC4_33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC4_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC4_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC4_33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtC4_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC4_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC4_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtC4_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txtC4_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtC4_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC4_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtC4_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC4_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtC4_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC4_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC4_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC4_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC4_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC4_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtC4_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtC4_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtC4_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel7.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 110, -1));

        txtC6_11.setEditable(false);
        txtC6_11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC6_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC6_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC6_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC6_11ActionPerformed(evt);
            }
        });

        txtC6_12.setEditable(false);
        txtC6_12.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC6_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC6_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC6_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC6_12ActionPerformed(evt);
            }
        });

        txtC6_13.setEditable(false);
        txtC6_13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC6_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC6_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC6_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC6_13ActionPerformed(evt);
            }
        });

        txtC6_21.setEditable(false);
        txtC6_21.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC6_21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC6_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC6_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC6_21ActionPerformed(evt);
            }
        });

        txtC6_22.setEditable(false);
        txtC6_22.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC6_22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC6_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC6_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC6_22ActionPerformed(evt);
            }
        });

        txtC6_23.setEditable(false);
        txtC6_23.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC6_23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC6_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC6_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC6_23ActionPerformed(evt);
            }
        });

        txtC6_31.setEditable(false);
        txtC6_31.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC6_31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC6_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC6_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC6_31ActionPerformed(evt);
            }
        });

        txtC6_32.setEditable(false);
        txtC6_32.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC6_32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC6_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC6_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC6_32ActionPerformed(evt);
            }
        });

        txtC6_33.setEditable(false);
        txtC6_33.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtC6_33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC6_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtC6_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtC6_33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtC6_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC6_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC6_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtC6_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txtC6_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtC6_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC6_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtC6_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC6_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtC6_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC6_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC6_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC6_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC6_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC6_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtC6_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtC6_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtC6_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel7.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 100, -1));

        btn_A1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_A1.setText("A1");
        btn_A1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btn_A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_A1ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 30, 20));

        btn_A2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_A2.setText("A2");
        btn_A2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btn_A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_A2ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 30, 20));

        btn_A3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_A3.setText("A3");
        btn_A3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btn_A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_A3ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 30, 20));

        btn_B1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_B1.setText("B1");
        btn_B1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btn_B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_B1ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 30, 20));

        btn_B2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_B2.setText("B2");
        btn_B2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btn_B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_B2ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 30, 20));

        btn_B3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_B3.setText("B3");
        btn_B3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btn_B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_B3ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 30, 20));

        btn_etiquetasOn.setText("Etiquetas ON/OF");
        btn_etiquetasOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_etiquetasOnActionPerformed(evt);
            }
        });
        jPanel7.add(btn_etiquetasOn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 110, -1));

        btn_Colores.setText("Colores");
        btn_Colores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ColoresActionPerformed(evt);
            }
        });
        jPanel7.add(btn_Colores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 110, -1));

        btn_D1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_D1.setText("D1");
        btn_D1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btn_D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_D1ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 30, 20));

        btn_D2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_D2.setText("D2");
        btn_D2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btn_D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_D2ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 30, 20));

        btn_D3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_D3.setText("D3");
        btn_D3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btn_D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_D3ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 30, 20));

        btn_I1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_I1.setText("I1");
        btn_I1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btn_I1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_I1ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_I1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 30, 20));

        btn_I2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_I2.setText("I2");
        btn_I2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btn_I2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_I2ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_I2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 30, 20));

        btn_I3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_I3.setText("I3");
        btn_I3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btn_I3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_I3ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_I3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 30, 20));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 510, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Inicio de Texto y botones
    
    private void txtC1_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC1_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC1_11ActionPerformed

    private void txtC1_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC1_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC1_12ActionPerformed

    private void txtC1_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC1_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC1_13ActionPerformed

    private void txtC1_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC1_21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC1_21ActionPerformed

    private void txtC1_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC1_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC1_22ActionPerformed

    private void txtC1_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC1_23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC1_23ActionPerformed

    private void txtC1_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC1_31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC1_31ActionPerformed

    private void txtC1_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC1_32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC1_32ActionPerformed

    private void txtC1_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC1_33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC1_33ActionPerformed

    private void txtC2_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC2_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC2_11ActionPerformed

    private void txtC2_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC2_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC2_12ActionPerformed

    private void txtC2_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC2_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC2_13ActionPerformed

    private void txtC2_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC2_21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC2_21ActionPerformed

    private void txtC2_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC2_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC2_22ActionPerformed

    private void txtC2_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC2_23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC2_23ActionPerformed

    private void txtC2_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC2_31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC2_31ActionPerformed

    private void txtC2_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC2_32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC2_32ActionPerformed

    private void txtC2_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC2_33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC2_33ActionPerformed
    
    private void btn_etiquetasOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_etiquetasOnActionPerformed
        etiquetas();
    }//GEN-LAST:event_btn_etiquetasOnActionPerformed

    private void txtC3_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC3_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC3_11ActionPerformed

    private void txtC3_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC3_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC3_12ActionPerformed

    private void txtC3_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC3_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC3_13ActionPerformed

    private void txtC3_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC3_21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC3_21ActionPerformed

    private void txtC3_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC3_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC3_22ActionPerformed

    private void txtC3_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC3_23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC3_23ActionPerformed

    private void txtC3_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC3_31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC3_31ActionPerformed

    private void txtC3_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC3_32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC3_32ActionPerformed

    private void txtC3_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC3_33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC3_33ActionPerformed

    private void txtC5_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC5_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC5_11ActionPerformed

    private void txtC5_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC5_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC5_12ActionPerformed

    private void txtC5_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC5_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC5_13ActionPerformed

    private void txtC5_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC5_21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC5_21ActionPerformed

    private void txtC5_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC5_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC5_22ActionPerformed

    private void txtC5_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC5_23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC5_23ActionPerformed

    private void txtC5_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC5_31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC5_31ActionPerformed

    private void txtC5_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC5_32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC5_32ActionPerformed

    private void txtC5_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC5_33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC5_33ActionPerformed

    private void txtC4_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC4_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC4_11ActionPerformed

    private void txtC4_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC4_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC4_12ActionPerformed

    private void txtC4_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC4_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC4_13ActionPerformed

    private void txtC4_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC4_21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC4_21ActionPerformed

    private void txtC4_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC4_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC4_22ActionPerformed

    private void txtC4_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC4_23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC4_23ActionPerformed

    private void txtC4_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC4_31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC4_31ActionPerformed

    private void txtC4_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC4_32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC4_32ActionPerformed

    private void txtC4_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC4_33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC4_33ActionPerformed

    private void txtC6_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC6_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC6_11ActionPerformed

    private void txtC6_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC6_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC6_12ActionPerformed

    private void txtC6_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC6_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC6_13ActionPerformed

    private void txtC6_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC6_21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC6_21ActionPerformed

    private void txtC6_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC6_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC6_22ActionPerformed

    private void txtC6_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC6_23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC6_23ActionPerformed

    private void txtC6_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC6_31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC6_31ActionPerformed

    private void txtC6_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC6_32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC6_32ActionPerformed

    private void txtC6_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtC6_33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtC6_33ActionPerformed

    //Accion de cada uno de los botones
    
    private void btn_A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_A3ActionPerformed
        lineA3Up();
    }//GEN-LAST:event_btn_A3ActionPerformed

    private void btn_A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_A2ActionPerformed
        lineA2Up();
    }//GEN-LAST:event_btn_A2ActionPerformed

    private void btn_A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_A1ActionPerformed
        lineA1Up();
    }//GEN-LAST:event_btn_A1ActionPerformed

    private void btn_B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_B3ActionPerformed
        lineB3Dwn();
    }//GEN-LAST:event_btn_B3ActionPerformed

    private void btn_B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_B2ActionPerformed
        lineB2Dwn();
    }//GEN-LAST:event_btn_B2ActionPerformed

    private void btn_B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_B1ActionPerformed
        lineB1Dwn();
    }//GEN-LAST:event_btn_B1ActionPerformed
    
    //Llamadas a la accion de las etiquetas y colores
    
    void etiquetasOn(){
        etiquetasOn1();
        etiquetasOn2();
        etiquetasOn3();
        etiquetasOn4();
        etiquetasOn5();
        etiquetasOn6();
    }
    
    void etiquetasOf(){
        etiquetasOf1();
        etiquetasOf2();
        etiquetasOf3();
        etiquetasOf4();
        etiquetasOf5();
        etiquetasOf6();
    }
    
    private void btn_ColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ColoresActionPerformed
        Colores();
    }//GEN-LAST:event_btn_ColoresActionPerformed

    private void btn_D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_D1ActionPerformed
        D1();
    }//GEN-LAST:event_btn_D1ActionPerformed

    private void btn_D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_D2ActionPerformed
        D2();
    }//GEN-LAST:event_btn_D2ActionPerformed

    private void btn_D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_D3ActionPerformed
        D3();
    }//GEN-LAST:event_btn_D3ActionPerformed

    private void btn_I1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_I1ActionPerformed
        I1();
    }//GEN-LAST:event_btn_I1ActionPerformed

    private void btn_I2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_I2ActionPerformed
        I2();
    }//GEN-LAST:event_btn_I2ActionPerformed

    private void btn_I3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_I3ActionPerformed
        I3();
    }//GEN-LAST:event_btn_I3ActionPerformed
        
    void etiquetas(){
        contadorClicks += 1;
        if(contadorClicks > 1) {contadorClicks = 0;}
        if(contadorClicks==1)
            etiquetasOn();
        else
            etiquetasOf();
    }
    
    void Colores(){
        contadorClicksColores ++;
        if(contadorClicksColores > 1) {contadorClicks = 0;}
        if(contadorClicksColores==1){
            ColoresON();}
        else{
            ColoresOFF();}
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCubo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCubo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCubo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCubo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCubo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_A1;
    private javax.swing.JButton btn_A2;
    private javax.swing.JButton btn_A3;
    private javax.swing.JButton btn_B1;
    private javax.swing.JButton btn_B2;
    private javax.swing.JButton btn_B3;
    private javax.swing.JButton btn_Colores;
    private javax.swing.JButton btn_D1;
    private javax.swing.JButton btn_D2;
    private javax.swing.JButton btn_D3;
    private javax.swing.JButton btn_I1;
    private javax.swing.JButton btn_I2;
    private javax.swing.JButton btn_I3;
    private javax.swing.JButton btn_etiquetasOn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtC1_11;
    private javax.swing.JTextField txtC1_12;
    private javax.swing.JTextField txtC1_13;
    private javax.swing.JTextField txtC1_21;
    private javax.swing.JTextField txtC1_22;
    private javax.swing.JTextField txtC1_23;
    private javax.swing.JTextField txtC1_31;
    private javax.swing.JTextField txtC1_32;
    private javax.swing.JTextField txtC1_33;
    private javax.swing.JTextField txtC2_11;
    private javax.swing.JTextField txtC2_12;
    private javax.swing.JTextField txtC2_13;
    private javax.swing.JTextField txtC2_21;
    private javax.swing.JTextField txtC2_22;
    private javax.swing.JTextField txtC2_23;
    private javax.swing.JTextField txtC2_31;
    private javax.swing.JTextField txtC2_32;
    private javax.swing.JTextField txtC2_33;
    private javax.swing.JTextField txtC3_11;
    private javax.swing.JTextField txtC3_12;
    private javax.swing.JTextField txtC3_13;
    private javax.swing.JTextField txtC3_21;
    private javax.swing.JTextField txtC3_22;
    private javax.swing.JTextField txtC3_23;
    private javax.swing.JTextField txtC3_31;
    private javax.swing.JTextField txtC3_32;
    private javax.swing.JTextField txtC3_33;
    private javax.swing.JTextField txtC4_11;
    private javax.swing.JTextField txtC4_12;
    private javax.swing.JTextField txtC4_13;
    private javax.swing.JTextField txtC4_21;
    private javax.swing.JTextField txtC4_22;
    private javax.swing.JTextField txtC4_23;
    private javax.swing.JTextField txtC4_31;
    private javax.swing.JTextField txtC4_32;
    private javax.swing.JTextField txtC4_33;
    private javax.swing.JTextField txtC5_11;
    private javax.swing.JTextField txtC5_12;
    private javax.swing.JTextField txtC5_13;
    private javax.swing.JTextField txtC5_21;
    private javax.swing.JTextField txtC5_22;
    private javax.swing.JTextField txtC5_23;
    private javax.swing.JTextField txtC5_31;
    private javax.swing.JTextField txtC5_32;
    private javax.swing.JTextField txtC5_33;
    private javax.swing.JTextField txtC6_11;
    private javax.swing.JTextField txtC6_12;
    private javax.swing.JTextField txtC6_13;
    private javax.swing.JTextField txtC6_21;
    private javax.swing.JTextField txtC6_22;
    private javax.swing.JTextField txtC6_23;
    private javax.swing.JTextField txtC6_31;
    private javax.swing.JTextField txtC6_32;
    private javax.swing.JTextField txtC6_33;
    // End of variables declaration//GEN-END:variables
}
