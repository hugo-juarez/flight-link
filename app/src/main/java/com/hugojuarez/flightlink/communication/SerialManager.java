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
        if( port == null ) return;

        this.port = port;
    }

    public String getPort() {
        if( port == null ) return "";

        return port.getSystemPortName();
    }

    public boolean connect(int baud) {
        if( port == null ) return false;

        port.setBaudRate(baud);
        return port.openPort();
    }

    public void disconnect() {
        if( port == null ) return;

        if( port.isOpen()) {
            port.closePort();
        }
    }
}
