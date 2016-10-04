package problem.controller;

import problem.view.ProblemViewer;
import problem.model.Thingy;
import java.util.List;
import java.util.ArrayList;

public class ProblemController 
{
	private ProblemViewer display;
	private List<Thingy> thingyList;
	
	public ProblemController()
	{
		display = new ProblemViewer();
		thingyList = new ArrayList<Thingy>();
	}
	
	public void start()
	{
		learnList();
	
	}
	
	private void askQuestionLoop()
	{
	String answer = "sample";
		
		while(answer != null && !isDouble(answer))
		{
			answer = display.collectResponse("You need to type in a double");
		}
	}
	
	
	
		/**
		 * Checks a supplied String value to see if it can be converted to a double.
		 * @param potentialValue The supplied String.
		 * @return Whether the conversion to a double is possible as a boolean value.	
		 */
		
		private boolean isDouble(String potentialValue)
		{
			boolean validDouble = false;
					
			try
			{
				double testValue = Double.parseDouble(potentialValue);
				validDouble = true;
			}
			catch(NumberFormatException notDoubleError)
			{
				display.displayMessage("That was not a double =:<");
			}
		
		
		return validDouble;
		}
		
		/**
		 * Checks the supplied String value to see if it can be converted to an integer.
		 * if it cannot a popup message is displayed.
		 * @param potentialValue The supplied String.
		 * @return Whether a conversion an integer is possible
		 */
		private boolean isInteger(String potentialValue)
		{
			boolean validInteger = false;
			
			try
			{
				int testValue = Integer.parseInt(potentialValue);
				validInteger = true;
			}
			catch(NumberFormatException notIntegerError)
			{
				display.displayMessage(notIntegerError.getMessage());
				display.displayMessage("You need to type in an int");
			}
			
			return validInteger;
		}
		
		private void learnList()
		{
			display.displayMessage("This is the size of the list " + thingyList.size());
			Thingy firstThingy = new Thingy();
			thingyList.add(firstThingy);
			display.displayMessage("This is the size of the list " + thingyList.size());
			
			for (int index 0; index < 5 index++)
			{
				Thingy loopThingy = new Thingy();
				thingyList.add(loopThingy);
			}
			
			for (int index = 0; index < thingyList.size(); index++)
			{
				display.displayMessage("The thingy at this spot has words of: " + thingyList.get(index).getWords());
			}
		}
		
		
	}
