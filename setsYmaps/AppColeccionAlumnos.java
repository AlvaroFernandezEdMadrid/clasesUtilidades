package setsYmaps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

import daw.com.Pantalla;
import daw.com.Teclado;

public class AppColeccionAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Alumno> alumnos;
		Alumno alumno;
		String dni;
		Predicate<Alumno> notaMuyBaja;
		Iterator<Alumno> iterador;
		
		alumnos = new HashSet<>();

		// leer una colecciÃ³n de alumnos
		do
		{
			dni = Teclado.leerString("\ndni");
			alumno = new Alumno(dni);

			if (alumnos.add(alumno))
			{
				alumno.leerDatos();
				Pantalla.escribirString("\nAlumno insertado correctamente");

			}
			else
				Pantalla.escribirString("\nAlumno ya existe");

		}while ("s".equals(Teclado.leerString("sigo(s/n)")));

		
		for (Alumno a : alumnos)
			Pantalla.escribirString("\n" + a);
		
		/* esto falla porque se modifica alumnos
		for (Alumno a: alumnos)
			if (a.getNota() < 2)
				alumnos.remove(a);
		*/
		
		notaMuyBaja = new Predicate<Alumno> ()
				{

					@Override
					public boolean test(Alumno t) {
						// TODO Auto-generated method stub
						return t.getNota() < 2;
					}
			
				};
		
		//alumnos.removeIf(notaMuyBaja);		
				
		iterador = alumnos.iterator();
		
		while (iterador.hasNext())
		{
			alumno = iterador.next();
			if (alumno.getNota() < 2)
				iterador.remove();
		}
		
		for (Alumno a : alumnos)
			Pantalla.escribirString("\n" + a);
	}

}