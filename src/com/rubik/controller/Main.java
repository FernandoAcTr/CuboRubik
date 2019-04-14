package com.rubik.controller;

import com.rubik.modelo.Cubo;
import insidefx.undecorator.Undecorator;
import insidefx.undecorator.UndecoratorScene;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
       /* Parent root = FXMLLoader.load(getClass().getResource("/com/rubik/vista/layout_main.fxml"));
        primaryStage.setTitle("Cubo de Rubik");
        primaryStage.setScene(new Scene(root, 900, 750));
        primaryStage.show();*/


        Region root = (Region) FXMLLoader.load(getClass().getResource("/com/rubik/vista/layout_main.fxml"));

        final UndecoratorScene undecoratorScene = new UndecoratorScene(primaryStage, root);
        undecoratorScene.setFadeInTransition();

        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {
                we.consume();
                undecoratorScene.setFadeOutTransition();
            }
        });

        undecoratorScene.addStylesheet("com/rubik/vista/css/decoration.css");
        primaryStage.setScene(undecoratorScene);

        primaryStage.toFront();
        primaryStage.show();


    }

    public static void main(String[] args){
        launch(args);
    }
}
