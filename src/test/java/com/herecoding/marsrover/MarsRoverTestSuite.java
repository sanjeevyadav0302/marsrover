package com.herecoding.marsrover;

import com.herecoding.marsrover.command.SpinRightCommandTest;
import com.herecoding.marsrover.direction.EastDirectionTest;
import com.herecoding.marsrover.direction.SouthDirectionTest;
import com.herecoding.marsrover.command.MoveBackCommandTest;
import com.herecoding.marsrover.command.MoveForwardCommandTest;
import com.herecoding.marsrover.command.SpinLeftCommandTest;
import com.herecoding.marsrover.direction.NorthDirectionTest;
import com.herecoding.marsrover.direction.WestDirectionTest;
import com.herecoding.marsrover.rover.RoverExceptionTest;
import com.herecoding.marsrover.rover.RoverTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MoveBackCommandTest.class,
        MoveForwardCommandTest.class,
        SpinLeftCommandTest.class,
        SpinRightCommandTest.class,
        EastDirectionTest.class,
        NorthDirectionTest.class,
        SouthDirectionTest.class,
        WestDirectionTest.class,
        RoverTest.class,
        RoverExceptionTest.class,
        InputUtilTest.class,
        PlateauTest.class
})
public class MarsRoverTestSuite extends BaseTest {

}
