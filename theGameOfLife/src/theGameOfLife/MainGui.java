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

public class MainGui {
	//This will house the main frame, the grid, the Start, Stop, etc buttons, the ComboBox for pre-made patterns
	
	JFrame frame;
	JLabel label;
	JPanel panel;
	JButton button;
	
	public MainGui() {
		
		frame = new JFrame("Photo Album");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1200, 700);
		frame.setLocationRelativeTo(null);
		
		panel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		panel.setBackground(Color.BLACK);
		
		label = new JLabel();
		label.setForeground(Color.RED);
		
		
		
		
		
		
		
		
		
		
		
		
		frame.setContentPane(panel);

		frame.setVisible(true);
	}
	
}
