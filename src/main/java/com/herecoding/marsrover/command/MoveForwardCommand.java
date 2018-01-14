package com.herecoding.marsrover.command;

import com.herecoding.marsrover.rover.Rover;
/**
 * Created by Sanjeev.Yadav on 1/14/2018..
 */
public class MoveForwardCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.moveForward();
    }
}
