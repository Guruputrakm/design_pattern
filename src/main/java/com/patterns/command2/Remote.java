package com.patterns.command2;

import java.util.ArrayList;
import java.util.List;

public class Remote {

    List<Command2> command2s = new ArrayList<>();
    private final TV tv = new TV();
    public Remote() {
        this.command2s.add(new ReduceVolumCommand(tv));
        this.command2s.add((new VolumnIncreaseCommansd(tv)));
        this.command2s.add(new ChannelChangeCommand(tv));
    }

    public void press(Type type) {
        switch (type) {
            case CHANNAL -> {
                ChannelChangeCommand channelChangeCommand = (ChannelChangeCommand) this.command2s.get(2);
                channelChangeCommand.setChannelChange("YOUTUBE", "UDAYA");
                channelChangeCommand.execute();
                break;
            }
            case REDUCE_VOL -> {
                this.command2s.get(0).execute();
                break;
            }
            case INCREASE_VOL -> {
                this.command2s.get(1).execute();
                break;
            }
            default -> {
                System.out.println("NOT A COKMAD");
            }
        }
    }
}
