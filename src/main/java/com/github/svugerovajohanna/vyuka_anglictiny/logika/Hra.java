package com.github.svugerovajohanna.vyuka_anglictiny.logika;
/**
 * Class Hra - třída představujicí logiku stav aplikace
 * 
 * Tato třída inicializuje prvky ze kterých se hra skládá:
 * vytváří seznam platných slov
 * a stav špatných a správných odpovědí.
 * 
 * 
 * @author johannasvugerova
 * 
 */
public class Hra {
	
	private SeznamSlov platnaSlova;
	int spravne;
	int spatne;

	
	/**
	 * Konstruktor - vytváří seznam platných slov a nuluje počet pokusů.
	 */
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
	
	/**
	 * Metoda vrací seznam slov použitelných ve hře.
	 * 
	 * @return seznam platných slov ve hře
	 */
	public SeznamSlov getSeznam(){
		return platnaSlova;
	}
	
	/**
	 * Metoda udává počet správných pokusů v aktuální hře.
	 * 
	 * @return počet správných pokusů
	 */
	public int getSpravne() {
		return spravne;
	}
	
	/**
	 * Metoda udává počet špatných pokusů v aktuální hře.
	 * 
	 * @return počet špatných pokusů
	 */
	public int getSpatne() {
		return spatne;
	}
	
	/**
	 * Metoda nastaví počet špatných pokusů na zadanou hodnotu
	 *
	 * @param spatne - nová hodnota špatných pokusů
	 */
	public void setSpatne(int spatne) {
		this.spatne = spatne;
	}
	
	/**
	 * Metoda nastavuje počet správných pokusů na zadnou hodnotu.
	 * 
	 * @param spravne - nová hodnoda správných pokusů
	 */
	public void setSpravne(int spravne) {
		this.spravne = spravne;
	}
	
	
}
