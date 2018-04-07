package com.github.svugerovajohanna.vyuka_anglictiny;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.github.svugerovajohanna.vyuka_anglictiny.logika.Hra;
import com.github.svugerovajohanna.vyuka_anglictiny.logika.SeznamSlov;
import com.github.svugerovajohanna.vyuka_anglictiny.logika.Slovo;

/**
 * Testovací třída SeznamSlovTest slouží k otestování třídy SeznamSlov.
 * 
 * @author johannasvugerova
 *
 */
public class SeznamPrikazuTest {
	
	private Hra hra;
	private Slovo slovo1;
	private Slovo slovo2;

	/**
	 * Metoda se provede přes spuštěním každé testovacé metody.
	 * Slouží k vytvoření přípravku - objekty s nimiž budou testovací metody pracovat.
	 */
	@Before
    public void setUp() {
        hra = new Hra();
        slovo1 = new Slovo("kočka","cat",1);
        slovo2 = new Slovo("pes", "dog",2);
    }
	
	/***************************************************************************
     * Úklid po testu - tato metoda se spustí po vykonání každé testovací metody.
     */
    @After
    public void tearDown() {
    }

	/**
	 * Testuje vkládání slov do seznamu platných slov
	 * a vybírání z toho seznamu.
	 */
	@Test
	public void testVlozeniVybrani() {
		SeznamSlov seznamek = new SeznamSlov();
		seznamek.vlozSlovo(slovo1);
		seznamek.vlozSlovo(slovo2);
		assertEquals(slovo1, seznamek.vratSlovo(slovo1.getCislo()));
		assertEquals(slovo2, seznamek.vratSlovo(slovo2.getCislo()));
		assertEquals(null, seznamek.vratSlovo(3));
		
	}
	

}
