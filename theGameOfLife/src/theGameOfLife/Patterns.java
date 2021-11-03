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

	public boolean[] boatstretcher(boolean grid[]) {
		try {
			grid[x] = true;
			grid [x-11]=true;
			grid [x-10]=true;
			grid [x-8]=true;
			grid [x+1]=true;
			grid [x+2]=true;
			grid [x+39]=true;
			grid [x+43]=true;
			grid [x+50]=true;
			grid [x+89]=true;
			grid [x+94]=true;
			grid [x+102]=true;
			grid [x+110]=true;
			grid [x+111]=true;
			grid [x+141]=true;
			grid [x+142]=true;
			grid [x+150]=true;
			grid [x+152]=true;
			grid [x+157]=true;
			grid [x+158]=true;
			grid [x+160]=true;
			grid [x+193]=true;
			grid [x+195]=true;
			grid [x+200]=true;
			grid [x+201]=true;
			grid [x+202]=true;
			grid [x+204]=true;
			grid [x+207]=true;
			grid [x+208]=true;
			grid [x+249]=true;
			grid [x+253]=true;
			grid [x+254]=true;
			grid [x+257]=true;
			grid [x+258]=true;
			grid [x+299]=true;
			grid [x+300]=true;
			grid [x+298]=true;
			grid [x+296]=true;
			grid [x+295]=true;
			grid [x+301]=true;
			grid [x+303]=true;
			grid [x+304]=true;
			grid [x+350]=true;
			grid [x+351]=true;
			grid [x+352]=true;
			grid [x+349]=true;
			grid [x+348]=true;
			grid [x+347]=true;
			grid [x+346]=true;
			grid [x+551]=true;
			grid [x+600]=true;
			grid [x+602]=true;
			grid [x+651]=true;
		}catch(Exception e){
			
		}
		return grid;
	}
	public boolean[] swtichengine(boolean grid[]) {
		try {
			grid[x] = true;
			grid[x-2] = true;
			grid[x+47] = true;
			grid[x+98] = true;
			grid[x+101] = true;
			grid[x+150] = true;
			grid[x+151] = true;
			grid[x+152] = true;
			grid[x+273] = true;
			grid[x+274] = true;
			grid[x+323] = true;
		}catch(Exception e){
			
		}
		return grid;
	}
	/**
	 * this does not work
	 * @param grid
	 * @return
	 */
	public boolean[] glidergun(boolean grid[]) {
		try {
			grid[x] = true;
			grid[x+50] = true;
			grid[x+49] = true;
			grid[x+48] = true;
			grid[x+47] = true;
			grid[x+55] = true;
			grid[x+89] = true;
			grid[x+99] = true;
			grid[x+98] = true;
			grid[x+97] = true;
			grid[x+96] = true;
			
			grid[x+241] = true;
			grid[x+140] = true;
			grid[x+105] = true;
			grid[x+149] = true;
			grid[x+146] = true;
			grid[x+138] = true;
			grid[x+191] = true;
			grid[x+241] = true;
			grid[x+291] = true;
			
			grid[x+159] = true;
			grid[x+199] = true;
			grid[x+198] = true;
			grid[x+197] = true;
			grid[x+196] = true;
			grid[x+191] = true;
			grid[x+160] = true;
			grid[x+210] = true;
		
			grid[x+208] = true;
			grid[x+192] = true;
			grid[x+242] = true;
			grid[x+292] = true;
			grid[x+187] = true;
			grid[x+177] = true;
			grid[x+176] = true;
			grid[x+250] = true;
			grid[x+249] = true;
			grid[x+248] = true;
			grid[x+247] = true;
			
			
			grid[x+237] = true;
			grid[x+227] = true;
			grid[x+226] = true;
			grid[x+300] = true;
		
			grid[x+291] = true;
			
			grid[x+287] = true;
			
			grid[x+340] = true;
			grid[x+338] = true;
			grid[x+389] = true;
		}catch(Exception e){
			
		}
		return grid;
	}


}
