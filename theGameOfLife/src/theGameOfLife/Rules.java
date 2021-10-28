package theGameOfLife;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;

import javax.swing.*;
import java.awt.event.*;

public class Rules {	
	
	JLabel label;
	JFrame frame;
	JPanel panel;
	boolean toggle = false;
	JComboBox combo,N1,N2,N3,N4,N5;
	
	String Neighbors;

	
	public Rules() {
		
		
		frame = new JFrame("The Game Of Life");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		
		
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
		
		
		N1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N1.getSelectedItem(); 

				label.setText(name); 
				
				
			}
			
		});
		
		N2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N2.getSelectedItem(); 

				label.setText(name); 
				
				
			}
			
		});
		
		
		N3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N3.getSelectedItem(); 

				label.setText(name); 
				
				
			}
			
		});
		
		
		
		N4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N4.getSelectedItem(); 

				label.setText(name); 
				
				
			}
			
		});
		
		
		N5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)N5.getSelectedItem(); 

				label.setText(name); 
				
				
			}
			
		});
		
		panel.add(N1);
		panel.add(N2);
		panel.add(N3);
		panel.add(N4);
		panel.add(N5);
		
		
		
		frame.setContentPane(panel);
		frame.setVisible(true);
	

}
}