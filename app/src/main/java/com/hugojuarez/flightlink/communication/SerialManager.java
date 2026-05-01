package com.hugojuarez.flightlink.communication;

import com.fazecast.jSerialComm.SerialPort;

public class SerialManager {
    private SerialPort port;

    private static final SerialManager instance = new SerialManager();
    public static SerialManager getInstance() { return instance; }

    public SerialPort[] getSerialPorts() {
        return SerialPort.getCommPorts();
    }

    public void setPort(SerialPort port) {
        this.port = port;
    }

    public SerialPort getPort() {
        return port;
    }

    public boolean connect(int baud) {
        port.setBaudRate(baud);
        return port.openPort();
    }

    public void disconnect() {
        port.closePort();
    }
}
