package com.hugojuarez.flightlink.controllers;

import com.hugojuarez.flightlink.communication.SerialManager;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label commPort;

    @FXML
    private Label message;

    private final SerialManager serial =  SerialManager.getInstance();

    @FXML
    public void initialize() {
        if( serial.connect(9600) ) {
            commPort.setText(serial.getPort());
        } else {
            commPort.setText("Cannot connect");
        }
    }

}
