package controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import modelo.Cara;
import modelo.Cubo5x5;

import java.net.URL;
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
    private JFXButton btbFaceRigthPrime;

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

    private ImageView[][] face1, face2, face3, face4, face5, face6;

    Cubo5x5 cube;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initData();
        initComponents();
    }

    private void initData(){
        cube = new Cubo5x5();

        face1 = getImageViewFace();
        face2 = getImageViewFace();
        face3 = getImageViewFace();
        face4 = getImageViewFace();
        face5 = getImageViewFace();
        face6 = getImageViewFace();
    }

    private void initComponents(){
        spnColumn.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(2,4));
        spnRow.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(2,4));

        fillFace1();
    }

    private ImageView[][] getImageViewFace(){
        ImageView imageView;
        ImageView images[][] = new ImageView[Cara.NUM_FILAS][Cara.NUM_FILAS];
        for (int i = 0; i < Cara.NUM_FILAS; i++)
            for (int j = 0; j < Cara.NUM_FILAS; j++) {
                imageView = new ImageView();
                imageView.setFitHeight(25);
                imageView.setFitWidth(25);
                images[i][j] = imageView;
            }

        return images;
    }

    private void fillFace1(){
        char[][] colorsFace1 = cube.getCara1().getColores();
        paneFace1.getChildren().clear();
        ImageView image;

        for (int row = 0; row < Cara.NUM_FILAS; row++)
            for (int col = 0; col < Cara.NUM_FILAS; col++) {
                image = new ImageView();
                image.setFitWidth(25);
                image.setFitHeight(25);
                //image.setImage(convertCharToImage(colorsFace1[row][col]));
                image.setImage(new Image("/vista/imagenes/blanco.png"));
                paneFace1.add(face1[row][col], row, col);
            }
    }

    private Image convertCharToImage(char color){
        String url = "";
        switch (color){
            case 'O':
                url = "vista/imagenes/naranja.png";
                break;

            case 'W':
                url = "/src/vista/imagenes/blanco.png";
                break;

            case 'Y':
                url = "vista/imagenes/amarillo.png";
                break;

            case 'B':
                url = "vista/imagenes/azul.png";
                break;

            case 'R':
                url = "vista/imagenes/rojo.png";
                break;

            case 'G':
                url = "vista/imagenes/verde.png";
        }

        return new Image(url);
    }
}
