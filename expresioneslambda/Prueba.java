package expresioneslambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import Libreria.Libreria;

public class Prueba {

	public static void main(String[] args) {
		List<Alumno> alumnos= new ArrayList<Alumno>();
		
		Consumer<Alumno> escribidor;
		Comparator<Alumno> comparador, comparador1;
		Predicate<Alumno> predicado;
		Function<Alumno, String> obtenerNombre;
		Function<Alumno, LocalDate> obtenerFecha;
		
		alumnos.add(new Alumno("001", "Paco", LocalDate.now(), Libreria.generarAleatorio(0, 10)));
		alumnos.add(new Alumno("002", "Carlos", LocalDate.now(), Libreria.generarAleatorio(0, 10)));
		alumnos.add(new Alumno("003", "Juan", LocalDate.now(), Libreria.generarAleatorio(0, 10)));
		alumnos.add(new Alumno("004", "Bruno", LocalDate.now(), Libreria.generarAleatorio(0, 10)));
		alumnos.add(new Alumno("005", "Mario", LocalDate.now(), Libreria.generarAleatorio(0, 10)));
		
		escribidor= (Alumno a) -> System.out.println(a);
		escribidor= a-> System.out.println(a);
		escribidor= System.out::println;
		
		comparador=(a1, a2) -> a1.getNota()-a2.getNota();
		alumnos.sort(comparador);
		
		predicado= a -> a.getNota()>=5;
		alumnos.removeIf(predicado.negate());
		
		obtenerNombre= a -> a.getNombre();
		
		obtenerFecha= Alumno::getFechaNacimiento;
		
		comparador1=Comparator.comparing(obtenerFecha);
		
		alumnos.forEach(escribidor);
		
		
	}

}
