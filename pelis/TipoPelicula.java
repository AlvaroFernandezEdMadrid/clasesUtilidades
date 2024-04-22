package pelis;

import java.util.ArrayList;
import java.util.List;

public enum TipoPelicula {
	AVENTURA,COMEDIA,TERROR,CIENCIAFICCION;
	
	static List<String> toStringList ()
	{
		List <String> lista = new ArrayList<>();
	
		for (TipoPelicula tipo : TipoPelicula.values())
			lista.add(tipo.toString());
		
		return lista;
	}
}