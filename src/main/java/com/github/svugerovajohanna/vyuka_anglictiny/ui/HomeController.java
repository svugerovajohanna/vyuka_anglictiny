package com.github.svugerovajohanna.vyuka_anglictiny.ui;

import com.github.svugerovajohanna.vyuka_anglictiny.logika.Hra;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXML;

public class HomeController extends GridPane {
	private Hra hra;
	
	public void inicializuj(Hra hra){
		this.hra = hra;
	}
}
