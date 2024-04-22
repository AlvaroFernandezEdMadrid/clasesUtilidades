package barajaespanola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Stack;
import java.util.function.Consumer;

import Libreria.Libreria;


public class Baraja {
	private HashSet<Carta> baraja;

	public Baraja() {
		setBaraja();
	}
	
	private HashSet<Carta> generarBaraja() {
		HashSet<Carta> b;
		b=new HashSet<Carta>();
		
		while (b.size()<40) {
			b.add(new Carta());
		}
		
		return b;
	}

	public HashSet<Carta> getBaraja() {
		return new HashSet<Carta>(baraja);
	}

	public void setBaraja() {
		this.baraja=generarBaraja();
	}

	@Override
	public String toString() {
		Consumer<Carta> cc=new Consumer<Carta>() {
			
			@Override
			public void accept(Carta arg0) {
				System.out.println("\n"+arg0);
			}
		};
		baraja.forEach(cc);
		
		return "";
	}

	@Override
	public int hashCode() {
		return Objects.hash(baraja);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Baraja other = (Baraja) obj;
		return Objects.equals(baraja, other.baraja);
	}
	
	public void barajar() {
		List<Carta> lista;
		int rnd;
		lista=new ArrayList<Carta>(baraja);
		
		for (int i = 0; i < baraja.size(); i++) {
			rnd=Libreria.generarAleatorio(0, 40);
			
			Collections.shuffle(lista, new Random(rnd));
		}
		
		this.baraja=new HashSet<Carta>(lista);
	}
	
	public Carta getCarta() {
		Stack<Carta> baraja=new Stack<Carta>();
		
		baraja.addAll(this.baraja);
		
		return baraja.pop();
	}
}
