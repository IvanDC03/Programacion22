package Actividad;

public class Alumno {
private String nombre;
private String curso;
private int [] notas;
private int asignaturas;
public Alumno(String nombre, String curso,int asignaturas) {
	this.nombre = nombre;
	this.curso = curso;
    this.notas = notas;
    
}
public int getAsignaturas() {
	return asignaturas;
}
public void setAsignaturas(int asignaturas) {
	this.asignaturas = asignaturas;
}

}