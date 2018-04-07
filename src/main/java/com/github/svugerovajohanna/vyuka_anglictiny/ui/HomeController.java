package com.github.svugerovajohanna.vyuka_anglictiny.ui;

import com.github.svugerovajohanna.vyuka_anglictiny.logika.Hra;


import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class HomeController extends GridPane {
	
	@FXML private Label slovo;
	@FXML private Button hadej;
	
	private Hra hra;
	private String vybrane;
	
	
	public void inicializuj(Hra hra){
		slovo.setText(null);
		this.hra = hra;
		//hadej.setOnAction(this::handleButtonAction);
	
	}
	
	@FXML public void novaHra() {
		inicializuj(new Hra());
		
	}

	@FXML private void handleButtonAction(ActionEvent event) {
		java.util.Random generator = new java.util.Random();
        int nahoda = generator.nextInt(6)+1;
       
        
        vybrane = hra.getSeznam().vratSlovo(nahoda).getAnglciky();
        slovo.setText(vybrane);
        	
   
	}

	
}
