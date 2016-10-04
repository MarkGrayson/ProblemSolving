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
			
			for (int index = 0; index < 5; index++)
			{
				Thingy loopThingy = new Thingy();
				thingyList.add(loopThingy);
			}
			
			for (int index = 0; index < thingyList.size(); index++)
			{
				display.displayMessage("The thingy at this spot has words of: " + thingyList.get(index).getWords());
			}
			
			Thingy specialThingy = new Thingy();
			specialThingy.setWords("not null stuff");
			
			thingyList.add(1, specialThingy);
			
			for (int index = 0; index < thingyList.size(); index++)
			{
				display.displayMessage("The message at " + index + " is " + thingyList.get(index).getWords());
			}
			
			thingyList.get(3).setWords("I just changed what is inside");
			Thingy tempThing = thingyList.get(4);
			tempThing.setWords("also changed");
			
			for (int index = 0; index < thingyList.size(); index++)
			{
				display.displayMessage(thingyList.get(index).getWords());
			}
			
			Thingy replacement = new Thingy();
			replacement.setWords("I am a replicant");
			
			Thingy old = thingyList.set(0, replacement);
			
			thingyList.set(0, replacement);
			
			for (int index = 0; index < thingyList.size(); index++)
			{
				display.displayMessage(thingyList.get(index).getWords());
			}
			old.setWords("I  replaced :(");
			display.displayMessage(old.getWords());
			
			thingyList.remove(4);
			display.displayMessage("The size is now " + thingyList.size());
			old = thingyList.remove(4);
			display.displayMessage("The size is now " + thingyList.size());
			display.displayMessage("This is what I removed: " + old.getWords());
			thingyList.add(0, old);
			
			
			for (Thingy currentThingy : thingyList)
			{
				display.displayMessage("The current value is " + currentThingy.getWords());
			}
			
			for (Thingy currentThingy : thingyList)
			{
				currentThingy.setWords(currentThingy.getWords() + " number");
			}
			
			for (Thingy currentThingy : thingyList)
			{
				display.displayMessage("The current value is " + currentThingy.getWords());
			}
			
			for (Thingy currentThingy : thingyList)
			{
				currentThingy = new Thingy();
			}
			
			for (Thingy currentThingy : thingyList)
			{
				thingyList.remove(0);
			}
		}
		
		
		
	}
