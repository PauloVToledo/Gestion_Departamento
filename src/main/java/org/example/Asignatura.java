package org.example;
import java.util.ArrayList;

public class Asignatura {
	private String nombre;
	private ArrayList<Profesor> profesor = new ArrayList<Profesor>();
	private ArrayList<Estudiante> estudiante = new ArrayList<Estudiante>();

	public String getNombre() {
		return this.nombre;
	}

	public Asignatura(String nombre) {

		this.nombre = nombre;
		this.profesor= new ArrayList<>(profesor);
		this.estudiante = new ArrayList<>(estudiante);

		throw new UnsupportedOperationException();
	}
}