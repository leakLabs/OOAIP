package edu.lab.hw4.commands;

import edu.lab.hw4.Command;

public class TurnRight implements Command {
    private final double angle;

    public TurnRight(double angle) {
        this.angle = angle;
    }

    @Override
    public String execute() {
        return "turn right, angle: " + angle;
    }
}
