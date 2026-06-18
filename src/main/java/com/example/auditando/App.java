package com.example.auditando;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;

public class App extends Application {

    @Override
    public void start(Stage stage){
        VBox root = new VBox(10); //Cria layout com 10px de spacing
        Scene scene = new Scene(root, 300, 300); //Cria a cena com o layout dentro
        Button button = new Button("Teste Butão do Dias"); //Cria um botão (o do Dias)
        Label label = new Label("Testudo Label"); //Cria uma Label
        TextArea textArea = new TextArea("Sudo textArea"); //Cria uma TextArea
        root.getChildren().addAll(label, textArea, button); //Adiciona os "campos" no layout
        stage.setScene(scene); //seta a Scene atual
        stage.show(); //Mostra a scene
    }
}