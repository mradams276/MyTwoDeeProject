package grid.view;
import grid.controller.GridController;
import grid.model.Phones;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GridPanel extends JPanel 
{
	private JTextField rowField;
	private JTextField columnField;
	private JTextField inputField;
	private JLabel inputLabel;
	private JLabel columnLabel;
	private JButton submitButton;
	private SpringLayout baseLayout;
	private GridController baseController;
	
	private JTable gridTable;
	private JScrollPane gridPane;
	
	public GridPanel(GridController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		columnField = new JTextField();
		inputField = new JTextField();
		inputLabel = new JLabel();
		columnLabel = new JLabel();
		submitButton = new JButton();
		baseLayout.putConstraint(SpringLayout.SOUTH, submitButton, 75, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, submitButton, -320, SpringLayout.EAST, this);
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 0, SpringLayout.WEST, this);
		
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupTable()
	{
		//loads the model
		DefaultTableModel data = new DefaultTableModel(baseController.getGrid(), new String []{"one", "two", "three", "four", "five"});
		gridTable = new JTable();
		gridTable.setModel(data);
		gridPane = new JScrollPane();
		baseLayout.putConstraint(SpringLayout.WEST, gridPane, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, gridPane, -50, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, gridPane, 50, SpringLayout.EAST, this);
		gridPane.setViewportView(gridTable);
		rowField = new JTextField();
		gridPane.setColumnHeaderView(rowField);
	}
	
	private void setupPanel()
	{
		this.add(columnField);
		this.add(inputField);
		this.add(inputLabel);
		this.add(columnLabel);
		this.add(submitButton);
		
		this.setLayout(baseLayout);
		this.add(gridPane);
		
	}

	
	private void setupLayout()
	{
		
	}
	

	private void setupListeners()
	{
		
	}
	
	public GridController getBaseController()
	{
		return baseController;
	}
	
}
