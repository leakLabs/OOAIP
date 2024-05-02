package edu.lab.hw4.commands;

import edu.lab.hw4.Command;

public class TurnLeft implements Command {
    private final double angle;

    public TurnLeft(double angle) {
        this.angle = angle;
    }

    @Override
    public String execute() {
        return "turn left, angle: " + angle;
    }
}
