package com.example.demo.DemoApplication;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {



    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 500);
        stage.setScene(scene);
        stage.show();
    }


    public static boolean showPersonEditDialog(){
        try{
            FXMLLoader loader  = new FXMLLoader();
            loader.setLocation(Application.class.getResource("EditBook.fxml"));
            AnchorPane page = (AnchorPane) loader.load();

            Stage dialogStage = new Stage();
            dialogStage .setTitle("Редактирование книги");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            dialogStage.showAndWait();
            return true;
        } catch (IOException e){
              e.printStackTrace();
              return false;
        }
    }

    public static String printUrl(String url){
        url = "GET http://localhost:2825/api/v1/book/all";
        return url;
    }



    @FXML
    public void handle(Event arg0) {
        showPersonEditDialog();
    }


}