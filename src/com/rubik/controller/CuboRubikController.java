package com.rubik.controller;

import com.rubik.modelo.Cubo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class CuboRubikController implements Initializable {

    @FXML
    private ImageView imgR1;

    @FXML
    private ImageView imgR3;

    @FXML
    private ImageView imgR2;

    @FXML
    private ImageView imgR4;

    @FXML
    private ImageView imgR6;

    @FXML
    private ImageView imgR5;

    @FXML
    private ImageView imgR8;

    @FXML
    private ImageView imgR7;

    @FXML
    private ImageView imgR9;

    @FXML
    private ImageView imgY1;

    @FXML
    private ImageView imgY2;

    @FXML
    private ImageView imgY3;

    @FXML
    private ImageView imgY4;

    @FXML
    private ImageView imgY5;

    @FXML
    private ImageView imgY6;

    @FXML
    private ImageView imgY7;

    @FXML
    private ImageView imgY8;

    @FXML
    private ImageView imgY9;

    @FXML
    private ImageView imgO1;

    @FXML
    private ImageView imgO2;

    @FXML
    private ImageView imgO3;

    @FXML
    private ImageView imgO4;

    @FXML
    private ImageView imgO5;

    @FXML
    private ImageView imgO6;

    @FXML
    private ImageView imgO7;

    @FXML
    private ImageView imgO8;

    @FXML
    private ImageView imgO9;

    @FXML
    private ImageView imgG1;

    @FXML
    private ImageView imgG2;

    @FXML
    private ImageView imgG3;

    @FXML
    private ImageView imgG4;

    @FXML
    private ImageView imgG5;

    @FXML
    private ImageView imgG6;

    @FXML
    private ImageView imgG7;

    @FXML
    private ImageView imgG8;

    @FXML
    private ImageView imgG9;

    @FXML
    private ImageView imgB1;

    @FXML
    private ImageView imgB2;

    @FXML
    private ImageView imgB3;

    @FXML
    private ImageView imgB4;

    @FXML
    private ImageView imgB5;

    @FXML
    private ImageView imgB6;

    @FXML
    private ImageView imgB7;

    @FXML
    private ImageView imgB8;

    @FXML
    private ImageView imgB9;

    @FXML
    private ImageView imgW1;

    @FXML
    private ImageView imgW2;

    @FXML
    private ImageView imgW3;

    @FXML
    private ImageView imgW4;

    @FXML
    private ImageView imgW5;

    @FXML
    private ImageView imgW9;

    @FXML
    private ImageView imgW8;

    @FXML
    private ImageView imgW6;

    @FXML
    private ImageView imgW7;

    @FXML
    private Button btnInfAntiHorario;

    @FXML
    private Button btnInfHorario;

    @FXML
    private Button btnSupHorario;

    @FXML
    private Button btnHSupAntiHorario;

    @FXML
    private Button btnLAntiHorario;

    @FXML
    private Button btnLHorario;

    @FXML
    private Button btnRAntiHorario;

    @FXML
    private Button btnRHorario;

    @FXML
    private Button btnFHorario;

    @FXML
    private Button btnFAntiHorario;

    @FXML
    private Button btnBHorario;

    @FXML
    private Button btnBAntiHorario;

    @FXML
    private Button btnCAntiHorario;

    @FXML
    private Button btnCHorario;

    @FXML
    private Button btnCHorizontalHorario;

    @FXML
    private Button btnCHorizontalAntiHorario;

    @FXML
    private Button btnMovVertiAntiHorario;

    @FXML
    private Button btnMovVertiHorario;

    @FXML
    private Button btnMovHoriAntiHorario;

    @FXML
    private Button btnMovHoriHorario;

    private Cubo cubo;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cubo = new Cubo();

        btnHSupAntiHorario.setOnMouseClicked(event -> {
            cubo.movHorizontal(Cubo.UP, 1);
            colorcarImagenes();
        });

        btnSupHorario.setOnMouseClicked(event -> {
            cubo.movHorizontal(Cubo.UP, 0);
            colorcarImagenes();
        });

        btnInfAntiHorario.setOnMouseClicked(event -> {
            cubo.movHorizontal(Cubo.DOWN, 1);
            colorcarImagenes();
        });

        btnInfHorario.setOnMouseClicked(event -> {
            cubo.movHorizontal(Cubo.DOWN, 0);
            colorcarImagenes();
        });

        btnLAntiHorario.setOnMouseClicked(event -> {
            cubo.movVertical(Cubo.LEFT, 1);
            colorcarImagenes();
        });

        btnLHorario.setOnMouseClicked(event -> {
            cubo.movVertical(Cubo.LEFT, 0);
            colorcarImagenes();
        });

        btnRAntiHorario.setOnMouseClicked(event -> {
            cubo.movVertical(Cubo.RIGTH, 1);
            colorcarImagenes();
        });

        btnRHorario.setOnMouseClicked(event -> {
            cubo.movVertical(Cubo.RIGTH, 0);
            colorcarImagenes();
        });

        btnFHorario.setOnMouseClicked(event -> {
            cubo.movFrontal(Cubo.FRONT, 0);
            colorcarImagenes();
        });

        btnFAntiHorario.setOnMouseClicked(event -> {
            cubo.movFrontal(Cubo.FRONT, 1);
            colorcarImagenes();
        });

        btnBHorario.setOnMouseClicked(event -> {
            cubo.movFrontal(Cubo.BACK, 0);
            colorcarImagenes();
        });

        btnBAntiHorario.setOnMouseClicked(event -> {
            cubo.movFrontal(Cubo.BACK, 1);
            colorcarImagenes();
        });

        btnCHorario.setOnMouseClicked(event -> {
            cubo.movCruzVertical(0);
            colorcarImagenes();
        });

        btnCAntiHorario.setOnMouseClicked(event -> {
            cubo.movCruzVertical(1);
            colorcarImagenes();
        });

        btnCHorizontalHorario.setOnMouseClicked(event -> {
            cubo.movCruzHorizontal(0);
            colorcarImagenes();
        });

        btnCHorizontalAntiHorario.setOnMouseClicked(event -> {
            cubo.movCruzHorizontal(1);
            colorcarImagenes();
        });

        btnMovHoriHorario.setOnMouseClicked(event -> {
            cubo.movHorizontal(Cubo.UP, 0);
            cubo.movCruzHorizontal(0);
            cubo.movHorizontal(Cubo.DOWN, 0);
            colorcarImagenes();
        });

        btnMovHoriAntiHorario.setOnMouseClicked(event -> {
            cubo.movHorizontal(Cubo.UP, 1);
            cubo.movCruzHorizontal(1);
            cubo.movHorizontal(Cubo.DOWN, 1);
            colorcarImagenes();
        });

        btnMovVertiHorario.setOnMouseClicked(event -> {
            cubo.movVertical(Cubo.LEFT, 0);
            cubo.movCruzVertical(0);
            cubo.movVertical(Cubo.RIGTH, 0);
            colorcarImagenes();
        });

        btnMovVertiAntiHorario.setOnMouseClicked(event -> {
            cubo.movVertical(Cubo.LEFT, 1);
            cubo.movCruzVertical(1);
            cubo.movVertical(Cubo.RIGTH, 1);
            colorcarImagenes();
        });

        colorcarImagenes();
    }

    private void colorcarImagenes() {

        imgR1.setImage(convertImagen(cubo.getColorEsquina(Cubo.UP, Cubo.LEFT, Cubo.BACK, Cubo.UP)));
        imgR2.setImage(convertImagen(cubo.getColorLateral(Cubo.UP, Cubo.BACK, Cubo.UP)));
        imgR3.setImage(convertImagen(cubo.getColorEsquina(Cubo.UP, Cubo.RIGTH, Cubo.BACK, Cubo.UP)));
        imgR4.setImage(convertImagen(cubo.getColorLateral(Cubo.UP, Cubo.LEFT, Cubo.UP)));
        imgR5.setImage(convertImagen(cubo.getColorCentral(Cubo.UP)));
        imgR6.setImage(convertImagen(cubo.getColorLateral(Cubo.UP, Cubo.RIGTH, Cubo.UP)));
        imgR7.setImage(convertImagen(cubo.getColorEsquina(Cubo.UP, Cubo.LEFT, Cubo.FRONT, Cubo.UP)));
        imgR8.setImage(convertImagen(cubo.getColorLateral(Cubo.UP, Cubo.FRONT, Cubo.UP)));
        imgR9.setImage(convertImagen(cubo.getColorEsquina(Cubo.UP, Cubo.FRONT, Cubo.RIGTH, Cubo.UP)));

        imgG1.setImage(convertImagen(cubo.getColorEsquina(Cubo.LEFT, Cubo.UP, Cubo.BACK, Cubo.LEFT)));
        imgG2.setImage(convertImagen(cubo.getColorLateral(Cubo.LEFT, Cubo.UP, Cubo.LEFT)));
        imgG3.setImage(convertImagen(cubo.getColorEsquina(Cubo.LEFT, Cubo.UP, Cubo.FRONT, Cubo.LEFT)));
        imgG4.setImage(convertImagen(cubo.getColorLateral(Cubo.LEFT, Cubo.BACK, Cubo.LEFT)));
        imgG5.setImage(convertImagen(cubo.getColorCentral(Cubo.LEFT)));
        imgG6.setImage(convertImagen(cubo.getColorLateral(Cubo.LEFT, Cubo.FRONT, Cubo.LEFT)));
        imgG7.setImage(convertImagen(cubo.getColorEsquina(Cubo.LEFT, Cubo.BACK, Cubo.DOWN, Cubo.LEFT)));
        imgG8.setImage(convertImagen(cubo.getColorLateral(Cubo.LEFT, Cubo.DOWN, Cubo.LEFT)));
        imgG9.setImage(convertImagen(cubo.getColorEsquina(Cubo.LEFT, Cubo.FRONT, Cubo.DOWN, Cubo.LEFT)));

        imgB1.setImage(convertImagen(cubo.getColorEsquina(Cubo.UP, Cubo.FRONT, Cubo.RIGTH, Cubo.RIGTH)));
        imgB2.setImage(convertImagen(cubo.getColorLateral(Cubo.RIGTH, Cubo.UP, Cubo.RIGTH)));
        imgB3.setImage(convertImagen(cubo.getColorEsquina(Cubo.RIGTH, Cubo.UP, Cubo.BACK, Cubo.RIGTH)));
        imgB4.setImage(convertImagen(cubo.getColorLateral(Cubo.RIGTH, Cubo.FRONT, Cubo.RIGTH)));
        imgB5.setImage(convertImagen(cubo.getColorCentral(Cubo.RIGTH)));
        imgB6.setImage(convertImagen(cubo.getColorLateral(Cubo.RIGTH, Cubo.BACK, Cubo.RIGTH)));
        imgB7.setImage(convertImagen(cubo.getColorEsquina(Cubo.RIGTH, Cubo.FRONT, Cubo.DOWN, Cubo.RIGTH)));
        imgB8.setImage(convertImagen(cubo.getColorLateral(Cubo.RIGTH, Cubo.DOWN, Cubo.RIGTH)));
        imgB9.setImage(convertImagen(cubo.getColorEsquina(Cubo.RIGTH, Cubo.BACK, Cubo.DOWN, Cubo.RIGTH)));

        imgO1.setImage(convertImagen(cubo.getColorEsquina(Cubo.DOWN, Cubo.LEFT, Cubo.FRONT, Cubo.DOWN)));
        imgO2.setImage(convertImagen(cubo.getColorLateral(Cubo.DOWN, Cubo.FRONT, Cubo.DOWN)));
        imgO3.setImage(convertImagen(cubo.getColorEsquina(Cubo.DOWN, Cubo.RIGTH, Cubo.FRONT, Cubo.DOWN)));
        imgO4.setImage(convertImagen(cubo.getColorLateral(Cubo.DOWN, Cubo.LEFT, Cubo.DOWN)));
        imgO5.setImage(convertImagen(cubo.getColorCentral(Cubo.DOWN)));
        imgO6.setImage(convertImagen(cubo.getColorLateral(Cubo.DOWN, Cubo.RIGTH, Cubo.DOWN)));
        imgO7.setImage(convertImagen(cubo.getColorEsquina(Cubo.DOWN, Cubo.LEFT, Cubo.BACK, Cubo.DOWN)));
        imgO8.setImage(convertImagen(cubo.getColorLateral(Cubo.DOWN, Cubo.BACK, Cubo.DOWN)));
        imgO9.setImage(convertImagen(cubo.getColorEsquina(Cubo.DOWN, Cubo.BACK, Cubo.RIGTH, Cubo.DOWN)));

        imgY1.setImage(convertImagen(cubo.getColorEsquina(Cubo.FRONT, Cubo.UP, Cubo.LEFT, Cubo.FRONT)));
        imgY2.setImage(convertImagen(cubo.getColorLateral(Cubo.FRONT, Cubo.UP, Cubo.FRONT)));
        imgY3.setImage(convertImagen(cubo.getColorEsquina(Cubo.FRONT, Cubo.UP, Cubo.RIGTH, Cubo.FRONT)));
        imgY4.setImage(convertImagen(cubo.getColorLateral(Cubo.FRONT, Cubo.LEFT, Cubo.FRONT)));
        imgY5.setImage(convertImagen(cubo.getColorCentral(Cubo.FRONT)));
        imgY6.setImage(convertImagen(cubo.getColorLateral(Cubo.FRONT, Cubo.RIGTH, Cubo.FRONT)));
        imgY7.setImage(convertImagen(cubo.getColorEsquina(Cubo.FRONT, Cubo.LEFT, Cubo.DOWN, Cubo.FRONT)));
        imgY8.setImage(convertImagen(cubo.getColorLateral(Cubo.FRONT, Cubo.DOWN, Cubo.FRONT)));
        imgY9.setImage(convertImagen(cubo.getColorEsquina(Cubo.FRONT, Cubo.RIGTH, Cubo.DOWN, Cubo.FRONT)));

        imgW1.setImage(convertImagen(cubo.getColorEsquina(Cubo.BACK, Cubo.UP, Cubo.RIGTH, Cubo.BACK)));
        imgW2.setImage(convertImagen(cubo.getColorLateral(Cubo.BACK, Cubo.UP, Cubo.BACK)));
        imgW3.setImage(convertImagen(cubo.getColorEsquina(Cubo.BACK, Cubo.UP, Cubo.LEFT, Cubo.BACK)));
        imgW4.setImage(convertImagen(cubo.getColorLateral(Cubo.BACK, Cubo.RIGTH, Cubo.BACK)));
        imgW5.setImage(convertImagen(cubo.getColorCentral(Cubo.BACK)));
        imgW6.setImage(convertImagen(cubo.getColorLateral(Cubo.BACK, Cubo.LEFT, Cubo.BACK)));
        imgW7.setImage(convertImagen(cubo.getColorEsquina(Cubo.BACK, Cubo.RIGTH, Cubo.DOWN, Cubo.BACK)));
        imgW8.setImage(convertImagen(cubo.getColorLateral(Cubo.BACK, Cubo.DOWN, Cubo.BACK)));
        imgW9.setImage(convertImagen(cubo.getColorEsquina(Cubo.BACK, Cubo.LEFT, Cubo.DOWN, Cubo.BACK)));

    }

    private Image convertImagen(char color) {
        String url = "";
        if (color == Cubo.COLOR_RED)
            url = "/com/rubik/vista/imagenes/icon_rojo.png";
        else if (color == Cubo.COLOR_BLUE)
            url = "/com/rubik/vista/imagenes/icon_azul.png";
        else if (color == Cubo.COLOR_GREEN)
            url = "/com/rubik/vista/imagenes/icon_verde.png";
        else if (color == Cubo.COLOR_ORANGE)
            url = "/com/rubik/vista/imagenes/icon_naranja.png";
        else if (color == Cubo.COLOR_WHITE)
            url = "/com/rubik/vista/imagenes/icon_blanco.png";
        else if (color == Cubo.COLOR_YELLOW)
            url = "/com/rubik/vista/imagenes/icon_amarillo.png";

        return new Image(url);
    }
}
