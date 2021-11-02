package theGameOfLife;


import java.awt.*;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import java.util.Random;

import javax.swing.*;
import java.awt.event.*;


public class MainGui {
	//This will house the main frame, the grid, the Start, Stop, etc buttons, the ComboBox for pre-made patterns
	
	Rules rules = new Rules();
	private JFrame frame;
	private JLabel label;
	private JPanel bottom;
	private JPanel top;
	private JPanel panel;
	private JButton[] button;
	private JComboBox patterns;
	private int randomm;
	
	public MainGui() {
		frame = new JFrame("The Game Of Life");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(1280,720);
		frame.setLocationRelativeTo(null);
		
		Random r = new Random();
		Random r2 = new Random();

		
		randomm = 0;
		int x = 0;
		int y = 0;
		
		GridBagConstraints c = new GridBagConstraints();
		

		panel = new JPanel(new GridBagLayout());
		top = new JPanel(new GridBagLayout());
		bottom = new JPanel(new GridBagLayout());

		
		button = new JButton[5000];
		label = new JLabel("");

		
	
		

	

		
/**
 * Control Buttons		
 */
		JButton STOP = new JButton("Stop");
		JButton START = new JButton("Start");
		JButton CLEAR = new JButton("Clear");
		JButton RANDOMIZE = new JButton("Randomize");
		JButton RULES = new JButton("Rules");
		
		
		/**
		 * boolean array	
		 */
				
		boolean booarray[];
		booarray = new boolean[5000];

		START.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				boolean stop = false;
				do {
					go(booarray);
				}while(stop == false);
			}
			
			
		});
		
		STOP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
			
			
		});
		
		/**
		 * turns all buttons white
		 */
		CLEAR.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				for (int i = 0; i<5000; i++) {
					button[i].setBackground(Color.WHITE);
					booarray[i] = false;
				}
			}
			
			
		});
	
		/**
		 * randomizes buttons
		 */
		RANDOMIZE.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				for (int ran = 0; ran < r.nextInt(5000-1+1)+1; ran++ ) {
					randomm = r.nextInt(4999-1+1)+1;
					button[randomm].setBackground(Color.RED);
					booarray[randomm] = true;
				}

				
			}
			
			
		});
		
		
		RULES.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				rules.showrules();
				rules.saveRules();
			}
			
			
		});
		
/**
 * Sets up premade patterns
 */
		String[] pat = {"Single Cell", "Glider", "Methuselah", "Pentadecathlon","B-Heptomino", "Boat Stretcher", "Switch Engine", "Glider Gun"};
		patterns = new JComboBox(pat);
		patterns.setSelectedIndex(0);
		/*
		for(int i = 0; i<pat.length; i++) {
			patterns.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					
					
				}
				
			});
			
		}
		*/
	

		
/**
 * Lays button array out and puts it at the bottom of array		
 * Runs the patterns class
 */

		

		for (int i = 0; i<button.length; i++) {

			button[i] = new JButton("");
			button[i].setActionCommand(Integer.toString(i));
			button[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					int num = Integer.parseInt(e.getActionCommand());
					Patterns p = new Patterns(num);
					switch ((String)patterns.getSelectedItem()) { 
					case "Single Cell": p.singleCell(booarray);break;
					case "Glider": p.glider(booarray);break;
					case "Methuselah": p.methuselah(booarray);break;
					case "Pentadecathlon": p.pentadecathlon(booarray);break;
					case "B-Heptomino": p.bheptomino(booarray);break;
					case "Boat Stretcher":p.boatstretcher(booarray);break;
					case "Switch Engine" :p.swtichengine(booarray);break;
					case "Glider run" :p.gliderrun(booarray);break;
					}

					for(int i = 0; i<button.length;i++) {
						if (booarray[i] == true){
							button[i].setBackground(Color.RED);
						}
					}
					
				}
			});
			c.ipadx	= -10;
			c.ipady = -5;
			c.gridx = x;
			c.gridy= y;
			bottom.add(button[i],c);
			x++;
			if(x == 50) {
				x= 0;
				y++;		
			}
		}
	
		
		
		
		
	

		
		
	/**
	 * Puts buttons at top of the array	
	 */
		
		c.ipadx = 10;
		c.ipady=10;
		c.gridx = 1;
		c.gridy =1;
		top.add(RANDOMIZE,c);
		c.gridx=2;
		c.gridy=1;
		top.add(CLEAR,c);
		c.gridx=3;
		c.gridy=1;
		top.add(START,c);
		c.gridx=4;
		c.gridy=1;
		top.add(STOP,c);
		

		c.gridx=5;
		c.gridy=1;
		top.add(patterns,c);
		
		
		c.gridx=6;
		c.gridy=1;
		top.add(RULES,c);
		
	

		
		c.gridx = 1;
		c.gridy = 1;
		panel.add(bottom,c);
		
		
		
		
		c.gridx=1;
		c.gridy=0;
		top.add(label,c);
		panel.add(top,c);
		frame.setContentPane(panel);
		frame.setVisible(true);
	
		
	}
	public void go(boolean[] grid) {
		rules.gameRun(grid, rules.checkNeighbors(grid));
		for(int i = 0; i<button.length;i++) {
			if (grid[i] == false){
				button[i].setBackground(Color.white);
			}else {
				button[i].setBackground(Color.RED);
			}
		}
	}
	
}

