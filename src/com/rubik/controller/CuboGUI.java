package com.rubik.controller;

import com.rubik.modelo.Cubo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CuboGUI extends javax.swing.JFrame {

    JLabel imagenes[][];
    Cubo cubo;

    public CuboGUI() {
        imagenes = new JLabel[3][3];
        initComponents();
        setLocationRelativeTo(null);
        ordenarImagenes();
        cubo = new Cubo();
        colocarImagenes();
    }

    private void ordenarImagenes() {
        imagenes[0][0] = img1;
        imagenes[0][1] = img2;
        imagenes[0][2] = img3;
        imagenes[1][0] = img4;
        imagenes[1][1] = img5;
        imagenes[1][2] = img6;
        imagenes[2][0] = img7;
        imagenes[2][1] = img8;
        imagenes[2][2] = img9;
    }

    private void colocarImagenes() {
        char[][] colores = cubo.getCaraFrontal().getColores();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (colores[i][j] == 'W')
                    imagenes[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/blanco.png"));
                else if (colores[i][j] == 'G')
                    imagenes[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png"));
                else if (colores[i][j] == 'B')
                    imagenes[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/azul.png"));
                else if (colores[i][j] == 'R')
                    imagenes[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/rojo.png"));
                else if (colores[i][j] == 'Y')
                    imagenes[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/amarillo.png"));
                else if (colores[i][j] == 'O')
                    imagenes[i][j].setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/naranja.png"));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnCuboArriba = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnCuboDer = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnCuboIzq = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnCuboAbajo = new javax.swing.JButton();
        jLabel25 = new JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new JLabel();
        btnCol1Up = new javax.swing.JButton();
        btnCol2Up = new javax.swing.JButton();
        btnCol3Up = new javax.swing.JButton();
        jLabel5 = new JLabel();
        btnFila1Izq = new javax.swing.JButton();
        img1 = new JLabel();
        img2 = new JLabel();
        img3 = new JLabel();
        btnFila1Der = new javax.swing.JButton();
        btnFila2Izq = new javax.swing.JButton();
        img4 = new JLabel();
        img5 = new JLabel();
        img6 = new JLabel();
        btnFila2Der = new javax.swing.JButton();
        btnFila3Izq = new javax.swing.JButton();
        img7 = new JLabel();
        img8 = new JLabel();
        img9 = new JLabel();
        btnFila3Der = new javax.swing.JButton();
        jLabel21 = new JLabel();
        btnCol1Down = new javax.swing.JButton();
        btnCol2Down = new javax.swing.JButton();
        btnCol3Down = new javax.swing.JButton();

        jButton3.setIcon(new ImageIcon("/./src/com/rubik/vista/imagenes/flechaP.png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));

        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(662, 60));

        btnCuboArriba.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/flechaP2.png")); // NOI18N
        btnCuboArriba.setPreferredSize(new java.awt.Dimension(400, 46));
        btnCuboArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuboArribaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCuboArriba);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setFocusTraversalPolicyProvider(true);
        jPanel2.setPreferredSize(new java.awt.Dimension(120, 237));
        jPanel2.setLayout(new java.awt.BorderLayout());

        btnCuboDer.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/flechaP.png")); // NOI18N
        btnCuboDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuboDerActionPerformed(evt);
            }
        });
        jPanel2.add(btnCuboDer, java.awt.BorderLayout.LINE_END);

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setPreferredSize(new java.awt.Dimension(120, 237));
        jPanel3.setLayout(new java.awt.BorderLayout());

        btnCuboIzq.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/flechaP3.png")); // NOI18N
        btnCuboIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuboIzqActionPerformed(evt);
            }
        });
        jPanel3.add(btnCuboIzq, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(662, 60));

        btnCuboAbajo.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/flechaP4.png")); // NOI18N
        btnCuboAbajo.setPreferredSize(new java.awt.Dimension(400, 46));
        btnCuboAbajo.setRequestFocusEnabled(false);
        btnCuboAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuboAbajoActionPerformed(evt);
            }
        });
        jPanel4.add(btnCuboAbajo);
        jPanel4.add(jLabel25);

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setLayout(new java.awt.GridLayout(5, 5));
        jPanel5.add(jLabel1);

        btnCol1Up.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/flechaP2.png")); // NOI18N
        btnCol1Up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCol1UpActionPerformed(evt);
            }
        });
        jPanel5.add(btnCol1Up);

        btnCol2Up.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/flechaP2.png")); // NOI18N
        btnCol2Up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCol2UpActionPerformed(evt);
            }
        });
        jPanel5.add(btnCol2Up);

        btnCol3Up.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/flechaP2.png")); // NOI18N
        btnCol3Up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCol3UpActionPerformed(evt);
            }
        });
        jPanel5.add(btnCol3Up);
        jPanel5.add(jLabel5);

        btnFila1Izq.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/flechaP3.png")); // NOI18N
        btnFila1Izq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFila1IzqActionPerformed(evt);
            }
        });
        jPanel5.add(btnFila1Izq);

        img1.setBackground(new java.awt.Color(102, 255, 102));
        img1.setForeground(new java.awt.Color(102, 255, 102));
        img1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img1.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N
        jPanel5.add(img1);

        img2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img2.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N
        jPanel5.add(img2);

        img3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img3.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N
        jPanel5.add(img3);

        btnFila1Der.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/flechaP.png")); // NOI18N
        btnFila1Der.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFila1DerActionPerformed(evt);
            }
        });
        jPanel5.add(btnFila1Der);

        btnFila2Izq.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/flechaP3.png")); // NOI18N
        btnFila2Izq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFila2IzqActionPerformed(evt);
            }
        });
        jPanel5.add(btnFila2Izq);

        img4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img4.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N
        jPanel5.add(img4);

        img5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img5.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N
        jPanel5.add(img5);

        img6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img6.setIcon(new ImageIcon("/vistaimagenes/verde.png")); // NOI18N
        jPanel5.add(img6);

        btnFila2Der.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/flechaP.png")); // NOI18N
        btnFila2Der.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFila2DerActionPerformed(evt);
            }
        });
        jPanel5.add(btnFila2Der);

        btnFila3Izq.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/flechaP3.png")); // NOI18N
        btnFila3Izq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFila3IzqActionPerformed(evt);
            }
        });
        jPanel5.add(btnFila3Izq);

        img7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img7.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N
        jPanel5.add(img7);

        img8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img8.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N
        jPanel5.add(img8);

        img9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img9.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/verde.png")); // NOI18N
        jPanel5.add(img9);

        btnFila3Der.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/flechaP.png")); // NOI18N
        btnFila3Der.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFila3DerActionPerformed(evt);
            }
        });
        jPanel5.add(btnFila3Der);
        jPanel5.add(jLabel21);

        btnCol1Down.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/flechaP4.png")); // NOI18N
        btnCol1Down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCol1DownActionPerformed(evt);
            }
        });
        jPanel5.add(btnCol1Down);

        btnCol2Down.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/flechaP4.png")); // NOI18N
        btnCol2Down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCol2DownActionPerformed(evt);
            }
        });
        jPanel5.add(btnCol2Down);

        btnCol3Down.setIcon(new ImageIcon("./src/com/rubik/vista/imagenes/flechaP4.png")); // NOI18N
        btnCol3Down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCol3DownActionPerformed(evt);
            }
        });
        jPanel5.add(btnCol3Down);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCol1UpActionPerformed(java.awt.event.ActionEvent evt) {
        cubo.girarColumna_Arriba(0);
        colocarImagenes();
    }

    private void btnFila2DerActionPerformed(java.awt.event.ActionEvent evt) {
        cubo.girarFila_D(1);
        colocarImagenes();
    }

    private void btnCuboArribaActionPerformed(java.awt.event.ActionEvent evt) {
        cubo.girarCubo_Arriba();
        colocarImagenes();
    }

    private void btnCuboAbajoActionPerformed(java.awt.event.ActionEvent evt) {
        cubo.girarCubo_Abajo();
        colocarImagenes();
    }

    private void btnCuboIzqActionPerformed(java.awt.event.ActionEvent evt) {
        cubo.girarCubo_I();
        colocarImagenes();
    }

    private void btnCuboDerActionPerformed(java.awt.event.ActionEvent evt) {
        cubo.girarCubo_D();
        colocarImagenes();
    }

    private void btnCol2UpActionPerformed(java.awt.event.ActionEvent evt) {
        cubo.girarColumna_Arriba(1);
        colocarImagenes();
    }

    private void btnCol3UpActionPerformed(java.awt.event.ActionEvent evt) {
        cubo.girarColumna_Arriba(2);
        colocarImagenes();
    }

    private void btnCol1DownActionPerformed(java.awt.event.ActionEvent evt) {
        cubo.girarColumna_Abajo(0);
        colocarImagenes();
    }

    private void btnCol2DownActionPerformed(java.awt.event.ActionEvent evt) {
        cubo.girarColumna_Abajo(1);
        colocarImagenes();
    }

    private void btnCol3DownActionPerformed(java.awt.event.ActionEvent evt) {
        cubo.girarColumna_Abajo(2);
        colocarImagenes();
    }

    private void btnFila1IzqActionPerformed(java.awt.event.ActionEvent evt) {
        cubo.girarFila_I(0);
        colocarImagenes();
    }

    private void btnFila2IzqActionPerformed(java.awt.event.ActionEvent evt) {
        cubo.girarFila_I(1);
        colocarImagenes();
    }

    private void btnFila3IzqActionPerformed(java.awt.event.ActionEvent evt) {
        cubo.girarFila_I(2);
        colocarImagenes();
    }

    private void btnFila1DerActionPerformed(java.awt.event.ActionEvent evt) {
        cubo.girarFila_D(0);
        colocarImagenes();
    }

    private void btnFila3DerActionPerformed(java.awt.event.ActionEvent evt) {
        cubo.girarFila_D(2);
        colocarImagenes();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCol1Down;
    private javax.swing.JButton btnCol1Up;
    private javax.swing.JButton btnCol2Down;
    private javax.swing.JButton btnCol2Up;
    private javax.swing.JButton btnCol3Down;
    private javax.swing.JButton btnCol3Up;
    private javax.swing.JButton btnCuboAbajo;
    private javax.swing.JButton btnCuboArriba;
    private javax.swing.JButton btnCuboDer;
    private javax.swing.JButton btnCuboIzq;
    private javax.swing.JButton btnFila1Der;
    private javax.swing.JButton btnFila1Izq;
    private javax.swing.JButton btnFila2Der;
    private javax.swing.JButton btnFila2Izq;
    private javax.swing.JButton btnFila3Der;
    private javax.swing.JButton btnFila3Izq;
    private JLabel img1;
    private JLabel img2;
    private JLabel img3;
    private JLabel img4;
    private JLabel img5;
    private JLabel img6;
    private JLabel img7;
    private JLabel img8;
    private JLabel img9;
    private javax.swing.JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel21;
    private JLabel jLabel25;
    private JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
