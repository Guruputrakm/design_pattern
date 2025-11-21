package com.patterns.command2;

public class ChannelChangeCommand implements Command2{

    private final TV tv;
    private String toChannel;
    private String fromChanel;

    public ChannelChangeCommand(TV tv) {
        this.tv = tv;
    }

    public void setChannelChange(String toChannel, String fromChannel) {
        this.toChannel = toChannel;
        this.fromChanel = fromChannel;
    }

    @Override
    public void execute() {
        this.tv.channelChange(this.toChannel,this.fromChanel);
    }
}
