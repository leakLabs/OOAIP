package edu.lab.hw4.commands;

import edu.lab.hw4.Command;

public class MoveForward implements Command {
    private final int steps;

    public MoveForward(int steps) {
        this.steps = steps;
    }

    @Override
    public String execute() {
        return "move forward, steps: " + steps;
    }
}
