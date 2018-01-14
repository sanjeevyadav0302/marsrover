package com.herecoding.marsrover.command;
/**
 * Created by Sanjeev.Yadav on 1/14/2018..
 */
public enum CommandLookup {

    R(new SpinRightCommand()),

    L(new SpinLeftCommand()),

    M(new MoveForwardCommand()),

    B(new MoveBackCommand());

    private final Command command;

    CommandLookup(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }
}
