package at.aau.se15.bsp2;

public class Tester extends Person {
	public String bevorzugtesTestFramework;
	
	public Tester (String vorname, String nachname, Integer alter, String bevorzugtesTestFramework) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.bevorzugtesTestFramework = bevorzugtesTestFramework;
		this.jobBeschreibung = "Testet Code.";
	}

}
