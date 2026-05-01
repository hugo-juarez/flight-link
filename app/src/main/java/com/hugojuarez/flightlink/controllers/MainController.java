package com.hugojuarez.flightlink.controllers;

import com.hugojuarez.flightlink.communication.SerialManager;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label commPort;

    private final SerialManager serial =  SerialManager.getInstance();

    @FXML
    public void initialize() {
        commPort.setText(serial.getPort().toString());
    }

}
