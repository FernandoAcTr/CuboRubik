package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import modelo.Cara;
import modelo.Cubo5x5;

import java.io.File;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private GridPane paneFace5;

    @FXML
    private GridPane paneFace2;

    @FXML
    private GridPane paneFace1;

    @FXML
    private GridPane paneFace3;

    @FXML
    private GridPane paneFace6;

    @FXML
    private GridPane paneFace4;

    @FXML
    private JFXButton btnFaceUp;

    @FXML
    private JFXButton btnFaceUpPrime;

    @FXML
    private JFXButton btnFaceDown;

    @FXML
    private JFXButton btnFaceLeft;

    @FXML
    private JFXButton btnFaceDownPrime;

    @FXML
    private JFXButton btnFaceLeftPrime;

    @FXML
    private JFXButton btnFaceRigth;

    @FXML
    private JFXButton btnFaceFront;

    @FXML
    private JFXButton btnFaceRigthPrime;

    @FXML
    private JFXButton btnFaceFrontPrime;

    @FXML
    private JFXButton btnFaceBack;

    @FXML
    private JFXButton btnFaceBackPrime;

    @FXML
    private Spinner<Integer> spnColumn;

    @FXML
    private JFXButton btnColumnUp;

    @FXML
    private JFXButton btnColumnDown;

    @FXML
    private Spinner<Integer> spnRow;

    @FXML
    private JFXButton btnRowRigth;

    @FXML
    private JFXButton btnRowLeft;

    @FXML
    private JFXButton btnScramble;

    @FXML
    private Label lblScramble;

    @FXML
    private JFXButton btnRestart;

    Cubo5x5 cube;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initData();
        initComponents();
    }

    private void initData() {
        cube = new Cubo5x5();
    }

    private void initComponents() {

        spnColumn.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(2, 4));
        spnRow.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(2, 4));

        fillAllCube();

        btnFaceUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cube.girarFila_D(0);
                fillFace1();
                fillFace2();
                fillFace3();
                fillFace5();
                fillFace6();
            }
        });

        btnFaceUpPrime.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cube.girarFila_I(0);
                fillFace1();
                fillFace2();
                fillFace3();
                fillFace5();
                fillFace6();
            }
        });

        btnFaceDown.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cube.girarFila_D(4);
                fillFace1();
                fillFace2();
                fillFace3();
                fillFace4();
                fillFace6();
            }
        });

        btnFaceDownPrime.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cube.girarFila_I(4);
                fillFace1();
                fillFace2();
                fillFace3();
                fillFace4();
                fillFace6();
            }
        });

        btnFaceLeft.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cube.girarColumna_Abajo(0);
                fillFace1();
                fillFace2();
                fillFace4();
                fillFace5();
                fillFace6();
            }
        });

        btnFaceLeftPrime.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cube.girarColumna_Arriba(0);
                fillFace1();
                fillFace2();
                fillFace4();
                fillFace5();
                fillFace6();
            }
        });

        btnFaceRigth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cube.girarColumna_Abajo(4);
                fillFace1();
                fillFace3();
                fillFace4();
                fillFace5();
                fillFace6();
            }
        });

        btnFaceRigthPrime.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cube.girarColumna_Arriba(4);
                fillFace1();
                fillFace3();
                fillFace4();
                fillFace5();
                fillFace6();
            }
        });

        btnFaceFront.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cube.girarCubo_D();
                cube.girarColumna_Abajo(0);
                cube.girarCubo_I();

                fillFace1();
                fillFace2();
                fillFace3();
                fillFace4();
                fillFace5();
            }
        });

        btnFaceFrontPrime.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cube.girarCubo_D();
                cube.girarColumna_Arriba(0);
                cube.girarCubo_I();

                fillFace1();
                fillFace2();
                fillFace3();
                fillFace4();
                fillFace5();
            }
        });

        btnFaceBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cube.girarCubo_I();
                cube.girarColumna_Arriba(0);
                cube.girarCubo_D();

                fillFace2();
                fillFace3();
                fillFace4();
                fillFace5();
                fillFace6();
            }
        });

        btnFaceBackPrime.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cube.girarCubo_I();
                cube.girarColumna_Abajo(0);
                cube.girarCubo_D();

                fillFace2();
                fillFace3();
                fillFace4();
                fillFace5();
                fillFace6();
            }
        });

        btnColumnUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int column = spnColumn.getValue() - 1;
                cube.girarColumna_Arriba(column);
                fillFace1();
                fillFace4();
                fillFace5();
                fillFace6();
            }
        });

        btnColumnDown.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int column = spnColumn.getValue() - 1;
                cube.girarColumna_Abajo(column);
                fillFace1();
                fillFace4();
                fillFace5();
                fillFace6();
            }
        });

        btnRowRigth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int row = spnRow.getValue() - 1;
                cube.girarFila_D(row);
                fillFace1();
                fillFace2();
                fillFace3();
                fillFace6();
            }
        });

        btnRowLeft.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int row = spnRow.getValue() - 1;
                cube.girarFila_I(row);
                fillFace1();
                fillFace2();
                fillFace3();
                fillFace6();
            }
        });

        btnScramble.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cube = new Cubo5x5();
                String scramble = scramble(generateRandom(5,8));
                lblScramble.setText(scramble);
                fillAllCube();
            }
        });

        btnRestart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cube = new Cubo5x5();
                lblScramble.setText("");
                fillAllCube();
            }
        });

    }

    private void fillFace1() {
        char[][] colors = cube.getCara1().getColores();

        paneFace1.getChildren().clear();
        ImageView image;

        for (int row = 0; row < Cara.NUM_FILAS; row++)
            for (int col = 0; col < Cara.NUM_FILAS; col++) {
                image = convertCharToImage(colors[row][col]);
                paneFace1.add(image, col, row);
            }
    }

    private void fillFace2() {
        char[][] colors = cube.getCara2().getColores();
        paneFace2.getChildren().clear();
        ImageView image;

        for (int row = 0; row < Cara.NUM_FILAS; row++)
            for (int col = 0; col < Cara.NUM_FILAS; col++) {
                image = convertCharToImage(colors[row][col]);
                paneFace2.add(image, col, row);
            }
    }

    private void fillFace3() {
        char[][] colors = cube.getCara3().getColores();
        paneFace3.getChildren().clear();
        ImageView image;

        for (int row = 0; row < Cara.NUM_FILAS; row++)
            for (int col = 0; col < Cara.NUM_FILAS; col++) {
                image = convertCharToImage(colors[row][col]);
                paneFace3.add(image, col, row);
            }
    }

    private void fillFace4() {
        char[][] colors = cube.getCara4().getColores();
        paneFace4.getChildren().clear();
        ImageView image;

        for (int row = 0; row < Cara.NUM_FILAS; row++)
            for (int col = 0; col < Cara.NUM_FILAS; col++) {
                image = convertCharToImage(colors[row][col]);
                paneFace4.add(image, col, row);
            }
    }

    private void fillFace5() {
        char[][] colors = cube.getCara5().getColores();
        paneFace5.getChildren().clear();
        ImageView image;

        for (int row = 0; row < Cara.NUM_FILAS; row++)
            for (int col = 0; col < Cara.NUM_FILAS; col++) {
                image = convertCharToImage(colors[row][col]);
                paneFace5.add(image, col, row);
            }
    }

    private void fillFace6() {
        char[][] colors = cube.getCara6().getColores();
        paneFace6.getChildren().clear();
        ImageView image;

        for (int row = 0; row < Cara.NUM_FILAS; row++)
            for (int col = 0; col < Cara.NUM_FILAS; col++) {
                image = convertCharToImage(colors[row][col]);
                paneFace6.add(image, col, row);
            }
    }

    private void fillAllCube(){
        fillFace1();
        fillFace2();
        fillFace3();
        fillFace4();
        fillFace5();
        fillFace6();
    }

    private ImageView convertCharToImage(char color) {
        String url = "";
        switch (color) {
            case 'O':
                url = "/vista/imagenes/naranja.png";
                break;

            case 'W':
                url = "/vista/imagenes/blanco.png";
                break;

            case 'Y':
                url = "/vista/imagenes/amarillo.png";
                break;

            case 'B':
                url = "/vista/imagenes/azul.png";
                break;

            case 'R':
                url = "/vista/imagenes/rojo.png";
                break;

            case 'G':
                url = "/vista/imagenes/verde.png";
        }

        ImageView image = new ImageView(getClass().getResource(url).toExternalForm());
        image.setFitHeight(25);
        image.setFitWidth(25);

        return image;
    }

    private String scramble(int numMovs) {
        String scramble = "";
        int movType;
        int col, row;

        for (int i = 0; i < numMovs; i++) {
            movType = generateRandom(1, 3);

            if (movType == 1)
                scramble += getBasicMov(generateRandom(1, 12)) + " ";

            else if (movType == 2) {
                col = generateRandom(2, 4);
                scramble += getColumnMove(generateRandom(1, 2), col) + " ";

            } else if (movType == 3) {
                row = generateRandom(2, 4);
                scramble += getRowMove(generateRandom(1, 2), row) + " ";
            }

        }

        return scramble;
    }

    private String getBasicMov(int num) {
        String mov = "";

        switch (num) {
            case 1:
                mov = "U";
                cube.girarFila_D(0);
                break;
            case 2:
                mov = "U'";
                cube.girarFila_I(0);
                break;
            case 3:
                mov = "D";
                cube.girarFila_D(4);
                break;
            case 4:
                mov = "D'";
                cube.girarFila_I(4);
                break;
            case 5:
                mov = "R";
                cube.girarColumna_Abajo(4);
                break;
            case 6:
                mov = "R'";
                cube.girarColumna_Arriba(4);
                break;
            case 7:
                mov = "L";
                cube.girarColumna_Abajo(0);
                break;
            case 8:
                mov = "L'";
                cube.girarColumna_Arriba(0);
                break;
            case 9:
                mov = "F";
                cube.girarCubo_D();
                cube.girarColumna_Abajo(0);
                cube.girarCubo_I();
                break;
            case 10:
                mov = "F'";
                cube.girarCubo_D();
                cube.girarColumna_Arriba(0);
                cube.girarCubo_I();
                break;
            case 11:
                mov = "B";
                cube.girarCubo_I();
                cube.girarColumna_Arriba(0);
                cube.girarCubo_D();
                break;
            case 12:
                mov = "B'";
                cube.girarCubo_I();
                cube.girarColumna_Abajo(0);
                cube.girarCubo_D();
                break;
        }

        return mov;
    }

    private String getColumnMove(int typeMove, int column) {
        String mov = "";
        switch (typeMove) {
            case 1: // Up
                mov = column + "U";
                cube.girarColumna_Arriba(column - 1);
                break;
            case 2: //Down
                mov = column + "D";
                cube.girarColumna_Abajo(column - 1);
                break;
        }

        return mov;
    }

    private String getRowMove(int typeMove, int row) {
        String mov = "";
        switch (typeMove) {
            case 1: // Rigth
                mov = row + "R";
                cube.girarFila_D(row - 1);
                break;
            case 2: //Left
                mov = row + "L";
                cube.girarFila_I(row - 1);
                break;
        }

        return mov;
    }

    private int generateRandom(int from, int to) {
        return (int) (Math.random() * (to - from + 1) + from);
    }
}
