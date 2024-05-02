package edu.lab.hw4.commands;

import edu.lab.hw4.Command;

public class MoveBackward implements Command {
    private final int steps;

    public MoveBackward(int steps) {
        this.steps = steps;
    }

    @Override
    public String execute() {
        return "move backward, steps: " + steps;
    }
}
