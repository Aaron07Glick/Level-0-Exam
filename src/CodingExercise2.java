/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		String userInput;
		int birthdate;
		int x = 2016;
		userInput = JOptionPane.showInputDialog("How old are you");
		int userInputNum = Integer.parseInt(userInput);
		if (userInputNum<=30) {
			birthdate= x -=userInputNum;
			JOptionPane.showMessageDialog(null,"you were born in "+ birthdate);
		}
		else if (userInputNum>30) {
			JOptionPane.showMessageDialog(null, "you are too old to play this game");
		}
		else {
			JOptionPane.showMessageDialog(null, "??????");
		}
	}
}

