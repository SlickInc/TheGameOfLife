package theGameOfLife;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;

import javax.swing.*;
import java.awt.event.*;

public class MainGui {
	//This will house the main frame, the grid, the Start, Stop, etc buttons, the ComboBox for pre-made patterns

	private JFrame frame;
	private JLabel label;
	private JPanel panel;
	private JButton[] button;
	private JComboBox patterns;
	
	public MainGui() {
		frame = new JFrame("The Game Of Life");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(1000,1000);
		frame.setLocationRelativeTo(null);
		

		int x = 0;
		int y = 3;
		
		GridBagConstraints c = new GridBagConstraints();
		

		panel = new JPanel(new GridBagLayout());


		
		button = new JButton[5000];
		label = new JLabel("Hi");

		
		label = new JLabel();

		
/**
 * Sets up premade patterns
 */
		String[] pat = {"Single Cell", "Glider", "Methuselah", "Pentadecathlon","B-Heptomino", "Boat Stretcher", "Switch Engine", "Glider Gun"};
		patterns = new JComboBox(pat);
		patterns.setSelectedIndex(0);
		for(int i = 0; i<pat.length; i++) {
			patterns.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					
					
				}
				
			});
			
		}
		
		


	

		
		
		JButton STOP = new JButton("Stop");
		JButton START = new JButton("Start");
		JButton CLEAR = new JButton("Clear");
		JButton RANDOMIZE = new JButton("Randomize");

		
		
		
		START.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
			
			
		});
		
		STOP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
			
			
		});
		
		CLEAR.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
			
			
		});
		
		RANDOMIZE.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
			
			
		});
	
	/**
	 * boolean array	
	 */
		
		boolean booarray[];
		booarray = new boolean[5000];
		
/**
 * Lays button array out		
 */
		for (int i = 0; i<5000; i++) {
			button[i] = new JButton("");
			
			button[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
				
					
				}
			});
			c.ipadx	= -20;
			c.ipady = -5;
			c.gridx = x;
			c.gridy= y;
			panel.add(button[i],c);
			x++;
			if(x == 50) {
				x= 0;
				y++;		
			}
		}
	
		
		
		
		
	

		
		
		c.ipadx = 6;
		c.ipady = 6;		
		c.gridx = 1;
		c.gridy =1;
		panel.add(RANDOMIZE,c);
		c.gridx=2;
		c.gridy=1;
		panel.add(CLEAR,c);
		c.gridx=3;
		c.gridy=1;
		panel.add(START,c);
		c.gridx=4;
		c.gridy=1;
		panel.add(STOP,c);
		
		c.gridx=5;
		c.gridy=1;
		panel.add(patterns,c);
		

		
		panel.add(label,c);
		frame.setContentPane(panel);
		frame.setVisible(true);
	
		
	}
}

