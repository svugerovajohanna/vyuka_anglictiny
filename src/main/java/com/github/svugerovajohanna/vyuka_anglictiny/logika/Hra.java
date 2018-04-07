package com.github.svugerovajohanna.vyuka_anglictiny.logika;

public class Hra {
	

	private SeznamSlov platnaSlova;

	public Hra(){
		platnaSlova = new SeznamSlov();
		platnaSlova.vlozSlovo(new Slovo("auto","car",1));
		platnaSlova.vlozSlovo(new Slovo("pes","dog",2));
		platnaSlova.vlozSlovo(new Slovo("holka", "girl", 3));
		platnaSlova.vlozSlovo(new Slovo("kluk","boy", 4));
		platnaSlova.vlozSlovo(new Slovo("kytka", "flower", 5));
		platnaSlova.vlozSlovo(new Slovo("kočka", "cat", 6));
		
	}
	
	public SeznamSlov getSeznam(){
		return platnaSlova;
	}
	
	
	
}
