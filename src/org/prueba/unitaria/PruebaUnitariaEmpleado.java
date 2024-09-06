package org.prueba.unitaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.service.empleado.ServiceEmpleado;

import junit.framework.TestCase;

class PruebaUnitariaEmpleado extends TestCase {
ServiceEmpleado servicioEmpleado = null;
	@Test
	public void test() {
		servicioEmpleado = new ServiceEmpleado();
	}

	@Test
	public void testSalarioEmpleado() {
		test();
		assertTrue(servicioEmpleado.salarioBonoEmpleado(20000.0, 5000.0)==25000.0); 
	}
	
	@Test
	public void testSalarioPrestamoEmpleado() {
		test();
		assertEquals(servicioEmpleado.salarioPrestamoEmpleado(20000.0, 2500.0), 17500.0); 
	}
}
