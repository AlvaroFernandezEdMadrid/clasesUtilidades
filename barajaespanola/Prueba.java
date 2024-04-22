package barajaespanola;

import daw.com.Teclado;

public class Prueba {

	public static void main(String[] args) {
		Baraja b;
		
		b=new Baraja();
		
		do {
			b.barajar();
			System.out.println(b);
		} while (Teclado.leerString("\nBarajo? (S/N)").equalsIgnoreCase("s"));
		
	}

}
