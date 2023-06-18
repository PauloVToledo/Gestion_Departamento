package org.example;
public class PersonalContratado extends Persona {
	protected int anhoIncorporacion;

	public int getAnhoIncorporacion() {
		return this.anhoIncorporacion;
	}

	public PersonalContratado(int anhoIncorporacion) {
		super();
		this.anhoIncorporacion=anhoIncorporacion;

		throw new UnsupportedOperationException();
	}
}