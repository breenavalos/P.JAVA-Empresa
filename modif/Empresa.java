import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	private String nombre;
	private String direccion;
	private ArrayList<Empleado> empleados;
	//Constructor	
	public Empresa(String nom, String dir){
		nombre = nom;
		direccion = dir;
		empleados=new ArrayList<Empleado>();
	}
	//Agregar Empleado
	
	public String darNombre(){
		return nombre;
	}
	
	public String darDireccion(){
		return direccion;
	}
	
	public void agregarEmpleado(){
		Scanner entrada = new Scanner(System.in);
		entrada.useDelimiter(System.getProperty("line.separator"));		
		System.out.print("\nIngrese Dni:");
		int docu = entrada.nextInt();
	
		Empleado e= this.verificarEmpleado(docu);
		
		if (e != null)
			{
				System.out.println("\n  Ya existe un empleado con ese D.N.I ");
			}
		else 
			{
				System.out.print("Ingrese Nombre:");
				String nom = entrada.next();
				System.out.print("Ingrese Legajo:");
				int leg = entrada.nextInt();
				System.out.print("Ingrese Categoria:");
				String cat = entrada.next();
				System.out.print ("Ingrese Sueldo:");
				float suel = entrada.nextFloat();
				System.out.print ("Ingrese Cantidad de Ventas:");
				int ventas = entrada.nextInt();
				Empleado a = new Empleado(docu, nom, leg, cat, suel, ventas);
				empleados.add(a);
			 }//else
}//agregar
	
	public void listarempleados(){
		System.out.print("\n    Nombre            D.N.I.      Legajo     Categoria       Sueldo    Adicional Ventas");
		for (Empleado e: empleados)
		  {	System.out.print("\n" + e.darNombre()); 
			System.out.print("     " + e.darDni());
			System.out.print("     " + e.darLegajo());
		    System.out.print("     " + e.darCategoria());
		    System.out.printf ("    %.0f " , e.darSueldo());
		    System.out.printf ("      " + e.darVentas());
		  }
		//	System.out.println ("");
	}
	
	public void eliminarEmpleado(){
		Scanner entrada = new Scanner(System.in);
		System.out.print("\nIngrese Dni:");
		int docu = entrada.nextInt();
		
		Empleado e= this.verificarEmpleado(docu);
		
		if (e != null)
			{System.out.println("\n El Empleado: " + e.darNombre() + " fue eliminado");
			 empleados.remove(e);}
		else {
				System.out.println("\n No existe un Empleado con ese Dni ");
			 }//else
      }//eliminar
	
	public void informarTotalAPagar(){
		float tot = 0;
		for (Empleado e: empleados)
		{ tot = tot + e.darVentas();}
		System.out.printf  (" Total a Pagar Extras: %.0f " , tot);
	}
	
	public Empleado verificarEmpleado(int docu){
		int i = 0;
		while (i<empleados.size()&& !empleados.get(i).sosDni(docu))
			i++;
		if(i<empleados.size())
			{
			return empleados.get(i);}
		else
			{return null;}
		}
	//modificar empleado
	public void modificarSueldo(){
		Scanner entrada= new Scanner (System.in);
		System.out.print("\nIngrese DNI");
		int doc=entrada.nextInt();
		
		Empleado e = this.verificarEmpleado(doc);
		if(e!=null){
			System.out.print("\n Sueldo actual: " + e.darSueldo());
			System.out.print("\n Ingrese nuevo sueldo: " );
			float nuevo=entrada.nextFloat();
			e.nuevoSueldo(nuevo);
		}
	}
	
}//clase 





