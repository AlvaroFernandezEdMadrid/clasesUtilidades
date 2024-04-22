package barajaespanola;

import java.util.ArrayList;

public enum Palo {
	BASTOS, ESPADAS, COPAS, OROS;
	
	public static ArrayList<String> getPaloList(){
		ArrayList<String> palos;
		palos=new ArrayList<String>();
		
		for (Palo p : Palo.values()) {
			palos.add(p.name());
		}
		
		return palos;
	}
}
