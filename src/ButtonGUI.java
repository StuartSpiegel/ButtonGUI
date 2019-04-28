import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class ButtonGUI extends JFrame{

	private JPanel buttonPanel;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	
	public ButtonGUI(){
		//initial frame properties
		super("Build Me!");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		//creation of MainPanel
		 JPanel mainPanel = new JPanel();
	     this.add(mainPanel);
	   	     
	     //Initialization of fields
	     one = new JButton("one");
	     two = new JButton("two"); 
	     three = new JButton("three");
	     four = new JButton("four");
	     five = new JButton("five");
	     
	     //adding components to panel
	     mainPanel.add(getLeftButtons());
	     mainPanel.add(Box.createHorizontalGlue());
	     mainPanel.add(getRightButtons());
	     mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
	    
	     
	     this.pack();
	  
	     
	}
	 private JPanel getRightButtons() {
		 JPanel RightPanel = new JPanel();
    	 RightPanel.setLayout(new BoxLayout(RightPanel, BoxLayout.Y_AXIS));
    	 RightPanel.add(Box.createVerticalGlue());
    	 RightPanel.add(three);
    	 RightPanel.add(Box.createRigidArea(new Dimension(0, 20)));
    	 RightPanel.add(four);
    	 RightPanel.add(Box.createRigidArea(new Dimension(0, 20)));
    	 RightPanel.add(five);
    	 RightPanel.add(Box.createVerticalGlue());
    	 
    	 
    	 return RightPanel;
		 
		 
		
	}
	private JPanel getLeftButtons() {
		 JPanel leftPanel = new JPanel();
    	 leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
    	 leftPanel.add(one);
    	 leftPanel.add(Box.createVerticalGlue());
    	 leftPanel.add(two);
    	 return leftPanel;
    	 
    	 
	}
	public static void main(String[] args) {
	        ButtonGUI bGUI = new ButtonGUI();
	        bGUI.setVisible(true);
	    }
	
	
	
	
	
	
}
