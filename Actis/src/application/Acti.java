package application;

public class Acti {
private int igy;
  private int ketto;
  private int harom;
  private int negy;
  private String ot;

	public Acti(int ketto, int harom, int negy, String ot) {
		this.ketto = ketto;
		this.harom = harom;
		this.negy = negy;
		this.ot = ot;
	}

	public Acti(int igy) {
		this.igy = igy;
	}

	public int getIgy() {
	return igy;
}
public void setIgy(int igy) {
	this.igy = igy;
}
public int getKetto() {
	return ketto;
}
public void setKetto(int ketto) {
	this.ketto = ketto;
}
public int getHarom() {
	return harom;
}
public void setHarom(int harom) {
	this.harom = harom;
}
public int getNegy() {
	return negy;
}
public void setNegy(int negy) {
	this.negy = negy;
}
public String getOt() {
	return ot;
}
public void setOt(String ot) {
	this.ot = ot;
}
  

}
