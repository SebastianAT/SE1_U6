package at.aau.se15.bsp2;

public class Entwickler extends Person{
	public String bevorzugteProgrammierSprache;
	public IDE ide;
    public boolean datenbanken;
	
    public Entwickler (String vorname, String nachname, Integer alter, 
    		String bevorzugteProgrammierSprache, IDE ide, boolean datenbanken) {
    	this.vorname = vorname;
    	this.nachname = nachname;
    	this.alter = alter;
    	this.bevorzugteProgrammierSprache = bevorzugteProgrammierSprache;
    	this.ide = ide;
    	this.datenbanken = datenbanken;
    	this.jobBeschreibung = "Entwickelt Code.";
    }
}
