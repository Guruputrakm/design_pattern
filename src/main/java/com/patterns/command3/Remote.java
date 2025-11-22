package com.patterns.command3;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

class CommandWithStatus{
    private boolean status;
    private ICommand command;

    public CommandWithStatus(boolean status, ICommand command) {
        this.status = status;
        this.command = command;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ICommand getCommand() {
        return command;
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }
}
public class Remote implements IRemote {
    private Map<Integer, CommandWithStatus> commandMap;
    private Map<Integer, ICommand> commandMapping;
    private final String name;

    public Remote(Map<Integer, CommandWithStatus> commandMap, String name) {
        this.commandMap = commandMap;
        this.name = name;
    }

    @Override
    public void pressButton(Integer index) {

        try {
            CommandWithStatus commandWithStatus = commandMap.entrySet()
                    .stream()
                    .filter(integerICommandEntry -> integerICommandEntry.getKey() == index)
                    .map(integerCommandWithStatusEntry -> integerCommandWithStatusEntry.getValue())
                    .findFirst().orElseThrow(() -> new RuntimeException("Command Not Found"));
            boolean presentStatus = commandWithStatus.isStatus();
            if(presentStatus) {
                commandWithStatus.getCommand().undo();
                commandWithStatus.setStatus(false);
            }else {
                commandWithStatus.getCommand().execute();
                commandWithStatus.setStatus(true);
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
