package theGameOfLife;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;

import javax.swing.*;
import java.awt.event.*;

public class Rules {	
	
	JLabel label,T1,T2,T3,T4,T5,T6,T7,T8;
	JFrame frame;
	JPanel panel;
	boolean toggle = false;
	JComboBox combo,N1,N2,N3,N4,N5,N6,N7,N8;
	
	String Neighbors;

	
	public Rules() {
		
		
		frame = new JFrame("The Game Of Life");
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		
		panel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		String[] names = {"Live", "Die", "Born"};
		// hay
		N1 = new JComboBox(names);
		N1.setSelectedIndex(0);
		
		N2 = new JComboBox(names);
		N2.setSelectedIndex(0);
		
		N3 = new JComboBox(names);
		N3.setSelectedIndex(0);
		
		N4 = new JComboBox(names);
		N4.setSelectedIndex(0);
		
		N5 = new JComboBox(names);
		N5.setSelectedIndex(0);
		
		N6 = new JComboBox(names);
		N6.setSelectedIndex(0);
		
		N7 = new JComboBox(names);
		N7.setSelectedIndex(0);
		
		N8 = new JComboBox(names);
		N8.setSelectedIndex(0);
		
		T1 = new JLabel(" One Neighbors: ");
		
		
		N1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N1.getSelectedItem(); 

				label.setText(name); 
				
				
			}
			
		});
		
		T2 = new JLabel(" Two Neighbors: ");
		
		
		N2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N2.getSelectedItem(); 

				label.setText(name); 
				
				
			}
			
		});
		
		T3 = new JLabel("    Three Neighbors: ");
		
		N3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N3.getSelectedItem(); 

				label.setText(name); 
				
				
			}
			
		});
		
		
		T4 = new JLabel("   Four Neighbors: ");
		
		N4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N4.getSelectedItem(); 

				label.setText(name); 
				
				
			}
			
		});
		
		T5 = new JLabel("  Five Neighbors: ");
		
		N5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N5.getSelectedItem(); 

				label.setText(name); 
				
				
			}
			
		});
		
		
		T6 = new JLabel("Six Neighbors: ");
		
		N6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N6.getSelectedItem(); 

				label.setText(name); 
				
				
			}
			
		});
		
		T7 = new JLabel("    Seven Neighbors: ");
		
		N7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N7.getSelectedItem(); 

				label.setText(name); 
				
				
			}
			
		});
		
		
		T8 = new JLabel("   Eight Neighbors: ");
		
		N8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N8.getSelectedItem(); 

				label.setText(name); 
				
				
			}
			
		});
		
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
		frame.setVisible(true);
	

}
}