package com.github.svugerovajohanna.vyuka_anglictiny.logika;

/**
* Třída slovo posisuje jednotlivá slova hry. 
* 
* Slovo má vždy český a anglický překlad.
*
* @author    Johanna Švugerová
* @version   LS 2017/2018
*/

public class Slovo {

	private String cesky;
	private String anglciky;
	
	/** 
	 * Konstruktor metody Slovo.
	 * 
	 * @param cesky - slovo v cestine
	 * @param anglicky - slovo v anglictine
	 */
	
	public Slovo(String cesky, String anglicky) {
		this.setCesky(cesky);
		this.setAnglciky(anglicky);
	}
	
	/** 
	 * Metoda pro získání českého překladu.
	 *
	 */

	public String getCesky() {
		return cesky;
	}
	
	/** 
	 * Metoda pro nastavení českého překladu.
	 *
	 */
	public void setCesky(String cesky) {
		this.cesky = cesky;
	}

	/** 
	 * Metoda pro získání anglického překladu.
	 *
	 */
	public String getAnglciky() {
		return anglciky;
	}

	
	/** 
	 * Metoda pro nastavení anglického překladu.
	 *
	 */
	public void setAnglciky(String anglciky) {
		this.anglciky = anglciky;
	}
}
