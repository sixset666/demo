package com.example.client1.controllers;

import com.example.client1.Application;
import com.example.client1.Entity.BookEntity;
import com.example.client1.Utils.HTTPUtils;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class MainController {



    public static ObservableList<BookEntity> booksData = FXCollections.observableArrayList();
    HTTPUtils http = new HTTPUtils();
    @FXML
    public TableView<BookEntity> tableBooks;
    @FXML
    private TableColumn<BookEntity, String> bookName;
    @FXML
    private TableColumn<BookEntity, String> bookAuthor;
    @FXML
    private TableColumn<BookEntity, String> bookPublisher;
    @FXML
    private TableColumn<BookEntity, String> bookYear;
    @FXML
    private TableColumn<BookEntity, String> bookChapter;
    @FXML
    private void initialize() throws Exception {
        System.out.println(http.get("http://localhost:28242/api/v1/","all"));

    @FXML
     void addBook(ActionEvent event) throws IOException {
        Application.showPersonEditDialog();
    }

}
