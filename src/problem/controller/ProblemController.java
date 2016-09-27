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
		display.displayMessage("look words on the monitor!!!!");
		
	}
}
