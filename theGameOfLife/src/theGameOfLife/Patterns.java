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
		try {
			grid[x] = true;
			grid[x+1] = true;
			grid[x+2] = true;
			grid[x+50] = true;
			grid[x+101] = true;
		}catch(Exception e){
			
		}
		return grid;
	}
	public boolean[] methuselah(boolean grid[]) {
		try {
			grid[x] = true;
			grid[x+1] = true;
			grid[x-1] = true;
			grid[x+50] = true;
			grid[x-49] = true;
		}catch(Exception e){
			
		}
		return grid;
	}

}
