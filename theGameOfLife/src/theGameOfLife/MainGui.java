package theGameOfLife;
import javax.swing.*;
import java.awt.*;
public class MainGui {
	//This will house the main frame, the grid, the Start, Stop, etc buttons, the ComboBox for pre-made patterns

	private JFrame frame;
	private JLabel label;
	private JPanel panel;
	private JButton[] button;
	private JComboBox patterns;
	
	public MainGui() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(1000,1000);
		frame.setLocationRelativeTo(null);
		
		panel = new JPanel();
		
		label = new JLabel("Hi");
		
		button = new JButton[100];
		
		String[] pat = {"Single Cell", "Glider", "Methuselah", "Pentadecathlon","B-Heptomino", "Boat Stretcher", "Switch Engine", "Glider Gun"};
		patterns = new JComboBox(pat);
		
		
		
		
		
		
		
		
		
		
		
		panel.add(label);
		frame.setContentPane(panel);
		frame.setVisible(true);
	
		
	}
}
