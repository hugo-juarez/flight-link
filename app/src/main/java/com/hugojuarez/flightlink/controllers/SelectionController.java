package com.hugojuarez.flightlink.controllers;

import com.hugojuarez.flightlink.Main;
import com.hugojuarez.flightlink.communication.SerialManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ChoiceBox;
import com.fazecast.jSerialComm.SerialPort;

import java.io.IOException;
import java.util.Arrays;

public class SelectionController {
    @FXML
    public ChoiceBox<SerialPort> portsChoiceBox;

    private final SerialManager serial = SerialManager.getInstance();

    @FXML
    public void initialize() {
        portsChoiceBox.getItems().setAll(serial.getSerialPorts());
    }

    @FXML
    public void handleSelectPort(ActionEvent event) throws IOException {
        SerialPort selectedPort = portsChoiceBox.getSelectionModel().getSelectedItem();
        if (selectedPort == null) {
            return;
        }

        serial.setPort(portsChoiceBox.getSelectionModel().getSelectedItem());
        Main.changeMainView();
    }

}
