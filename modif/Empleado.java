public class Empleado {
private int dni;
private String nombre;
private int legajo;
private String categoria;
private float sueldo;
private int cantidadDeVentas;

//Metodos
public Empleado (int docu,String nom, int leg, String cat, float suel, int ventas){
	dni = docu;
	nombre=nom;
	legajo = leg;
	categoria=cat;
	sueldo=suel;
	cantidadDeVentas=ventas;
}
//public boolean sosNom(String nom){
//return !(nombre.compareToIgnoreCase(nom) == 0);
//}
public int darDni(){
	return dni;
}
public String darNombre(){
	return nombre;
}
public int darLegajo(){
	return legajo;
}
public float darSueldo(){
	return sueldo;
	}
public int darVentas(){
	return cantidadDeVentas * 200;
	}
public String darCategoria(){
	return categoria;
	}
public boolean sosDni(int docu){
		return (dni == docu);
	}
public void nuevoSueldo(float nuevo){
	sueldo=nuevo;
}
}//clase
