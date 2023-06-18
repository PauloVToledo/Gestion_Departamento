package org.example;
public class Profesor extends PersonalContratado {
	private String asignatura;
	private Departamento departamento;

	public Profesor(int anhoIncorporacion) {
		super(anhoIncorporacion);
		this.asignatura=getAsignatura();
	}

	public String getAsignatura() {
		return this.asignatura;
	}

	@Override
	public String toString() {
		return "Año de incorporación: " + super.anhoIncorporacion + ", Nombre: " + super.nombre + ", Run: " + super.run;
	}
}

