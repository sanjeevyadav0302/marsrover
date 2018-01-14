package com.herecoding.marsrover;

import com.herecoding.marsrover.command.Command;
import com.herecoding.marsrover.direction.Direction;
import com.herecoding.marsrover.rover.Rover;

public abstract class BaseTest {

    protected final Plateau plateau = new Plateau(5, 5);
    protected int xCoordinate = 2;
    protected int yCoordinate = 2;
    protected Direction direction;
    protected Rover rover;
    protected Command command;
}
