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
	public boolean[] pentadecathlon(boolean grid[]) {
		try {
			grid[x] = true;
			grid[x+1] = true;
			grid[x-1] = true;
			grid[x-2] = true;
			grid[x-48] = true;
			grid[x+52] = true;
			grid[x+3] = true;
			grid[x+4] = true;
			grid[x+47] = true;
			grid[x-53] = true;
			grid[x-4] = true;
			grid[x-5] = true;
		}catch(Exception e){
			
		}
		return grid;
	}
	public boolean[] bheptomino(boolean grid[]) {
		try {
			grid[x] = true;
			grid[x-1] = true;
			grid[x-2] = true;
			grid[x+50] = true;
			grid[x+51] = true;
			grid[x+48] = true;
			grid[x-51] = true;
		}catch(Exception e){
			
		}
		return grid;
	}

}
