package tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import excepciones.MaterialInconsistente;
import excepciones.NoHayPrendas;
import dominio.*;

public class Prendas {
	Borrador borrador;

	@Rule
	public ExpectedException excepcion = ExpectedException.none();

	private Guardarropa miGuardarropas;

	@Before
	public void init() throws NoHayPrendas {
		borrador = new Borrador();

		Color negro = new Color(0, 0, 0);
		Color rojo = new Color(255, 0, 0);
		Color blanco = new Color(255, 255, 255);
		Color azul = new Color(0, 0, 255);
		Color verde = new Color(0, 100, 0);
		Color amarillo = new Color(255, 233, 0);
		Prenda unaRemeraDeGreenPeace = new Prenda(Tipo.REMERA, verde, negro, Trama.ESTAMPADO, Material.ALGODON);
		Prenda miPolleraAmarilla = new Prenda(Tipo.POLLERA, amarillo, null, Trama.LISA, Material.ALGODON);
		Prenda zapatosDeGoma = new Prenda(Tipo.ZAPATO, negro, null, Trama.LISA, Material.GOMA);
		Prenda blueJeans = new Prenda(Tipo.PANTALON, azul, null, Trama.CUADROS, Material.JEAN);
		Prenda camisaNegra = new Prenda(Tipo.CAMISA, negro, null, Trama.RAYADA, Material.POLIESTER);
		Prenda zapatosRotos = new Prenda(Tipo.ZAPATO, azul, blanco, Trama.LUNARES, Material.CUERO);
		Prenda anilloDelCapitanBeto = new Prenda(Tipo.ANILLO, rojo, blanco, Trama.ESTAMPADO, Material.ORO);

		unaRemeraDeGreenPeace.setName("unaRemeraDeGreenPeace");
		camisaNegra.setName("camisaNegra");
		zapatosDeGoma.setName("zapatosDeGoma");
		blueJeans.setName("blueJeans");
		miPolleraAmarilla.setName("miPolleraAmarilla");
		camisaNegra.setName("camisaNegra");
		zapatosRotos.setName("zapatosRotos");
		anilloDelCapitanBeto.setName("anilloDelCapitanBeto");

		List<Prenda> superiores = new ArrayList<Prenda>();
		List<Prenda> inferiores = new ArrayList<Prenda>();
		List<Prenda> calzados = new ArrayList<Prenda>();
		List<Prenda> accesorios = new ArrayList<Prenda>();

		superiores.add(unaRemeraDeGreenPeace);
		superiores.add(camisaNegra);
		inferiores.add(miPolleraAmarilla);
		inferiores.add(blueJeans);
		calzados.add(zapatosDeGoma);
		calzados.add(zapatosRotos);
		accesorios.add(anilloDelCapitanBeto);

		miGuardarropas = new Guardarropa(superiores, inferiores, calzados, accesorios);
	}

	@Test
	public void sugerenciaDeUnAtuendo() {
		Atuendo atuendo = miGuardarropas.sugerir();
		System.out.println(atuendo.getSuperior().getName());
		System.out.println(atuendo.getInferior().getName());
		System.out.println(atuendo.getCalzado().getName());
		if(atuendo.getAccesorio()==null) {
			System.out.println("null");
		}
		else {
			System.out.println(atuendo.getAccesorio().getName());
		}
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
