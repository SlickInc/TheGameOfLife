package theGameOfLife;

import javax.swing.JButton;

public class Patterns {
	private int x;
	public Patterns(int button) {
		x = button;
	}
	public boolean[] singleCell(boolean grid[]) {
		grid[x] = true;
		return grid;
	}
	public boolean[] glider(boolean grid[]) {
		int tempx = x;
		if((tempx+1) == 0){
			
		}
		grid[x] = true;
		grid[x+1] = true;
		grid[x+2] = true;
		grid[x+50] = true;
		grid[x+101] = true;
		return grid;
	}

}
