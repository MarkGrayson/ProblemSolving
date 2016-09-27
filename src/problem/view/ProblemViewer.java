package problem.view;

import javax.swing.JOptionPane;

/**
 * Popup display class with three methods for GUI.
 * @author Grayson Palesh
 *@version September 27, 2016
 */

public class ProblemViewer 
{
	/**
	 * Creates a popup to show the user String.
	 * @param message The String to show the user.
	 */
	public void splayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	/**
	 * Creates a popup to ask a question to the user. Stores the response
	 * as a String.
	 * @param question The question supplied to the user.
	 * @return The users response as a String.
	 */
	
	public String collectResponse(String question)
	{
		String response = "";
		
		response = JOptionPane.showInputDialog(null, question);
		
		return response;
	}
	
	/**
	 * Creates a popup to prompt user to choose yes/no/cancel to the supplies
	 * question.
	 * @param question The question being asked.
	 * @return The JOptionPane constant value for yes/no/cancel.
	 */
	
	public int collectOption(String question)
	{
		int optionNumber = 0;
		
		optionNumber = JOptionPane.showConfirmDialog(null, question);
		
		return optionNumber;
	}
}
