package com.github.svugerovajohanna.vyuka_anglictiny.ui;

import com.github.svugerovajohanna.vyuka_anglictiny.logika.Hra;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** Třída Start bude hlavní třídou projektu,
* který představuje jednoduchou aplikaci pro výuku angličtiny.
*
* @author    Johanna Švugerová
* @version   LS 2017/2018
*/

public class App extends javafx.application.Application {
	
	/**
	 * Spouštěcí metoda pro aplikaci
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
           launch(args);
       } else {
    	   		System.out.println("Neplatný parametr");
           }
      }

	/**
	 * Metoda, ve které se konstruuje okno, kontroler a hra,
	 * která se předává kontroleru
	 */
	 @Override
		public void start(Stage primaryStage) throws Exception {
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass()
			          .getResource("Home.fxml"));
			Parent root = loader.load();

			HomeController controller = loader.getController();
			controller.inicializuj(new  Hra());
			
	        primaryStage.setTitle("Výuka angličtiny");
	        primaryStage.setScene(new Scene(root));
	        primaryStage.show();
			
		}
	}