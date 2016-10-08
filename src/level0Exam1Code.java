import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class level0Exam1Code {

	public static void main(String[] args) {
		Robot bender = new Robot();
		bender.setSpeed(10);
		String userInput;
		// 3. ask the user what color they would like the Robot to draw
		userInput = JOptionPane.showInputDialog(null, "what color would you like the bender to draw in");
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if (userInput.equalsIgnoreCase("black")) {
			bender.setPenColor(0, 255, 0);
		}
		else if (userInput.equalsIgnoreCase("blue")) {
			bender.setPenColor(0, 0, 255);
		}
		else {
			JOptionPane.showMessageDialog(null, "sorry that color is not allowed, but here is black");
			
		}
		// 2. set the pen width to 10
		bender.setPenWidth(10);
		// 1. make the Robot draw a shape
		
		bender.penDown();
		for (int i = 0; i < 4; i++) {
			bender.move(250);
			bender.turn(90);
		}

	}

}
