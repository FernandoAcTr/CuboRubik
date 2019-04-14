package com.rubik.controller;

import com.rubik.modelo.Cara;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class CarasCuboGUI extends javax.swing.JFrame {
    private char[][] c1, c2, c3, c4, c5, c6;
    private JLabel[][] lbc1,lbc2, lbc3, lbc4, lbc5, lbc6;
    
    public CarasCuboGUI(Cara cara1, Cara cara2, Cara cara3, Cara cara4, Cara cara5, Cara cara6) {
        initComponents();
        this.c1 = cara1.getColores();
        this.c2 = cara2.getColores();
        this.c3 = cara3.getColores();
        this.c4 = cara4.getColores();
        this.c5 = cara5.getColores();
        this.c6 = cara6.getColores();
        lbc1 = new JLabel[Cara.NUM_FILAS][Cara.NUM_FILAS];
        lbc2 = new JLabel[Cara.NUM_FILAS][Cara.NUM_FILAS];
        lbc3 = new JLabel[Cara.NUM_FILAS][Cara.NUM_FILAS];
        lbc4 = new JLabel[Cara.NUM_FILAS][Cara.NUM_FILAS];
        lbc5 = new JLabel[Cara.NUM_FILAS][Cara.NUM_FILAS];
        lbc6 = new JLabel[Cara.NUM_FILAS][Cara.NUM_FILAS];
        ordenarImagenes();
        colocarImagenes();
        setVisible(true);
      
    }
    
    
    private void ordenarImagenes(){
        lbc1[0][0] = W1;
        lbc1[0][1] = W2;
        lbc1[0][2] = W3;
        lbc1[0][3] = W4;
        lbc1[1][0] = W5;
        lbc1[1][1] = W6;
        lbc1[1][2] = W7;
        lbc1[1][3] = W8;
        lbc1[2][0] = W9;
        lbc1[2][1] = W10;
        lbc1[2][2] = W11;
        lbc1[2][3] = W12;
        lbc1[3][0] = W13;
        lbc1[3][1] = W14;
        lbc1[3][2] = W15;
        lbc1[3][3] = W16;
        
        lbc2[0][0] = G1;
        lbc2[0][1] = G2;
        lbc2[0][2] = G3;
        lbc2[0][3] = G4;
        lbc2[1][0] = G5;
        lbc2[1][1] = G6;
        lbc2[1][2] = G7;
        lbc2[1][3] = G8;
        lbc2[2][0] = G9;
        lbc2[2][1] = G10;
        lbc2[2][2] = G11;
        lbc2[2][3] = G12;
        lbc2[3][0] = G13;
        lbc2[3][1] = G14;
        lbc2[3][2] = G15;
        lbc2[3][3] = G16;
        
        lbc3[0][0] = B1;
        lbc3[0][1] = B2;
        lbc3[0][2] = B3;
        lbc3[0][3] = B4;
        lbc3[1][0] = B5;
        lbc3[1][1] = B6;
        lbc3[1][2] = B7;
        lbc3[1][3] = B8;
        lbc3[2][0] = B9;
        lbc3[2][1] = B10;
        lbc3[2][2] = B11;
        lbc3[2][3] = B12;
        lbc3[3][0] = B13;
        lbc3[3][1] = B14;
        lbc3[3][2] = B15;
        lbc3[3][3] = B16;
        
        lbc4[0][0] = R1;
        lbc4[0][1] = R2;
        lbc4[0][2] = R3;
        lbc4[0][3] = R4;
        lbc4[1][0] = R5;
        lbc4[1][1] = R6;
        lbc4[1][2] = R7;
        lbc4[1][3] = R8;
        lbc4[2][0] = R9;
        lbc4[2][1] = R10;
        lbc4[2][2] = R11;
        lbc4[2][3] = R12;
        lbc4[3][0] = R13;
        lbc4[3][1] = R14;
        lbc4[3][2] = R15;
        lbc4[3][3] = R16;
        
        lbc5[0][0] = O1;
        lbc5[0][1] = O2;
        lbc5[0][2] = O3;
        lbc5[0][3] = O4;
        lbc5[1][0] = O5;
        lbc5[1][1] = O6;
        lbc5[1][2] = O7;
        lbc5[1][3] = O8;
        lbc5[2][0] = O9;
        lbc5[2][1] = O10;
        lbc5[2][2] = O11;
        lbc5[2][3] = O12;
        lbc5[3][0] = O13;
        lbc5[3][1] = O14;
        lbc5[3][2] = O15;
        lbc5[3][3] = O16;
        
        lbc6[0][0] = Y1;
        lbc6[0][1] = Y2;
        lbc6[0][2] = Y3;
        lbc6[0][3] = Y4;
        lbc6[1][0] = Y5;
        lbc6[1][1] = Y6;
        lbc6[1][2] = Y7;
        lbc6[1][3] = Y8;
        lbc6[2][0] = Y9;
        lbc6[2][1] = Y10;
        lbc6[2][2] = Y11;
        lbc6[2][3] = Y12;
        lbc6[3][0] = Y13;
        lbc6[3][1] = Y14;
        lbc6[3][2] = Y15;
        lbc6[3][3] = Y16;
    }
    
    private void coloImagenesCara1(){
        for(int i= 0; i<4; i++)
            for(int j = 0; j<4; j++)
                if(c1[i][j] == 'W')
                    lbc1[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png"));
                else if(c1[i][j] == 'G')
                    lbc1[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png"));
                else if(c1[i][j] == 'B')
                    lbc1[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png"));
                else if(c1[i][j] == 'R')
                    lbc1[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png"));
                else if(c1[i][j] == 'Y')
                    lbc1[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png"));
                else if(c1[i][j] == 'O')
                    lbc1[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png"));
    }
    private void coloImagenesCara2(){
        for(int i= 0; i<4; i++)
            for(int j = 0; j<4; j++)
                if(c2[i][j] == 'W')
                    lbc2[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png"));
                else if(c2[i][j] == 'G')
                    lbc2[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png"));
                else if(c2[i][j] == 'B')
                    lbc2[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png"));
                else if(c2[i][j] == 'R')
                    lbc2[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png"));
                else if(c2[i][j] == 'Y')
                    lbc2[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png"));
                else if(c2[i][j] == 'O')
                    lbc2[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png"));
    }
    private void coloImagenesCara3(){
        for(int i= 0; i<4; i++)
            for(int j = 0; j<4; j++)
                if(c3[i][j] == 'W')
                    lbc3[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png"));
                else if(c3[i][j] == 'G')
                    lbc3[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png"));
                else if(c3[i][j] == 'B')
                    lbc3[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png"));
                else if(c3[i][j] == 'R')
                    lbc3[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png"));
                else if(c3[i][j] == 'Y')
                    lbc3[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png"));
                else if(c3[i][j] == 'O')
                    lbc3[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png"));
    }
    private void coloImagenesCara4(){
        for(int i= 0; i<4; i++)
            for(int j = 0; j<4; j++)
                if(c4[i][j] == 'W')
                    lbc4[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png"));
                else if(c4[i][j] == 'G')
                    lbc4[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png"));
                else if(c4[i][j] == 'B')
                    lbc4[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png"));
                else if(c4[i][j] == 'R')
                    lbc4[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png"));
                else if(c4[i][j] == 'Y')
                    lbc4[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png"));
                else if(c4[i][j] == 'O')
                    lbc4[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png"));
    }
    private void coloImagenesCara5(){
        for(int i= 0; i<4; i++)
            for(int j = 0; j<4; j++)
                if(c5[i][j] == 'W')
                    lbc5[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png"));
                else if(c5[i][j] == 'G')
                    lbc5[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png"));
                else if(c5[i][j] == 'B')
                    lbc5[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png"));
                else if(c5[i][j] == 'R')
                    lbc5[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png"));
                else if(c5[i][j] == 'Y')
                    lbc5[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png"));
                else if(c5[i][j] == 'O')
                    lbc5[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png"));
    }
    private void coloImagenesCara6(){
        for(int i= 0; i<4; i++)
            for(int j = 0; j<4; j++)
                if(c6[i][j] == 'W')
                    lbc6[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png"));
                else if(c6[i][j] == 'G')
                    lbc6[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png"));
                else if(c6[i][j] == 'B')
                    lbc6[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png"));
                else if(c6[i][j] == 'R')
                    lbc6[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png"));
                else if(c6[i][j] == 'Y')
                    lbc6[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png"));
                else if(c6[i][j] == 'O')
                    lbc6[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png"));
    }
    
    public void colocarImagenes(){
        coloImagenesCara1();
        coloImagenesCara2();
        coloImagenesCara3();
        coloImagenesCara4();
        coloImagenesCara5();
        coloImagenesCara6();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cara2 = new javax.swing.JPanel();
        G1 = new JLabel();
        G2 = new JLabel();
        G4 = new JLabel();
        G3 = new JLabel();
        G5 = new JLabel();
        G6 = new JLabel();
        G7 = new JLabel();
        G8 = new JLabel();
        G9 = new JLabel();
        G10 = new JLabel();
        G11 = new JLabel();
        G12 = new JLabel();
        G13 = new JLabel();
        G14 = new JLabel();
        G15 = new JLabel();
        G16 = new JLabel();
        cara5 = new javax.swing.JPanel();
        O5 = new JLabel();
        O9 = new JLabel();
        O13 = new JLabel();
        O14 = new JLabel();
        O10 = new JLabel();
        O6 = new JLabel();
        O2 = new JLabel();
        O1 = new JLabel();
        O3 = new JLabel();
        O7 = new JLabel();
        O11 = new JLabel();
        O15 = new JLabel();
        O16 = new JLabel();
        O12 = new JLabel();
        O8 = new JLabel();
        O4 = new JLabel();
        cara4 = new javax.swing.JPanel();
        R4 = new JLabel();
        R1 = new JLabel();
        R5 = new JLabel();
        R9 = new JLabel();
        R13 = new JLabel();
        R15 = new JLabel();
        R14 = new JLabel();
        R10 = new JLabel();
        R6 = new JLabel();
        R2 = new JLabel();
        R3 = new JLabel();
        R7 = new JLabel();
        R8 = new JLabel();
        R12 = new JLabel();
        R16 = new JLabel();
        R11 = new JLabel();
        cara3 = new javax.swing.JPanel();
        B5 = new JLabel();
        B9 = new JLabel();
        B13 = new JLabel();
        B14 = new JLabel();
        B10 = new JLabel();
        B6 = new JLabel();
        B2 = new JLabel();
        B1 = new JLabel();
        B3 = new JLabel();
        B7 = new JLabel();
        B11 = new JLabel();
        B15 = new JLabel();
        B16 = new JLabel();
        B12 = new JLabel();
        B8 = new JLabel();
        B4 = new JLabel();
        Y1 = new JLabel();
        Y5 = new JLabel();
        Y9 = new JLabel();
        Y13 = new JLabel();
        Y14 = new JLabel();
        Y10 = new JLabel();
        Y6 = new JLabel();
        Y2 = new JLabel();
        Y3 = new JLabel();
        Y7 = new JLabel();
        Y11 = new JLabel();
        Y15 = new JLabel();
        Y16 = new JLabel();
        Y12 = new JLabel();
        Y8 = new JLabel();
        Y4 = new JLabel();
        cara1 = new javax.swing.JPanel();
        W1 = new JLabel();
        W5 = new JLabel();
        W9 = new JLabel();
        W13 = new JLabel();
        W14 = new JLabel();
        W10 = new JLabel();
        W6 = new JLabel();
        W2 = new JLabel();
        W3 = new JLabel();
        W7 = new JLabel();
        W11 = new JLabel();
        W15 = new JLabel();
        W16 = new JLabel();
        W12 = new JLabel();
        W8 = new JLabel();
        W4 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        G1.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N

        G2.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N

        G4.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N

        G3.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N

        G5.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N

        G6.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N

        G7.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N

        G8.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N

        G9.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N

        G10.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N

        G11.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N

        G12.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N

        G13.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N

        G14.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N

        G15.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N

        G16.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N

        javax.swing.GroupLayout cara2Layout = new javax.swing.GroupLayout(cara2);
        cara2.setLayout(cara2Layout);
        cara2Layout.setHorizontalGroup(
            cara2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cara2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(cara2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cara2Layout.createSequentialGroup()
                        .addGroup(cara2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cara2Layout.createSequentialGroup()
                                .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cara2Layout.createSequentialGroup()
                                .addComponent(G5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(G6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(cara2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(G7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(cara2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(cara2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(G15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cara2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cara2Layout.createSequentialGroup()
                        .addGroup(cara2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(G9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cara2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(G14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cara2Layout.setVerticalGroup(
            cara2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cara2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(cara2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cara2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(G5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cara2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(G9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cara2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(G13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(cara2, java.awt.BorderLayout.LINE_START);

        O5.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png")); // NOI18N

        O9.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png")); // NOI18N

        O13.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png")); // NOI18N

        O14.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png")); // NOI18N

        O10.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png")); // NOI18N

        O6.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png")); // NOI18N

        O2.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png")); // NOI18N

        O1.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png")); // NOI18N

        O3.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png")); // NOI18N

        O7.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png")); // NOI18N

        O11.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png")); // NOI18N

        O15.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png")); // NOI18N

        O16.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png")); // NOI18N

        O12.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png")); // NOI18N

        O8.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png")); // NOI18N

        O4.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png")); // NOI18N

        javax.swing.GroupLayout cara5Layout = new javax.swing.GroupLayout(cara5);
        cara5.setLayout(cara5Layout);
        cara5Layout.setHorizontalGroup(
            cara5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cara5Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addGroup(cara5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cara5Layout.createSequentialGroup()
                        .addComponent(O1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(O2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cara5Layout.createSequentialGroup()
                        .addComponent(O5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(O6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cara5Layout.createSequentialGroup()
                        .addGroup(cara5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(O9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(O13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cara5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(O14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(O10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cara5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cara5Layout.createSequentialGroup()
                        .addGroup(cara5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(O7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(O3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(O15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cara5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(O16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(O4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(O8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cara5Layout.createSequentialGroup()
                        .addComponent(O11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(O12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(446, Short.MAX_VALUE))
        );
        cara5Layout.setVerticalGroup(
            cara5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cara5Layout.createSequentialGroup()
                .addGroup(cara5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(O2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cara5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(O6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cara5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(O11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cara5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(O9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(O10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cara5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(O15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cara5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(O13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(O14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        ));

        getContentPane().add(cara5, java.awt.BorderLayout.PAGE_START);

        R4.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png")); // NOI18N

        R1.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png")); // NOI18N

        R5.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png")); // NOI18N

        R9.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png")); // NOI18N

        R13.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png")); // NOI18N

        R15.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png")); // NOI18N

        R14.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png")); // NOI18N

        R10.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png")); // NOI18N

        R6.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png")); // NOI18N

        R2.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png")); // NOI18N

        R3.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png")); // NOI18N

        R7.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png")); // NOI18N

        R8.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png")); // NOI18N

        R12.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png")); // NOI18N

        R16.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png")); // NOI18N

        R11.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png")); // NOI18N

        javax.swing.GroupLayout cara4Layout = new javax.swing.GroupLayout(cara4);
        cara4.setLayout(cara4Layout);
        cara4Layout.setHorizontalGroup(
            cara4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cara4Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addGroup(cara4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cara4Layout.createSequentialGroup()
                        .addComponent(R1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cara4Layout.createSequentialGroup()
                        .addComponent(R5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cara4Layout.createSequentialGroup()
                        .addGroup(cara4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cara4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cara4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cara4Layout.createSequentialGroup()
                        .addGroup(cara4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cara4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cara4Layout.createSequentialGroup()
                        .addComponent(R11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(449, Short.MAX_VALUE))
        );
        cara4Layout.setVerticalGroup(
            cara4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cara4Layout.createSequentialGroup()
                .addGroup(cara4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cara4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cara4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cara4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(R9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(R10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cara4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cara4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(R13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(R14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(cara4, java.awt.BorderLayout.PAGE_END);

        B5.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png")); // NOI18N

        B9.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png")); // NOI18N

        B13.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png")); // NOI18N

        B14.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png")); // NOI18N

        B10.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png")); // NOI18N

        B6.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png")); // NOI18N

        B2.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png")); // NOI18N

        B1.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png")); // NOI18N

        B3.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png")); // NOI18N

        B7.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png")); // NOI18N

        B11.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png")); // NOI18N

        B15.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png")); // NOI18N

        B16.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png")); // NOI18N

        B12.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png")); // NOI18N

        B8.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png")); // NOI18N

        B4.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png")); // NOI18N

        Y1.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png")); // NOI18N

        Y5.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png")); // NOI18N

        Y9.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png")); // NOI18N

        Y13.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png")); // NOI18N

        Y14.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png")); // NOI18N

        Y10.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png")); // NOI18N

        Y6.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png")); // NOI18N

        Y2.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png")); // NOI18N

        Y3.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png")); // NOI18N

        Y7.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png")); // NOI18N

        Y11.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png")); // NOI18N

        Y15.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png")); // NOI18N

        Y16.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png")); // NOI18N

        Y12.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png")); // NOI18N

        Y8.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png")); // NOI18N

        Y4.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png")); // NOI18N

        javax.swing.GroupLayout cara3Layout = new javax.swing.GroupLayout(cara3);
        cara3.setLayout(cara3Layout);
        cara3Layout.setHorizontalGroup(
            cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cara3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cara3Layout.createSequentialGroup()
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cara3Layout.createSequentialGroup()
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cara3Layout.createSequentialGroup()
                        .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cara3Layout.createSequentialGroup()
                        .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cara3Layout.createSequentialGroup()
                        .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cara3Layout.createSequentialGroup()
                        .addComponent(Y1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Y2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cara3Layout.createSequentialGroup()
                        .addComponent(Y5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Y6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cara3Layout.createSequentialGroup()
                        .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Y9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Y14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cara3Layout.createSequentialGroup()
                        .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Y7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Y16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cara3Layout.createSequentialGroup()
                        .addComponent(Y11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Y12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        cara3Layout.setVerticalGroup(
            cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cara3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cara3Layout.createSequentialGroup()
                        .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Y2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Y6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Y11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Y9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Y10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Y15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Y13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Y14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(cara3Layout.createSequentialGroup()
                        .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(cara3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        getContentPane().add(cara3, java.awt.BorderLayout.LINE_END);

        W1.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png")); // NOI18N

        W5.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png")); // NOI18N

        W9.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png")); // NOI18N

        W13.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png")); // NOI18N

        W14.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png")); // NOI18N

        W10.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png")); // NOI18N

        W6.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png")); // NOI18N

        W2.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png")); // NOI18N

        W3.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png")); // NOI18N

        W7.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png")); // NOI18N

        W11.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png")); // NOI18N

        W15.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png")); // NOI18N

        W16.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png")); // NOI18N

        W12.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png")); // NOI18N

        W8.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png")); // NOI18N

        W4.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png")); // NOI18N

        javax.swing.GroupLayout cara1Layout = new javax.swing.GroupLayout(cara1);
        cara1.setLayout(cara1Layout);
        cara1Layout.setHorizontalGroup(
            cara1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cara1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cara1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cara1Layout.createSequentialGroup()
                        .addComponent(W1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(W2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cara1Layout.createSequentialGroup()
                        .addComponent(W5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(W6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cara1Layout.createSequentialGroup()
                        .addGroup(cara1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(W9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(W13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cara1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(W14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(W10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cara1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cara1Layout.createSequentialGroup()
                        .addGroup(cara1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(W7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(W3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(W15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cara1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(W16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(W4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(W8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cara1Layout.createSequentialGroup()
                        .addComponent(W11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(W12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cara1Layout.setVerticalGroup(
            cara1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cara1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(cara1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(W2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cara1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(W6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cara1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(W11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cara1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(W9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(W10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cara1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(W15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cara1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(W13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(W14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(cara1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    //<editor-fold desc="declaracion de cariables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel B1;
    private JLabel B10;
    private JLabel B11;
    private JLabel B12;
    private JLabel B13;
    private JLabel B14;
    private JLabel B15;
    private JLabel B16;
    private JLabel B2;
    private JLabel B3;
    private JLabel B4;
    private JLabel B5;
    private JLabel B6;
    private JLabel B7;
    private JLabel B8;
    private JLabel B9;
    private JLabel G1;
    private JLabel G10;
    private JLabel G11;
    private JLabel G12;
    private JLabel G13;
    private JLabel G14;
    private JLabel G15;
    private JLabel G16;
    private JLabel G2;
    private JLabel G3;
    private JLabel G4;
    private JLabel G5;
    private JLabel G6;
    private JLabel G7;
    private JLabel G8;
    private JLabel G9;
    private JLabel O1;
    private JLabel O10;
    private JLabel O11;
    private JLabel O12;
    private JLabel O13;
    private JLabel O14;
    private JLabel O15;
    private JLabel O16;
    private JLabel O2;
    private JLabel O3;
    private JLabel O4;
    private JLabel O5;
    private JLabel O6;
    private JLabel O7;
    private JLabel O8;
    private JLabel O9;
    private JLabel R1;
    private JLabel R10;
    private JLabel R11;
    private JLabel R12;
    private JLabel R13;
    private JLabel R14;
    private JLabel R15;
    private JLabel R16;
    private JLabel R2;
    private JLabel R3;
    private JLabel R4;
    private JLabel R5;
    private JLabel R6;
    private JLabel R7;
    private JLabel R8;
    private JLabel R9;
    private JLabel W1;
    private JLabel W10;
    private JLabel W11;
    private JLabel W12;
    private JLabel W13;
    private JLabel W14;
    private JLabel W15;
    private JLabel W16;
    private JLabel W2;
    private JLabel W3;
    private JLabel W4;
    private JLabel W5;
    private JLabel W6;
    private JLabel W7;
    private JLabel W8;
    private JLabel W9;
    private JLabel Y1;
    private JLabel Y10;
    private JLabel Y11;
    private JLabel Y12;
    private JLabel Y13;
    private JLabel Y14;
    private JLabel Y15;
    private JLabel Y16;
    private JLabel Y2;
    private JLabel Y3;
    private JLabel Y4;
    private JLabel Y5;
    private JLabel Y6;
    private JLabel Y7;
    private JLabel Y8;
    private JLabel Y9;
    private javax.swing.JPanel cara1;
    private javax.swing.JPanel cara2;
    private javax.swing.JPanel cara3;
    private javax.swing.JPanel cara4;
    private javax.swing.JPanel cara5;
    // End of variables declaration//GEN-END:variables
   //</editor-fold>
}
