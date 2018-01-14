package com.herecoding.marsrover.direction;

import com.herecoding.marsrover.rover.Rover;
/**
 * Created by Sanjeev.Yadav on 1/14/2018..
 */
public interface Direction {

    public abstract Direction spinRight();

    public abstract Direction spinLeft();

    public abstract void moveForward(Rover rover);

    public abstract void moveBack(Rover rover);
}
