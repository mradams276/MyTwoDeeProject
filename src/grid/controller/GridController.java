package grid.controller;

import javax.swing.JOptionPane;
import grid.model.Phones;
import grid.view.GridFrame;

public class GridController 
{

private GridFrame appFrame;
private Phones [][] grid;

public GridController()
{
grid = new Phones[6][5];
fillGrid();
appFrame = new GridFrame(this);
}

private void fillGrid()
{
	for (int row = 0; row < grid.length; row++)
			{
		for (int col = 0; col < grid[0].length; col++)
		{
			grid[row][col] = new Phones();
		}
			}
}

	public void start()
	{
		JOptionPane.showMessageDialog(appFrame,  "HI YOU LITTLE");
	}
	
	public Phones[][] getGrid()
	{
		return grid;
	}
	
	public GridFrame getFrame()
	{
		return appFrame;
	}
}
