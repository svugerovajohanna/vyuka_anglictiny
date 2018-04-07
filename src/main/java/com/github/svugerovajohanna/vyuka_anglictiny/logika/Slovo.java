package com.github.svugerovajohanna.vyuka_anglictiny.logika;

/**
* Třída slovo posisuje jednotlivá slova hry. 
* 
* Slovo má vždy český a anglický překlad a číslo, které ho  v této aplikaci reprezentuje.
*
* @author    Johanna Švugerová
* @version   LS 2017/2018
*/

public class Slovo {

	private String cesky;
	private String anglciky;
	private int cislo;
	
	/** 
	 * Konstruktor metody Slovo.
	 * 
	 * @param cesky - slovo v cestine
	 * @param anglicky - slovo v anglictine
	 * @param cislo - přiřazené číslo, které dané slovo v aplikaci reprezentuje
	 */
	
	public Slovo(String cesky, String anglicky, int cislo) {
		this.setCesky(cesky);
		this.setAnglciky(anglicky);
		this.cislo = cislo;
	}
	
	/** 
	 * Metoda pro získání českého překladu.
	 * 
	 * @return český překlad slova
	 *
	 */

	public String getCesky() {
		return cesky;
	}
	
	/** 
	 * Metoda pro nastavení českého překladu.
	 * 
	 * @ param cesky - zadaný český překlad 
	 *
	 */
	public void setCesky(String cesky) {
		this.cesky = cesky;
	}

	/** 
	 * Metoda pro získání anglického překladu
	 *
	 * @return anglický překlad slov
	 */
	public String getAnglciky() {
		return anglciky;
	}

	
	/** 
	 * Metoda pro nastavení anglického překladu.
	 * 
	 * @param anglicky - zadaný anglický překlad
	 */
	public void setAnglciky(String anglciky) {
		this.anglciky = anglciky;
	}

	/**
	 * Metoda pro získání čísla reprezetující slovo.
	 * 
	 * @return číslo (int), které reprezentuje dané slovo
	 */
	public int getCislo() {
		return cislo;
	}

	/**
	 * Metoda umožňuje nastavit slovu jeho čísloů.
	 * 
	 * @param cislo - číslo reprezentujicí dané slovo
	 */
	public void setCislo(int cislo) {
		this.cislo = cislo;
	}
}
