package dominio;

public class SastreDeJohnson implements Sastre {

	@Override
	public Prenda parteSuperior() {
		return new Prenda(Tipo.CAMISA, new Color(255, 255, 255), null, Trama.LISA, Material.POLIESTER);
	}

	@Override
	public Prenda parteInferior() {
		return new Prenda(Tipo.PANTALON, new Color(0, 0, 0), null, Trama.RAYADA, Material.JEAN);
	}

	@Override
	public Prenda calzado() {
		return new Prenda(Tipo.ZAPATO, new Color(0, 0, 0), null, Trama.LISA, Material.GOMA);
	}

}
