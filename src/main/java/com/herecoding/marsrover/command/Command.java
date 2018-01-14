package com.herecoding.marsrover.command;

import com.herecoding.marsrover.rover.Rover;

/**
 * Created by Sanjeev.Yadav on 1/14/2018..
 */
public interface Command {

    public abstract void execute(Rover rover);
}
