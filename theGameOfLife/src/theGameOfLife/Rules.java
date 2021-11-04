package theGameOfLife;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Rules {	
	// constructor
	JLabel label,T0,T1,T2,T3,T4,T5,T6,T7,T8;
	JFrame frame;
	JPanel panel;
	boolean toggle = false;
	JComboBox combo,N0,N1,N2,N3,N4,N5,N6,N7,N8;
	
	String Neighbors;	
	String[] n = new String[9];


	
	public Rules() {
		
		// frame
		frame = new JFrame("The Game Of Life");
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		
		// added a grid bag layout to the panel 
		panel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		// array for combo boxes for the rules 
		String[] names = {"Live", "Die", "Born"};
		
		N0 = new JComboBox(names);
		N0.setSelectedIndex(1);
		n[0] = names[1];
		
		N1 = new JComboBox(names);
		N1.setSelectedIndex(1);
		n[1] = names[1];
		
		N2 = new JComboBox(names);
		N2.setSelectedIndex(0);
		n[2] = names[0];
		
		N3 = new JComboBox(names);
		N3.setSelectedIndex(2);
		n[3] = names[2];
		
		N4 = new JComboBox(names);
		N4.setSelectedIndex(1);
		n[4] = names[1];
		
		N5 = new JComboBox(names);
		N5.setSelectedIndex(1);
		n[5] = names[1];
		
		N6 = new JComboBox(names);
		N6.setSelectedIndex(1);
		n[6] = names[1];
		
		N7 = new JComboBox(names);
		N7.setSelectedIndex(1);
		n[7] = names[1];
		
		N8 = new JComboBox(names);
		N8.setSelectedIndex(1);
		n[8] = names[1];
		
		// adding some names for the rules options (0-8 Neighbors)
		T0 = new JLabel(" Zero Neighbors: ");

		T1 = new JLabel(" One Neighbors: ");
		
		T2 = new JLabel(" Two Neighbors: ");
		
		T3 = new JLabel("    Three Neighbors: ");
		
		T4 = new JLabel("   Four Neighbors: ");
		
		T5 = new JLabel("  Five Neighbors: ");
		
		T6 = new JLabel("Six Neighbors: ");
		
		T7 = new JLabel("    Seven Neighbors: ");
		
		T8 = new JLabel("   Eight Neighbors: ");
		
		// organizing options in the rules frame 
		c.gridx = 1;
		c.gridy = 0;
		panel.add(N0,c);
		
		c.gridx = 1;
		c.gridy = 1;
		panel.add(N1,c);
		
		c.gridx = 1;
		c.gridy = 2;
		panel.add(N2,c);
		
		c.gridx = 1;
		c.gridy = 3;
		panel.add(N3,c);
		
		c.gridx = 1;
		c.gridy = 4;
		panel.add(N4,c);
		
		c.gridx = 1;
		c.gridy = 5;
		panel.add(N5,c);
		
		c.gridx = 1;
		c.gridy = 6;
		panel.add(N6,c);
		
		c.gridx = 1;
		c.gridy = 7;
		panel.add(N7,c);
		
		c.gridx = 1;
		c.gridy = 8;
		panel.add(N8,c);
		
		
		
		
		c.gridx = 2;
		c.gridy = 0;
		panel.add(T0,c);
		
		c.gridx = 2;
		c.gridy = 1;
		panel.add(T1,c);
		
		c.gridx = 2;
		c.gridy = 2;
		panel.add(T2,c);
		
		c.gridx = 2;
		c.gridy = 3;
		panel.add(T3,c);
		
		c.gridx = 2;
		c.gridy = 4;
		panel.add(T4,c);
		
		c.gridx = 2;
		c.gridy = 5;
		panel.add(T5,c);
		
		c.gridx = 2;
		c.gridy = 6;
		panel.add(T6,c);
		
		c.gridx = 2;
		c.gridy = 7;
		panel.add(T7,c);
		
		c.gridx = 2;
		c.gridy = 8;
		panel.add(T8,c);
		
		
		frame.setContentPane(panel);
		
	

	}
	public void showrules() {
		frame.setVisible(true);
	}
	/**
	 * Makes sure the rules are saved and applied
	 */
	public void saveRules() {
		N0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N0.getSelectedItem(); 
				n[0] = name;
				
			}
			
		});
		N1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N1.getSelectedItem(); 
				n[1] = name;	
				
			}
			
		});
		N2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N2.getSelectedItem(); 
				n[2] = name;
				
			}
			
		});
		N3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N3.getSelectedItem(); 
				n[3] = name;
				
			}
			
		});
		N4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N4.getSelectedItem(); 
				n[4] = name;
				
			}
			
		});
		N5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N5.getSelectedItem(); 
				n[5] = name;
				
			}
			
		});
		N6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N6.getSelectedItem(); 
				n[6] = name;
				
			}
			
		});
		N7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N7.getSelectedItem(); 
				n[7] = name;
				
			}
			
		});
		N8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N8.getSelectedItem(); 
				n[8] = name;
				
			}
			
		});
	}
	/**
	 * Determines which cells die and which ones live
	 * @param grid
	 * @param count
	 * @return grid
	 */
	public boolean[] gameRun(boolean[] grid, int[] count) {
		for(int i = 0; i<5000;i++) {
			for(int e = 0;e<=8;e++) {
				if(count[i] == e){
					if(n[e] == "Die") {
						grid[i] = false;
					}else if(n[e] == "Born") {
						grid[i] = true;
					}
				}
			}
		}
		return grid;
	}
	/**
	 * checks amount of neighbors
	 * @param grid
	 * @param element
	 * @return
	 */
	public int[] checkNeighbors(boolean[] grid) {
		int[] n= new int[5000];
		for(int i = 0;i<5000;i++) {
			n[i]= 0;
		}
		for(int i = 0;i<5000;i++) {
			try {
				if(grid[i+1] == true ) {
					n[i]++;
				}
			}catch(Exception e) {
				
			}
			try {
				if(grid[i-1] == true ) {
					n[i]++;
				}
			}catch(Exception e) {
				
			}
			try {
				if(grid[i+50] == true ) {
					n[i]++;
				}
			}catch(Exception e) {
				
			}
			try {
				if(grid[i-50] == true ) {
					n[i]++;
				}
			}catch(Exception e) {
				
			}
			try {
				if(grid[i+51] == true ) {
					n[i]++;
				}
			}catch(Exception e) {
					
			}
			try {
				if(grid[i+49] == true ) {
					n[i]++;
				}
			}catch(Exception e) {
				
			}
			try {
				if(grid[i-51] == true ) {
					n[i]++;
				}
			}catch(Exception e) {
				
			}
			try {
				if(grid[i-49] == true ) {
					n[i]++;
				}
			}catch(Exception e) {
				
			}
		}
		
		return n;
	}
	
}