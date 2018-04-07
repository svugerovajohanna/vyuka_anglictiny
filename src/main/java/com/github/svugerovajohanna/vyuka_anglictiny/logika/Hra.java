package com.github.svugerovajohanna.vyuka_anglictiny.logika;

public class Hra {
	

	private SeznamSlov platnaSlova;
	int spravne;
	int spatne;

	public Hra(){
		platnaSlova = new SeznamSlov();
		platnaSlova.vlozSlovo(new Slovo("auto","car",1));
		platnaSlova.vlozSlovo(new Slovo("pes","dog",2));
		platnaSlova.vlozSlovo(new Slovo("holka", "girl", 3));
		platnaSlova.vlozSlovo(new Slovo("kluk","boy", 4));
		platnaSlova.vlozSlovo(new Slovo("kytka", "flower", 5));
		platnaSlova.vlozSlovo(new Slovo("kočka", "cat", 6));
		
		spravne = 0;
		spatne = 0;
		
	}
	
	public SeznamSlov getSeznam(){
		return platnaSlova;
	}
	
	public int getSpravne() {
		return spravne;
	}
	
	public int getSpatne() {
		return spatne;
	}
	
	public void setSpatne(int spatne) {
		this.spatne = spatne;
	}
	
	public void setSpravne(int spravne) {
		this.spravne = spravne;
	}
	
	
}
