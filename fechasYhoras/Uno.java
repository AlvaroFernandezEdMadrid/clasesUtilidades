package fechasYhoras;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

import daw.com.Teclado;

public class Uno {
	
	public static void main(String[] args) {
		LocalDate f1=LocalDate.parse(Teclado.leerString("\nFecha yyyy-mm-dd: "));
		
		LocalDate f2=LocalDate.parse(Teclado.leerString("\nFecha yyyy-mm-dd: "));
		
		String mensaje="\nYa deberia haber nacido";
		
		DateTimeFormatter formato=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		
		if (f1.isBefore(f2)) {
			LocalDate aux=f1;
			f1=f2;
			f2=aux;
		}
		
		if (!(Period.between(f1, f2).getMonths()>9)) {
			LocalDate f3=f1.plusMonths(9);
			Period p2=Period.between(f2, f3);
			mensaje="\nTodavia quedan " + p2.getMonths() + " meses, " + p2.getDays() + " dias.";
		}
		
		System.out.println(mensaje);
	}
}
