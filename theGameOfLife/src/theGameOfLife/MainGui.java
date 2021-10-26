package theGameOfLife;
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
		
		label = new JLabel("Hi");
		button = new JButton[100];
		
		panel = new JPanel();
		panel.add(label);
		
		frame.setContentPane(panel);
		frame.setVisible(true);
	
		
	}
}

