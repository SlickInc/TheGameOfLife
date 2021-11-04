package theGameOfLife;

import javax.swing.JButton;

public class Patterns {
	private int x;
	public Patterns(int button) {
		x = button;
	}
	/**
	 * single cell pattern
	 * @param grid
	 * @return
	 */
	public boolean[] singleCell(boolean booarray[]) {
		booarray[x] = true;
		return booarray;
	}
	/** 
	 * glider pattern
	 * @param grid
	 * @return
	 */
	public boolean[] glider(boolean booarray[]) {
		try {
			booarray[x] = true;
			booarray[x+1] = true;
			booarray[x+2] = true;
			booarray[x+50] = true;
			booarray[x+101] = true;
		}catch(Exception e){
			
		}
		return booarray;
	}
	/**
	 * methuselah pattern
	 * @param grid
	 * @return
	 */
	public boolean[] methuselah(boolean booarray[]) {
		try {
			booarray[x] = true;
			booarray[x+1] = true;
			booarray[x-1] = true;
			booarray[x+50] = true;
			booarray[x-49] = true;
		}catch(Exception e){
			
		}
		return booarray;
	}
	/**
	 * pentadecathlon pattern
	 * @param grid
	 * @return
	 */
	public boolean[] pentadecathlon(boolean booarray[]) {
		try {
			booarray[x] = true;
			booarray[x+1] = true;
			booarray[x-1] = true;
			booarray[x-2] = true;
			booarray[x-48] = true;
			booarray[x+52] = true;
			booarray[x+3] = true;
			booarray[x+4] = true;
			booarray[x+47] = true;
			booarray[x-53] = true;
			booarray[x-4] = true;
			booarray[x-5] = true;
		}catch(Exception e){
			
		}
		return booarray;
	}
	/**
	 * bheptomino pattern
	 * @param grid
	 * @return
	 */
	public boolean[] bheptomino(boolean booarray[]) {
		try {
			booarray[x] = true;
			booarray[x-1] = true;
			booarray[x-2] = true;
			booarray[x+50] = true;
			booarray[x+51] = true;
			booarray[x+48] = true;
			booarray[x-51] = true;
		}catch(Exception e){
			
		}
		return booarray;
	}
	/**
	 * boatstretcher pattern
	 * @param grid
	 * @return
	 */
	public boolean[] boatstretcher(boolean booarray[]) {
		try {
			booarray[x] = true;
			booarray [x-11]=true;
			booarray [x-10]=true;
			booarray [x-8]=true;
			booarray [x+1]=true;
			booarray [x+2]=true;
			booarray [x+39]=true;
			booarray [x+43]=true;
			booarray [x+50]=true;
			booarray [x+89]=true;
			booarray [x+94]=true;
			booarray [x+102]=true;
			booarray [x+110]=true;
			booarray [x+111]=true;
			booarray [x+141]=true;
			booarray [x+142]=true;
			booarray [x+150]=true;
			booarray [x+152]=true;
			booarray [x+157]=true;
			booarray [x+158]=true;
			booarray [x+160]=true;
			booarray [x+193]=true;
			booarray [x+195]=true;
			booarray [x+200]=true;
			booarray [x+201]=true;
			booarray [x+202]=true;
			booarray [x+204]=true;
			booarray [x+207]=true;
			booarray [x+208]=true;
			booarray [x+249]=true;
			booarray [x+253]=true;
			booarray [x+254]=true;
			booarray [x+257]=true;
			booarray [x+258]=true;
			booarray [x+299]=true;
			booarray [x+300]=true;
			booarray [x+298]=true;
			booarray [x+296]=true;
			booarray [x+295]=true;
			booarray [x+301]=true;
			booarray [x+303]=true;
			booarray [x+304]=true;
			booarray [x+350]=true;
			booarray [x+351]=true;
			booarray [x+352]=true;
			booarray [x+349]=true;
			booarray [x+348]=true;
			booarray [x+347]=true;
			booarray [x+346]=true;
			booarray [x+551]=true;
			booarray [x+600]=true;
			booarray [x+602]=true;
			booarray [x+651]=true;
		}catch(Exception e){
			
		}
		return booarray;
	}
	/**
	 * switchengine pattern
	 * @param grid
	 * @return
	 */
	public boolean[] swtichengine(boolean booarray[]) {
		try {
			booarray[x] = true;
			booarray[x-2] = true;
			booarray[x+47] = true;
			booarray[x+98] = true;
			booarray[x+101] = true;
			booarray[x+150] = true;
			booarray[x+151] = true;
			booarray[x+152] = true;
			booarray[x+273] = true;
			booarray[x+274] = true;
			booarray[x+323] = true;
		}catch(Exception e){
			
		}
		return booarray;
	}
	/**
	 * glidergun pattern
	 * @param grid
	 * @return
	 */
	public boolean[] glidergun(boolean booarray[]) {
		try {
			booarray[x] = true;
			booarray[x+50] = true;
			booarray[x+49] = true;
			booarray[x+48] = true;
			booarray[x+47] = true;
			booarray[x+55] = true;
			booarray[x+89] = true;
			booarray[x+99] = true;
			booarray[x+98] = true;
			booarray[x+97] = true;
			booarray[x+96] = true;
			
			booarray[x+241] = true;
			booarray[x+140] = true;
			booarray[x+105] = true;
			booarray[x+149] = true;
			booarray[x+146] = true;
			booarray[x+138] = true;
			booarray[x+191] = true;
			booarray[x+241] = true;
			booarray[x+291] = true;
			
			booarray[x+159] = true;
			booarray[x+199] = true;
			booarray[x+198] = true;
			booarray[x+197] = true;
			booarray[x+196] = true;
			booarray[x+191] = true;
			booarray[x+160] = true;
			
			booarray[x+210] = true;
			booarray[x+209] = true;
			booarray[x+192] = true;
			booarray[x+242] = true;
			booarray[x+292] = true;
			booarray[x+187] = true;
			booarray[x+227] = true;
			booarray[x+226] = true;
			booarray[x+250] = true;
			booarray[x+249] = true;
			booarray[x+248] = true;
			booarray[x+247] = true;
			
			
			booarray[x+237] = true;
			booarray[x+277] = true;
			booarray[x+276] = true;
			booarray[x+300] = true;
		
			booarray[x+291] = true;
			
			booarray[x+287] = true;
			//fixed
			booarray[x+339] = true;
			booarray[x+337] = true;
			booarray[x+388] = true;
		}catch(Exception e){
			
		}
		return booarray;
	}


}
