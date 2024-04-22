package ejerciciofechasycolecciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;

public class Persona implements Comparable<Persona>{
	private String nombre;
	private String dni;
	private LocalDate fechaNac;
	private float afecto;
	private Colectivo colectivo;
	private HashSet<String> aficiones;
	
	public Persona(String nombre, String dni, LocalDate fechaNac, float afecto, Colectivo colectivo,
			HashSet<String> aficiones) {
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNac = fechaNac;
		setAfecto(afecto);
		this.colectivo = colectivo;
		this.aficiones = aficiones;
	}

	public Persona(String dni) {
		this(dni, "", LocalDate.of(2000, 01, 01), 0, Colectivo.ALUMNO, new HashSet<String>());
	}

	public Persona() {
		this("", "", LocalDate.of(2000, 01, 01), 0, Colectivo.ALUMNO, new HashSet<String>());
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public float getAfecto() {
		return afecto;
	}
	
	public void setAfecto(float afecto) {
		if (afecto<0) {
			afecto=0;
		}
		this.afecto = afecto;
	}
	
	public Colectivo getColectivo() {
		return colectivo;
	}
	
	public void setColectivo(Colectivo colectivo) {
		this.colectivo = colectivo;
	}
	
	public HashSet<String> getAficiones() {
		return aficiones;
	}
	
	public void setAficiones(HashSet<String> aficiones) {
		this.aficiones = aficiones;
	}

	@Override
	public String toString() {
		return "Persona Nombre=" + nombre + ", dni=" + dni + ", Fecha Nacimiento=" + fechaNac.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + ", afecto=" + afecto
				+ ", colectivo=" + colectivo + ", aficiones=" + aficiones;
	}

	@Override
	public int compareTo(Persona o) {
		
		return dni.compareTo(o.dni);
	}
	
	
}
