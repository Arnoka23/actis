package daoimplementek;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import dao.Dao;

public class DaoImplementek implements Dao {

	@Override
	public List<String[]> listaBeolvasMutogatas() {
		List<String[]> mutogatLista = new ArrayList<>();
		try {
			List<String> beolvas = Files.readAllLines(Paths.get("src/Feladatok/mutogat.csv"));
			for (String sor : beolvas) {
				String[] split = sor.split(";");
				String[] mutogatas = new String[2];
				mutogatas[0] = split[0];
				mutogatas[1] = split[1];

				mutogatLista.add(mutogatas);

			}
		} catch (IOException e) {
			System.err.println("Hiba a mutogatás beolvasásnál!");
		}
		return mutogatLista;

	}

	@Override
	public List<String[]> listaBeolvasRajzol() {
		List<String[]> rajzolLista = new ArrayList<>();
		try {
			List<String> beolvas = Files.readAllLines(Paths.get("src/Feladatok/rajzol.csv"));
			for (String sor : beolvas) {
				String[] split = sor.split(";");
				String[] rajzolas = new String[2];
				rajzolas[0] = split[0];
				rajzolas[1] = split[1];

				rajzolLista.add(rajzolas);

			}
		} catch (IOException e) {
			System.err.println("Hiba a rajzolás beolvasásnál!");
		}
		return rajzolLista;

	}

	@Override
	public List<String[]> listaBeolvasBeszel() {
		List<String[]> beszelLista = new ArrayList<>();
		try {
			List<String> beolvas = Files.readAllLines(Paths.get("src/Feladatok/beszel.csv"));
			for (String sor : beolvas) {
				String[] split = sor.split(";");
				String[] beszeles = new String[2];
				beszeles[0] = split[0];
				beszeles[1] = split[1];

				beszelLista.add(beszeles);

			}
		} catch (IOException e) {
			System.err.println("Hiba a beszél beolvasásnál!");
		}
		return beszelLista;

	}
}