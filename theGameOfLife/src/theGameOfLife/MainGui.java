package theGameOfLife;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


import javax.swing.*;

public class MainGui {

	private JFrame frame;
	private JLabel label;
	private JPanel panel;
	private JButton[] button;
	
	public MainGui() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(1000,1000);
		frame.setLocationRelativeTo(null);
		
		label = new JLabel("Hi");
		button = new JButton[100];
		
		panel = new JPanel();
		panel.add(label);
		
		frame.setContentPane(panel);
		frame.setVisible(true);
	
		
	}
}


