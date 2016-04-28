package models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.Serializable;

public class TagMemonto implements Serializable{
	public  ArrayList<String> allMems = new ArrayList<String>();
	private int logtimes = 0;
	private int period =1;
	
	public TagMemonto() {
		
	}
	
	public void addMemontos(String e) {
		allMems.add(e);
		logtimes++;
		if (logtimes % period == 0) saveMemontos();
	}
	
	private void saveMemontos() {
		try {
			FileWriter fw = new FileWriter("mylogs"); 

			for (int i = 0; i < allMems.size(); i++) {
				System.out.println(allMems.get(i));
				fw.write(allMems.get(i) + " ");
			}
			fw.close();
		}
		catch (Exception e) {}
	}
	
	public void setPeriod(int period) {
		this.period = period;
	}
	
	public ArrayList<String> restore() {
		try {
			BufferedReader bf = new BufferedReader(new FileReader("mylogs"));
			String prev = bf.readLine();
			String alls[] = prev.split(" ");
			allMems.clear();
			for (int i = 0; i < alls.length; i++)
				allMems.add(alls[i]);
			bf.close();
		} catch (Exception e ){
			
		}
		return allMems;
	}
	
	
}