package org.example;
public class Persona {
	protected String nombre;
	protected String run;
	protected String estadoCivil;

    public Persona() {

    }

	public String getNombre() {
		return this.nombre;
	}

	public String getRun() {
		return this.run;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public Persona(String nombre, String run, String estadoCivil) {

		this.nombre=nombre;
		this.run=run;
		this.estadoCivil=estadoCivil;

		throw new UnsupportedOperationException();
	}
}