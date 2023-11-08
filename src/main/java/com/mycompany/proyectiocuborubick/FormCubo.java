/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectiocuborubick;

import static com.mycompany.proyectiocuborubick.ProyectioCuboRubick.C1;
import static com.mycompany.proyectiocuborubick.ProyectioCuboRubick.C2;
import static com.mycompany.proyectiocuborubick.ProyectioCuboRubick.C3;
import static com.mycompany.proyectiocuborubick.ProyectioCuboRubick.C4;
import static com.mycompany.proyectiocuborubick.ProyectioCuboRubick.C6;
import static com.mycompany.proyectiocuborubick.ProyectioCuboRubick.imprimeCubo;
import static com.mycompany.proyectiocuborubick.ProyectioCuboRubick.rotDerC6;
import static com.mycompany.proyectiocuborubick.ProyectioCuboRubick.t;

/**
 *
 * @author leonj
 */
public class FormCubo extends javax.swing.JFrame {
    
    public static int C1[][] = {{0, 0, 0, 0}, {0, 11, 12, 13}, {0, 14, 15, 16}, {0, 17, 18, 19}};
    public static int C2[][] = {{0, 0, 0, 0}, {0, 21, 22, 23}, {0, 24, 25, 26}, {0, 27, 28, 29}};
    public static int C3[][] = {{0, 0, 0, 0}, {0, 31, 32, 33}, {0, 34, 35, 36}, {0, 37, 38, 39}};
    public static int C4[][] = {{0, 0, 0, 0}, {0, 41, 42, 43}, {0, 44, 45, 46}, {0, 47, 48, 49}};
    public static int C5[][] = {{0, 0, 0, 0}, {0, 51, 52, 53}, {0, 54, 55, 56}, {0, 57, 58, 59}};
    public static int C6[][] = {{0, 0, 0, 0}, {0, 61, 62, 63}, {0, 64, 65, 66}, {0, 67, 68, 69}};
    public static int contadorClicks=0;
    public static int t,t2;
    
