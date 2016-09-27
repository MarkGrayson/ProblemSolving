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
		while(count < 10)
		{
		display.displayMessage("Then Suddenly Words!");
		
		String answer = display.collectResponse("Are you tired?!");
		
		count++;
		}
	}
}
