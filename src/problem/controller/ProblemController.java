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
		
			count++;
		}
	}
}
