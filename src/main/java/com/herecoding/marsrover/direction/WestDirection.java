package com.herecoding.marsrover.direction;

import com.herecoding.marsrover.rover.Rover;
/**
 * Created by Sanjeev.Yadav on 1/14/2018..
 */
public class WestDirection implements Direction {

    @Override
    public Direction spinRight() {
        return new NorthDirection();
    }

    @Override
    public Direction spinLeft() {
        return new SouthDirection();
    }

    @Override
    public void moveForward(Rover rover) {
        rover.setCoordinateX(rover.getCoordinateX() - 1);
    }

    @Override
    public void moveBack(Rover rover) {
        rover.setCoordinateX(rover.getCoordinateX() + 1);
    }
}
