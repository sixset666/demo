package com.example.client1.controllers;

import com.example.client1.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class MainController {



    @FXML
    void is(ActionEvent event) {
       Application.printUrl("http://localhost:2825/api/v1/book/all");
    }
    @FXML
     void addBook(ActionEvent event) throws IOException {
        Application.showPersonEditDialog();
    }

}
