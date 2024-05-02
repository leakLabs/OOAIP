package edu.lab.hw4;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    private final List<Command> commands;

    public Robot() {
        commands = new ArrayList<>();
    }

    public Robot nextCommand(Command command) {
        commands.add(command);
        return this;
    }

    public void clearCommands() {
        commands.clear();
    }

    public String executeCommandsList() {
        StringBuilder builder = new StringBuilder();
        for (Command command : commands) {
            builder.append(command.execute()).append('\n');
        }
        builder.append("done");
        return builder.toString();
    }
}
