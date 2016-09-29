package problem.controller;

import problem.view.ProblemViewer;

public class ProblemController 
{
	private ProblemViewer display;
	
	public ProblemController()
	{
		display = new ProblemViewer();
	}
	
	public void start() 
	{
		int count = 0;
		String answer = "sample";
		while(answer != null && !answer.equals(""))
		{
			display.displayMessage("Then Suddenly Words!");
		
			answer = display.collectResponse("Are you tired?!");			
		}
	}
		/**
		 * Checks a supplied String value to see if it can be converted to a double.
		 * @param potentialValue The supplied String.
		 * @return Whether the conversion to a double is possible as a boolea value.	
		 */
		
		private boolean isDouble(String potentialValue)
		{
			boolean validDouble = false
					
			try
			{
				double testValue = Double.parseDouble(potentialValue);
				validDouble = true;
			}
			catch)NumberFOrmatException notDoubleError)
			{
				display.displayMessage("That was not a double =:<");
			}
		
		
		return validDouble
		
	}
}
