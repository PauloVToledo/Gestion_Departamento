package org.example;
public class Estudiante extends Persona {
	private String asignatura;

	public Estudiante(String nombre, String run, String estadoCivil) {
		super(nombre, run, estadoCivil);
		this.asignatura = getAsignatura();
	}

	public String getAsignatura() {
		return this.asignatura;
	}

	@Override
	public String toString() {
		return "Nombre: " + super.nombre + ", Run: " + super.run + ", Estado Civil: " + super.estadoCivil;
	}
}
