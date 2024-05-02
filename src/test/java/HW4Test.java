import edu.lab.hw4.Robot;
import edu.lab.hw4.commands.MoveBackward;
import edu.lab.hw4.commands.MoveForward;
import edu.lab.hw4.commands.TurnLeft;
import edu.lab.hw4.commands.TurnRight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HW4Test {
    @Test
    public void okTest() {
        Robot robot = new Robot();
        robot.nextCommand(new MoveForward(10)).nextCommand(new MoveBackward(10))
                .nextCommand(new TurnLeft(100)).nextCommand(new TurnRight(100));
        String expectingResult = """
                move forward, steps: 10
                move backward, steps: 10
                turn left, angle: 100.0
                turn right, angle: 100.0
                done""";

        String result = robot.executeCommandsList();

        assertEquals(expectingResult, result);
    }

    @Test
    public void emptyTest() {
        Robot robot = new Robot();
        String expectingResult = "done";

        String result = robot.executeCommandsList();

        assertEquals(expectingResult, result);
    }

    @Test
    public void clearTest() {
        Robot robot = new Robot();
        robot.nextCommand(new TurnRight(100)).nextCommand(new MoveBackward(10));
        robot.clearCommands();
        String expectingResult = "done";

        String result = robot.executeCommandsList();

        assertEquals(expectingResult, result);
    }
}
