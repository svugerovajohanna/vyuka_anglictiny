package com.github.svugerovajohanna.vyuka_anglictiny.ui;

import com.github.svugerovajohanna.vyuka_anglictiny.logika.Hra;
import com.github.svugerovajohanna.vyuka_anglictiny.logika.Slovo;

import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class HomeController extends GridPane {
	
	@FXML private Label slovo;
	@FXML private Label spravne;
	@FXML private Label spatne;
	@FXML private Button hadej;
	@FXML private Button auto;
	@FXML private Button pes;
	@FXML private Button holka;
	@FXML private Button kluk;
	@FXML private Button kytka;
	@FXML private Button kocka;
	@FXML private Alert alertSpravne;
	@FXML private Alert alertSpatne;
	
	private Hra hra;
	private String vybranyText;
	private Slovo vybraneSlovo;
	private int spravnyPokus;
	private int spatnyPokus;
	
	
	public void inicializuj(Hra hra){
		auto.setDisable(true);
		pes.setDisable(true);
		holka.setDisable(true);
		kluk.setDisable(true);
		kytka.setDisable(true);
		kocka.setDisable(true);
		slovo.setText(null);
		spravne.setText(String.valueOf(hra.getSpravne()));
		spatne.setText(String.valueOf(hra.getSpatne()));
		this.hra = hra;
		spravnyPokus = 0;
		spatnyPokus = 0;
		//hadej.setOnAction(this::handleButtonAction);
		
		alertSpravne = new Alert(AlertType.INFORMATION);
		alertSpravne.setTitle("Správně!");
		alertSpravne.setHeaderText(null);
		alertSpravne.setContentText("Vybral jsi správně. Nyní můžeš hádat další slovo.");
	
		alertSpatne = new Alert(AlertType.INFORMATION);
		alertSpatne.setTitle("Špatně!");
		alertSpatne.setHeaderText(null);
		alertSpatne.setContentText("Vybral jsi špatně. Zkus vybrat jiný obrázek.");
	}
	
	@FXML public void novaHra() {
		inicializuj(new Hra());
	}

	@FXML private void handleButtonAction(ActionEvent event) {
		java.util.Random generator = new java.util.Random();
        int nahoda = generator.nextInt(6)+1;
       
        
        vybraneSlovo = hra.getSeznam().vratSlovo(nahoda);
        vybranyText = vybraneSlovo.getAnglciky();
        slovo.setText(vybranyText);
        hadej.setDisable(true);
        auto.setDisable(false);
		pes.setDisable(false);
		holka.setDisable(false);
		kluk.setDisable(false);
		kytka.setDisable(false);
		kocka.setDisable(false);
        	
   
	}
	
	@FXML private void vyberKocka(ActionEvent event) {
		if( vybraneSlovo.getCesky() == "kočka") {
			spravnyPokus++;
			alertSpravne.showAndWait();
			hra.setSpravne(spravnyPokus);
			hadej.setDisable(false);
			auto.setDisable(true);
			pes.setDisable(true);
			holka.setDisable(true);
			kluk.setDisable(true);
			kytka.setDisable(true);
			kocka.setDisable(true);
		}
		else {
			alertSpatne.showAndWait();
			spatnyPokus++;
			hra.setSpatne(spatnyPokus);
			
		}
		spravne.setText(String.valueOf(hra.getSpravne()));
		spatne.setText(String.valueOf(hra.getSpatne()));
		
		

	}
	@FXML private void vyberKytka(ActionEvent event) {
		if( vybraneSlovo.getCesky() == "kytka") {
			spravnyPokus++;
			alertSpravne.showAndWait();
			hra.setSpravne(spravnyPokus);
			hadej.setDisable(false);
			auto.setDisable(true);
			pes.setDisable(true);
			holka.setDisable(true);
			kluk.setDisable(true);
			kytka.setDisable(true);
			kocka.setDisable(true);
		}
		else {
			alertSpatne.showAndWait();
			spatnyPokus++;
			hra.setSpatne(spatnyPokus);
			
		}
		spravne.setText(String.valueOf(hra.getSpravne()));
		spatne.setText(String.valueOf(hra.getSpatne()));
		
		

	}
	@FXML private void vyberKluk(ActionEvent event) {
		if( vybraneSlovo.getCesky() == "kluk") {
			spravnyPokus++;
			alertSpravne.showAndWait();
			hra.setSpravne(spravnyPokus);
			hadej.setDisable(false);
			auto.setDisable(true);
			pes.setDisable(true);
			holka.setDisable(true);
			kluk.setDisable(true);
			kytka.setDisable(true);
			kocka.setDisable(true);
		}
		else {
			alertSpatne.showAndWait();
			spatnyPokus++;
			hra.setSpatne(spatnyPokus);
			
		}
		spravne.setText(String.valueOf(hra.getSpravne()));
		spatne.setText(String.valueOf(hra.getSpatne()));
		
		

	}
	
	@FXML private void vyberHolka(ActionEvent event) {
		if( vybraneSlovo.getCesky() == "holka") {
			spravnyPokus++;
			alertSpravne.showAndWait();
			hra.setSpravne(spravnyPokus);
			hadej.setDisable(false);
			auto.setDisable(true);
			pes.setDisable(true);
			holka.setDisable(true);
			kluk.setDisable(true);
			kytka.setDisable(true);
			kocka.setDisable(true);
		}
		else {
			alertSpatne.showAndWait();
			spatnyPokus++;
			hra.setSpatne(spatnyPokus);
			
		}
		spravne.setText(String.valueOf(hra.getSpravne()));
		spatne.setText(String.valueOf(hra.getSpatne()));
		
		

	}
	
	@FXML private void vyberPes(ActionEvent event) {
		if( vybraneSlovo.getCesky() == "pes") {
			spravnyPokus++;
			alertSpravne.showAndWait();
			hra.setSpravne(spravnyPokus);
			hadej.setDisable(false);
			auto.setDisable(true);
			pes.setDisable(true);
			holka.setDisable(true);
			kluk.setDisable(true);
			kytka.setDisable(true);
			kocka.setDisable(true);
		}
		else {
			alertSpatne.showAndWait();
			spatnyPokus++;
			hra.setSpatne(spatnyPokus);
			
		}
		spravne.setText(String.valueOf(hra.getSpravne()));
		spatne.setText(String.valueOf(hra.getSpatne()));
		
		

	}
	
	@FXML private void vyberAuto(ActionEvent event) {
		if( vybraneSlovo.getCesky() == "auto") {
			spravnyPokus++;
			alertSpravne.showAndWait();
			hra.setSpravne(spravnyPokus);
			hadej.setDisable(false);
			auto.setDisable(true);
			pes.setDisable(true);
			holka.setDisable(true);
			kluk.setDisable(true);
			kytka.setDisable(true);
			kocka.setDisable(true);
		}
		else {
			alertSpatne.showAndWait();
			spatnyPokus++;
			hra.setSpatne(spatnyPokus);
			
		}
		spravne.setText(String.valueOf(hra.getSpravne()));
		spatne.setText(String.valueOf(hra.getSpatne()));
		
		

	}

	
}
