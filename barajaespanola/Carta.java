package barajaespanola;

import java.util.Objects;

import Libreria.Libreria;

public class Carta {
	private int numero; //No 8,9
	private Palo palo;

	public Carta() {
		setNumero(generarNumero());
		setPalo(generarPalo());
	}
	
	public Carta(Carta og) {
		this.numero=og.numero;
		this.palo=og.palo;
	}

	private int generarNumero() {
		return Libreria.generarAleatorio(1, 12);
	}

	private Palo generarPalo() {
		int cual;
		Palo p;

		cual=Libreria.generarAleatorio(0, 3);

		switch (cual) {
		case 0:
			p=Palo.BASTOS;
			break;
		case 1:
			p=Palo.COPAS;
			break;
		case 2:
			p=Palo.ESPADAS;
			break;
		default:
			p=Palo.OROS;
			break;
		}

		return p;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero>12) {
			numero=12;
		}else if (numero==8) {
			numero=7;
		}else if (numero==9) {
			numero=10;
		}else if (numero<0) {
			numero=1;
		}

		this.numero = numero;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		if (!Palo.getPaloList().contains(palo.name())) {
			palo=Palo.OROS;
		}
		this.palo = palo;
	}

	@Override
	public String toString() {
		return "Carta numero=" + numero + ", palo=" + palo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero, palo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return numero == other.numero && palo == other.palo;
	}


}
