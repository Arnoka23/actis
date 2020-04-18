package application;

import java.util.Arrays;

public class Kartya {
	private String[] mutogat1;
	private String[] beszel1;
	private String[] rajz1;
	private String[] mutogat2;
	private String[] beszel2;
	private String[] rajz2;

	public Kartya(String[] mutogat1, String[] beszel1, String[] rajz1, String[] mutogat2, String[] beszel2,
			String[] rajz2) {
		super();
		this.mutogat1 = mutogat1;
		this.beszel1 = beszel1;
		this.rajz1 = rajz1;
		this.mutogat2 = mutogat2;
		this.beszel2 = beszel2;
		this.rajz2 = rajz2;
	}

	public String[] getMutogat1() {
		return mutogat1;
	}

	public void setMutogat1(String[] mutogat1) {
		this.mutogat1 = mutogat1;
	}

	public String[] getBeszel1() {
		return beszel1;
	}

	public void setBeszel1(String[] beszel1) {
		this.beszel1 = beszel1;
	}

	public String[] getRajz1() {
		return rajz1;
	}

	public void setRajz1(String[] rajz1) {
		this.rajz1 = rajz1;
	}

	public String[] getMutogat2() {
		return mutogat2;
	}

	public void setMutogat2(String[] mutogat2) {
		this.mutogat2 = mutogat2;
	}

	public String[] getBeszel2() {
		return beszel2;
	}

	public void setBeszel2(String[] beszel2) {
		this.beszel2 = beszel2;
	}

	public String[] getRajz2() {
		return rajz2;
	}

	public void setRajz2(String[] rajz2) {
		this.rajz2 = rajz2;
	}

	@Override
	public String toString() {
		return "**************************************\n" + "*  Mutogatás: " + mutogat1[0] + "   " + mutogat1[1] + " pont  \n"
				+ "*  Rajzolás: " + rajz1[0] + "   " + rajz1[1] + " pont  \n" + "*  Körülírás: " + beszel1[0] + "   "
				+ beszel1[1] + " pont  \n" + "*  Mutogatás: " + mutogat1[0] + "   " + mutogat1[1] + " pont  \n"
				+ "*  Rajzolás: " + rajz1[0] + "   " + rajz1[1] + " pont  \n" + "*  Körülírás: " + beszel1[0] + "   "
				+ beszel1[1] + " pont  \n" + "**************************************\n";

	}

}
