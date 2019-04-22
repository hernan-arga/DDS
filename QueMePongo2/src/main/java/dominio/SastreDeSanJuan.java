package dominio;

public class SastreDeSanJuan implements Sastre {

	@Override
	public Prenda parteSuperior() {
		return new Prenda(Tipo.CHOMBA, new Color(0, 255, 0), null, Trama.LISA, Material.ALGODON);
	}

	@Override
	public Prenda parteInferior() {
		return new Prenda(Tipo.PANTALON, new Color(195, 195, 195), null, Trama.LISA, Material.JEAN);
	}

	@Override
	public Prenda calzado() {
		return new Prenda(Tipo.ZAPATO, new Color(255, 255, 255), null, Trama.LISA, Material.GOMA);
	}

}
