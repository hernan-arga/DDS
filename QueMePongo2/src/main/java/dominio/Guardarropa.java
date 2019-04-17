package dominio;

import java.util.List;
import java.util.Objects;
import java.util.Random;

import excepciones.NoHayPrendas;

public class Guardarropa {
	List<Prenda> superiores;
	List<Prenda> inferiores;
	List<Prenda> calzados;
	List<Prenda> accesorios;

	Random randomizador = new Random();

	public Guardarropa(List<Prenda> superiores, List<Prenda> inferiores, List<Prenda> calzados, List<Prenda> accesorios)
			throws NoHayPrendas {

		this.superiores = Objects.requireNonNull(superiores, "Se necesita una lista de prendas superiores");

		this.inferiores = Objects.requireNonNull(inferiores, "Se necesita una lista de prendas inferiores");

		this.calzados = Objects.requireNonNull(calzados, "Se necesita una lista de calzados");

		this.accesorios = accesorios;
		this.accesorios.add(null);
	}

	public Atuendo sugerir() {
		Prenda superior = random(superiores);
		Prenda inferior = random(inferiores);
		Prenda calzado = random(calzados);
		Prenda accesorio = random(accesorios);
		return new Atuendo(superior, inferior, calzado, accesorio);
	}

	// No encontre una funcion que me tome un elemento al azar de una lista asi que
	// la cree
	Prenda random(List<Prenda> lista) {
		int posicion = randomizador.nextInt(lista.size());
		return lista.get(posicion);
	}

	private List<Prenda> validarPrendasNoNulas(List<Prenda> unasPrendas, String mensaje) throws NoHayPrendas {
		if (unasPrendas.stream().anyMatch((Prenda prenda) -> prenda == null)) {
			throw new NoHayPrendas(mensaje);
		}
		return unasPrendas;
	}
}
