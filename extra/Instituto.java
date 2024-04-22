package extra;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Instituto {

	private Map<String, Set<Persona>> instituto;
	
	public Instituto ()
	{
		instituto = new TreeMap <String, Set<Persona>> ();
	}

	public Map<String, Set<Persona>> getInstituto() {
		return instituto;
	}

	public void setInstituto(Map<String, Set<Persona>> instituto) {
		this.instituto = instituto;
	}
	
	
	
}