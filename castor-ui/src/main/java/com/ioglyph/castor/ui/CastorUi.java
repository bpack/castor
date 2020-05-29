package com.ioglyph.castor.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CastorUi extends Application{

    public static void main(final String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) {
        primaryStage.setTitle("Castor UI");
        Button btn = new Button();
        btn.setText("Take Action");
        btn.setOnAction(event -> System.out.println("Castor UI Event Fired."));

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 250, 200));
        primaryStage.show();
    }

}
