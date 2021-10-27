package theGameOfLife;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;

import javax.swing.*;
public class MainGui {
	//This will house the main frame, the grid, the Start, Stop, etc buttons, the ComboBox for pre-made patterns

	private JFrame frame;
	private JLabel label;
	private JPanel panel;
	private JButton[] button;
	
	public MainGui() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(1000,1000);
		frame.setLocationRelativeTo(null);
		
		int x = 0;
		int y = 0;
		
		GridBagConstraints c = new GridBagConstraints();
		
		
		label = new JLabel("Hi");
		button = new JButton[100];
		
		
		for (int i = 0; i<100; i++) {
			button[i] = new JButton("");
			
			button[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
				
					
				}
			});
				
			c.gridx = x;
			c.gridy= y;
			panel.add(button[i],c);
			x++;
			if(x == 100) {
				x= 0;
				y++;		
			}
		}
	
		
		
		
		panel = new JPanel();
		panel.add(label);
		
		frame.setContentPane(panel);
		frame.setVisible(true);
	
		
	}
}

