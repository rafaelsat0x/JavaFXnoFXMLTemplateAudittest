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
        VBox root = new VBox(10);
        Scene scene = new Scene(root, 300, 300);
        Button button = new Button("Teste Butão do Dias");
        Label label = new Label("Testudo Label");
        TextArea textArea = new TextArea("Sudo textArea");
        root.getChildren().addAll(label, textArea, button);
        stage.setScene(scene);
        stage.show();
    }
}