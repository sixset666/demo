module com.example.client1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires lombok;

    opens com.example.client1 to javafx.fxml;
    exports com.example.client1;
    exports com.example.client1.controllers;
    opens com.example.client1.controllers to javafx.fxml;


    requires okhttp3;

    requires com.google.gson;


    exports com.example.client1.Entity;

    exports com.example.client1.response;

    exports com.example.client1.service;

    exports com.example.client1.Utils;

    opens com.example.client1.controller to javafx.fxml;
}