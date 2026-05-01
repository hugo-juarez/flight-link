module com.hugojuarez.flightlink {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fazecast.jSerialComm;

    opens com.hugojuarez.flightlink.controllers to javafx.fxml;
    exports com.hugojuarez.flightlink;
}