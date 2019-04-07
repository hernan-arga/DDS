package tests;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import excepciones.MaterialInconsistente;
import dominio.*;

public class Prendas {
	Borrador borrador;

	@Rule
	public ExpectedException excepcion = ExpectedException.none();

	@Before
	public void init() {
		borrador = new Borrador();
	}

	@Test
	public void fallaAlNoDeclararColorPrimario() throws MaterialInconsistente {
		
		excepcion.expect(NullPointerException.class);
		excepcion.expectMessage("Se requiere un color primario");
		
		borrador.definirTipo(Tipo.ZAPATO);
		borrador.definirMaterial(Material.CUERO);
		borrador.definirTrama(Trama.CUADROS);
		// borrador.definirColorPrimario(new Color(122,22,22));
		borrador.crearPrenda();

	}

	// @Test(expected = NullPointerException.class);

}
