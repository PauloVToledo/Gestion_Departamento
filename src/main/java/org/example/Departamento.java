package org.example;
import java.util.ArrayList;

public class Departamento {
	public ArrayList<Administrativo> unnamed_Administrativo_ = new ArrayList<Administrativo>();
	private ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

	public Estudiante buscarEstudiante(String nombre) {
		for (Estudiante estudiante : estudiantes) {
			if (estudiante.getNombre().equalsIgnoreCase(nombre)) {
				return estudiante;
			}
		}
		return null; // Retorna null si no se encuentra el estudiante
	}

	public Profesor buscarProfesor(String nombre) {
		for (Profesor profesor : profesores) {
			if (profesor.getNombre().equalsIgnoreCase(nombre)) {
				return profesor;
			}
		}
		return null; // Retorna null si no se encuentra el profesor
	}


	public void mostrarPersonalCompleto() {
		System.out.println("Estudiantes:");
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante.toString());
		}

		System.out.println("Profesores:");
		for (Profesor profesor : profesores) {
			System.out.println(profesor.toString());
		}

		System.out.println("Administrativos:");
		for (Administrativo administrativo : unnamed_Administrativo_) {
			System.out.println(administrativo.toString());
		}
	}


	public ArrayList<Estudiante> getEstudiante() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Profesor> getProfesor() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Administrativo> getAdministrativo() {
		throw new UnsupportedOperationException();
	}
}