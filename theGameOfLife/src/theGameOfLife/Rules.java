package theGameOfLife;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;

import javax.swing.*;
import java.awt.event.*;

public class Rules {	
	
	JLabel label,N1,N2,N3,N4,N5;
	JFrame frame;
	JPanel panel;
	boolean toggle = false;
	JComboBox combo;
	String[] names = {"Live", "Die", "Born"};
	String Neighbors;

	
	public Rules() {
		
		
		frame = new JFrame("The Game Of Life");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		
		
		N1 = new JLabel("one neighbors");
		N2 = new JLabel("two neighbors");
		N3 = new JLabel("three neighbors");
		N4 = new JLabel("four neighbors");
		N5 = new JLabel("five neighbors");
		
		combo = new JComboBox(names);
		combo.setSelectedIndex(0);
		
		
		combo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)combo.getSelectedItem(); 

				label.setText(name); 
				
				
			}
			
		});
		
		panel.add(combo);
		
		
		
		frame.setContentPane(panel);
		frame.setVisible(true);
	

}
}