    public void rotDerC6(){
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
    
    public void rotIzqC6(){
        t = C6[1][1];
        C6[1][1] = C6[1][3];
        C6[1][3] = C6[3][3];
        C6[3][3] = C6[3][1];
        C6[3][1] = t;
        
        t = C6[2][1];
        C6[2][1] = C6[1][2];
        C6[1][2] = C6[2][3];
        C6[2][3] = C6[3][2];
        C6[3][2] = t;
    }
    
    public void lineA1Up(){
        for(int i=0; i<=3;i++){
        t = C1[i][1];
        C1[i][1] = C2[i][1];
        C2[i][1] = C3[i][1];
        C3[i][1] = C4[i][1];
        C4[i][1] = t;
        }
        
//        t = C1[2][1];
//        C1[2][1] = C2[2][1];
//        C2[2][1] = C3[2][1];
//        C3[2][1] = C4[2][1];
//        C4[2][1] = t;
//        
//        t = C1[3][1];
//        C1[3][1] = C2[3][1];
//        C2[3][1] = C3[3][1];
//        C3[3][1] = C4[3][1];
//        C4[3][1] = t;
        etiquetasOn();
    }
    
    public void lineA2Up(){
        for(int i=0; i<=3;i++){
        t=C1[i][2];
        C1[i][2]=C2[i][2];
        C2[i][2]=C3[i][2];
        C3[i][2]=C4[i][2];
        C4[i][2]=t;
        }
        
//        t=C1[2][2];
//        C1[2][2]=C2[2][2];
//        C2[2][2]=C3[2][2];
//        C3[2][2]=C4[2][2];
//        C4[2][2]=t;
//        
//        t=C1[3][2];
//        C1[3][2]=C2[3][2];
//        C2[3][2]=C3[3][2];
//        C3[3][2]=C4[3][2];
//        C4[3][2]=t;
        etiquetasOn();
    }
    
    public void lineA3Up(){        
        for(int i=0; i<=3;i++){
            t=C1[i][3];
            C1[i][3]=C2[i][3];
            C2[i][3]=C3[i][3];
            C3[i][3]=C4[i][3];
            C4[i][3]=t;
        }
        
//        t=C1[2][3];
//        C1[2][3]=C2[2][3];
//        C2[2][3]=C3[2][3];
//        C3[2][3]=C4[2][3];
//        C4[2][3]=t;
//        
//        t=C1[3][3];
//        C1[3][3]=C2[3][3];
//        C2[3][3]=C3[3][3];
//        C3[3][3]=C4[3][3];
//        C4[3][3]=t;
        rotDerC6();
        etiquetasOn();
    }
    
    public void lineB1Dwn(){
        for(int k=0; k<=3; k++){
        t = C4[k][1];
        C4[k][1] = C3[k][1];
        C3[k][1] = C2[k][1];
        C2[k][1] = C1[k][1];
        C1[k][1] = t;
        }
//        t = C4[2][1];
//        C4[2][1] = C3[2][1];
//        C3[2][1] = C2[2][1];
//        C2[2][1] = C1[2][1];
//        C1[2][1] = t;
//        
//        t = C4[1][1];
//        C4[1][1] = C3[1][1];
//        C3[1][1] = C2[1][1];
//        C2[1][1] = C1[1][1];
//        C1[1][1] = t;
        etiquetasOn();
    }
    
    public void lineB2Dwn(){
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
        etiquetasOn();
    }
    
    public void lineB3Dwn(){
        for(int k=0; k<=3;k++){
            t = C4[k][3];
            C4[k][3] = C3[k][3];
            C3[k][3] = C2[k][3];
            C2[k][3] = C1[k][3];
            C1[k][3] = t;
        }
        
//        t = C4[2][3];
//        C4[2][3] = C3[2][3];
//        C3[2][3] = C2[2][3];
//        C2[2][3] = C1[2][3];
//        C1[2][3] = t;
//        
//        t = C4[1][3];
//        C4[1][3] = C3[1][3];
//        C3[1][3] = C2[1][3];
//        C2[1][3] = C1[1][3];
//        C1[1][3] = t;
        rotIzqC6();
        etiquetasOn();
        
    }
    
    /**
     * Creates new form FormCubo
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
                .addContainerGap(7, Short.MAX_VALUE))
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

        jPanel7.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 100, 100));

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
                .addContainerGap(7, Short.MAX_VALUE))
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

        jPanel7.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 100, -1));

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
                .addContainerGap(17, Short.MAX_VALUE))
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

        jPanel7.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

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

        jPanel7.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 110));

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
                .addContainerGap(17, Short.MAX_VALUE))
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

        jPanel7.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 110, -1));

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

        jPanel7.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 100, -1));

        btn_A1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_A1.setText("A1");
        btn_A1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btn_A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_A1ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 30, 20));

        btn_A2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_A2.setText("A2");
        btn_A2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btn_A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_A2ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 30, 20));

        btn_A3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_A3.setText("A3");
        btn_A3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btn_A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_A3ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 30, 20));

        btn_B1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_B1.setText("B1");
        btn_B1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btn_B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_B1ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 30, 20));

        btn_B2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_B2.setText("B2");
        btn_B2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btn_B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_B2ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 30, 20));

        btn_B3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_B3.setText("B3");
        btn_B3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btn_B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_B3ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 30, 20));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 340, 490));

        btn_etiquetasOn.setText("Etiquetas ON/OF");
        btn_etiquetasOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_etiquetasOnActionPerformed(evt);
            }
        });
        getContentPane().add(btn_etiquetasOn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    void etiquetasOn(){
        etiquetasOn1();
        etiquetasOn2();
        etiquetasOn3();
        etiquetasOn4();
        etiquetasOn5();
        etiquetasOn6();
    }
    
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
  
    void etiquetasOf(){
        etiquetasOf1();
        etiquetasOf2();
        etiquetasOf3();
        etiquetasOf4();
        etiquetasOf5();
        etiquetasOf6();
    }
        
    void etiquetas(){
        contadorClicks += 1;
        if(contadorClicks > 1) {contadorClicks = 0;}
        if(contadorClicks==1)
            etiquetasOn();
        else
            etiquetasOf();
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