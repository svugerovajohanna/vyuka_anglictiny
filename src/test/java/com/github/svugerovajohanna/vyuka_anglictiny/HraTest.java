package com.github.svugerovajohanna.vyuka_anglictiny;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.github.svugerovajohanna.vyuka_anglictiny.logika.Hra;
import com.github.svugerovajohanna.vyuka_anglictiny.logika.SeznamSlov;
import com.github.svugerovajohanna.vyuka_anglictiny.logika.Slovo;

/**
 * Testovací třída HraTest slouží pro otestování třídy Hra.
 * 
 * Konkrétně možnost vyhledat aktuální seznam platných slov
 * a počet spravných a špatných pokusů.
 * 
 * @author johannasvugerova
 *
 */
public class HraTest {
	
	private Hra hra1;
	private SeznamSlov seznamek;

	/***************************************************************************
     * Metoda se provede před spuštěním každé testovací metody. Používá se
     * k vytvoření tzv. přípravku (fixture), což jsou datové atributy (objekty),
     * s nimiž budou testovací metody pracovat.
     */
    @Before
    public void setUp() {
        hra1 = new Hra();
        Slovo slovo1 = new Slovo("kočka","cat",1);
        Slovo slovo2 = new Slovo("pes", "dog",2);
        seznamek = new SeznamSlov();
		seznamek.vlozSlovo(slovo1);
		seznamek.vlozSlovo(slovo2);

    }
    
    /***************************************************************************
     * Úklid po testu - tato metoda se spustí po vykonání každé testovací metody.
     */
    @After
    public void tearDown() {
    }
    
    /**
     * Metoda tesující získaní správného seznamu platných slov ze hry.
     */
	@Test
	public void testZiskaniSeznamu() {
		assertEquals(seznamek, hra1.getSeznam());
	}
	
	/**
	 * Metoda získání akutuálního počtu správných a špatných pokusů.
	 */
	public void testPokusu() {
		hra1.setSpatne(2);
		assertEquals(2, hra1.getSpatne());
		hra1.setSpravne(333);
		assertEquals(333, hra1.getSpravne());
		
	}

}
