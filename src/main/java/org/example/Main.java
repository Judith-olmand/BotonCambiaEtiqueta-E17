package org.example;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


import static javafx.application.Application.launch;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage){
        Label mensaje = new Label("Pulsa el botón");
        Button boton = new Button("Aquí!!!");

        VBox vertical =  new VBox(mensaje,boton);

        boton.setOnAction(e -> {mensaje.setText("Has pulsado el botón!!!!");});

        Scene scene = new Scene(vertical,300,200);
        primaryStage.setTitle("Boton cambia etiqueta, Ejercicio 17");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
