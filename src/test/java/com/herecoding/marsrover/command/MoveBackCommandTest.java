

package com.herecoding.marsrover.command;

import com.herecoding.marsrover.BaseTest;
import com.herecoding.marsrover.direction.NorthDirection;
import com.herecoding.marsrover.rover.Rover;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MoveBackCommandTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
        direction = new NorthDirection();
        rover = new Rover(plateau, xCoordinate, yCoordinate, direction);
        command = new MoveBackCommand();
    }
    

    @Test
    public void whenMoveBackCommandIsExecutedRoverMovesBack() throws Exception {
        command.execute(rover);
        assertEquals(--yCoordinate, rover.getCoordinateY());
    }
}
