package grid.view;

import javax.swing.JFrame;
import grid.controller.GridController;
import grid.view.GridPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.color.*;

public class GridFrame extends JFrame 
{
	private GridController baseController;
	private GridPanel appPanel;
	
	public GridFrame(GridController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new GridPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("TooDeeArrayProjekt");
		this.setBackground(Color.BLUE);
		this.setSize(new Dimension(720, 480));
		this.setVisible(true);
	}
	
	public GridController getBaseController()
	{
		return baseController;
	}
}
