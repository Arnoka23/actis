package application;
	
import java.util.List;


import dao.Dao;
import daoimplementek.DaoImplementek;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main /*extends Application*/ {
 //	@Override
//	public void start(Stage primaryStage) {
//		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	
	static int counter = 60;
	public static void main(String[] args) {
		//launch(args);
		Acti acti = new Acti();

		//System.out.println(acti.randomnum());

		System.out.println(Acti.randomnum());

		//Dao osztaly meghivása
		Dao dataAccesObject = new DaoImplementek();
		
		//Az osztályon belül meghivott metodus betöltése egy itteni ArrayListbe 
		List<String[]> mutatLista = dataAccesObject.listaBeolvasMutogatas();
		List<String[]> rajzolLista = dataAccesObject.listaBeolvasRajzol();
		List<String[]> beszelLista = dataAccesObject.listaBeolvasBeszel();

		
		//Tesztelés, hogy kiad-e mindent
		/*for (String[] strings : mutatLista) {
			System.out.println("Neve: " + strings[0] + " értéke: " + strings[1]);
		}*/
		
		//Tesztelés 
		String[] kivalasztottMutat = mutatLista.get(acti.randomnum());
		String[] kivalasztottRajzol = rajzolLista.get(acti.randomnum());
		String[] kivalasztottBeszel = beszelLista.get(acti.randomnum());
		String[] kivalasztottMutat2 = mutatLista.get(acti.randomnum());
		String[] kivalasztottRajzol2 = rajzolLista.get(acti.randomnum());
		String[] kivalasztottBeszel2 = beszelLista.get(acti.randomnum());
		
		//Egszerű teszt
//		System.out.println("Kiválasztott feladat Mutogatás: " + kivalasztottMutat[0] + " Pontszáma: " + kivalasztottMutat[1]);
//		System.out.println("Kiválasztott feladat Rajzolás: " + kivalasztottRajzol[0] + " Pontszáma: " + kivalasztottRajzol[1]);
//		System.out.println("Kiválasztott feladat Körülírás: " + kivalasztottBeszel[0] + " Pontszáma: " + kivalasztottBeszel[1]);
		// Fasza mükszik mindig random értéket töltbe :)
		
		//Egy újlap teszt
		Kartya kartyalap = new Kartya(kivalasztottMutat, kivalasztottBeszel, kivalasztottRajzol, kivalasztottMutat2,
				kivalasztottBeszel2, kivalasztottRajzol2);
		System.out.println(kartyalap);
		//OP
		
		Idozito ido = new Idozito();
		ido.idoMero(120);
	}
}
