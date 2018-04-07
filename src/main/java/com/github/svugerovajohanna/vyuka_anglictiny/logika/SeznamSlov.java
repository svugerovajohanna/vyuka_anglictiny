package com.github.svugerovajohanna.vyuka_anglictiny.logika;

import java.util.HashMap;
import java.util.Map;

public class SeznamSlov {
	private  Map<Integer,Slovo> mapaSeSlovy;
	
	public SeznamSlov() {
		mapaSeSlovy = new HashMap<>();
	}
	
	public void  vlozSlovo(Slovo slovo){
		mapaSeSlovy.put(slovo.getCislo(), slovo);
	}
	
	public Slovo vratSlovo(int cislo) {
		if (mapaSeSlovy.containsKey(cislo)) {
            return mapaSeSlovy.get(cislo);
        }
        else {
            return null;
        }
	}
}
