package com.patterns.command3;

import java.util.HashMap;

public class ClientCode {

    public static void main(String[] args) {
        HashMap<Integer, CommandWithStatus> remoteConnection = new HashMap<>();
        remoteConnection.put(1, new CommandWithStatus(false,new LightCommand(new Light("Room Light"))));
        remoteConnection.put(2, new CommandWithStatus(false, new FanCommand(new Fan("Bajaj"))));

        IRemote iRemote = new Remote(remoteConnection, "TV remote");
        iRemote.pressButton(1);
        iRemote.pressButton(1);
        iRemote.pressButton(1);
        iRemote.pressButton(2);
        iRemote.pressButton(1);
        iRemote.pressButton(3);

    }
}
