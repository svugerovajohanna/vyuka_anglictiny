package com.github.svugerovajohanna.vyuka_anglictiny.logika;

import java.util.HashMap;
import java.util.Map;

/**
 * Class Seznam slov - eviduje seznam slov platných ve hře.
 * 
 * Používá se pro rozpoznávání slov a vracení odkazu na třídu implementující slovo.
 * Každé nové slovo se musí přidat metodou vlozSlovo.
 * 
 * @author johannasvugerova
 *
 */
public class SeznamSlov {
	private  Map<Integer,Slovo> mapaSeSlovy;
	
	/**
	 * Konstruktor - vytváří prázdnou mapu pro seznam.
	 */
	public SeznamSlov() {
		mapaSeSlovy = new HashMap<>();
	}
	
	/**
	 * Metoda vkládá slovo do seznamu (mapy) platných slov.
	 * 
	 * @param slovo - slovo, které chceme přidat
	 */
	public void  vlozSlovo(Slovo slovo){
		mapaSeSlovy.put(slovo.getCislo(), slovo);
	}
	
	/**
	 * Metoda vrací odkaz na konrétní instanci třídy Slovo na základě zadaného čísla
	 * 
	 * @param cislo - číslo slova
	 * @return konrétní instance třídy Slovo odpovídající zadanému čísli
	 */
	public Slovo vratSlovo(int cislo) {
		if (mapaSeSlovy.containsKey(cislo)) {
            return mapaSeSlovy.get(cislo);
        }
        else {
            return null;
        }
	}
}
