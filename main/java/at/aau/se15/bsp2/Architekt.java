package at.aau.se15.bsp2;

public class Architekt extends Person {
	public Feld feld;
	
	public Architekt(String vorname, String nachname, Integer alter, Feld feld) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.feld = feld;
		this.jobBeschreibung = "Designed die Architektur des Projekts.";
	}

}
