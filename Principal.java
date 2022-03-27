package Ejercicio1;

public class Principal {
	
	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado("Rodrigo", 26);
		System.out.println(emp1.toString());
		
		Empleado emp2 = new Empleado();
		System.out.println(emp2.toString());
		
		
		Empleado emp3 = new Empleado();
		System.out.println(emp3.toString());
		
		Empleado emp4 = new Empleado("Ignacio", 27);
		System.out.println(emp4.toString());
		
		Empleado emp5 = new Empleado("Camila", 22);
		System.out.println(emp5.toString());
		
		System.out.println("El proximo ID sera " + Empleado.devuelveProximoID());
	}

}
