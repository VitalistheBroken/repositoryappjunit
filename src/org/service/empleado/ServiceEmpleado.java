package org.service.empleado;

public class ServiceEmpleado {
	
	public double salarioBonoEmpleado(double salario, double bono) {
		return salario+bono;
	}
	
	public double salarioPrestamoEmpleado(double salario, double prestamo) {
		return salario-prestamo;
	}

}
