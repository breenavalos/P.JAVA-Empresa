import java.util.Scanner;
public class Ejecutora {
	public static void main (String args[]){
		Scanner entrada = new Scanner(System.in);
		entrada.useDelimiter(System.getProperty("line.separator"));
		System.out.print("\nIngrese Nombre de la Empresa:");
		String nombre = entrada.next();
		System.out.print("\nIngrese Direccion de la Empresa:");
		String direc = entrada.next();
		Empresa e = new Empresa (nombre, direc);
		byte opc = 0;
		do {
			System.out.println ("");
			System.out.println("\n              Empresa: " + e.darNombre() + "  " + e.darDireccion());
			System.out.println("\nIngrese: 1- Agregar Empleado: ");
			System.out.println("Ingrese: 2- Eliminar Empleado: ");
			System.out.println("Ingrese: 3- Listar Sueldo Empleados: ");
			System.out.println("Ingrese: 4- Informar Total a Pagar en Concepto de Ventas: ");
			System.out.println("Ingrese: 5- Modificar Sueldo: ");
			System.out.println("Ingrese: 0- Salir");
			System.out.print("\nIngrese opc:");
			opc = entrada.nextByte();
			switch (opc) {
		case 1: {
			e.agregarEmpleado();
		}break;
		case 2: {
			e.eliminarEmpleado();
		}break;
		case 3:{
			e.listarempleados();	
		}break;
		case 4:{
			e.informarTotalAPagar();	
		}break;
		case 5:{
			e.modificarSueldo();
		}break;
}
		}
		while (opc !=0);
		}
		}

