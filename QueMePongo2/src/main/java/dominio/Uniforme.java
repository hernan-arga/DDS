package dominio;

public class Uniforme {
	Prenda superior;
	Prenda inferior;
	Prenda calzado;
	
	public Uniforme(Prenda superior, Prenda inferior, Prenda calzado) {
		this.superior = superior;
		this.inferior = inferior;
		this.calzado = calzado;
	}
	
	public static Uniforme crearUniforme(Sastre unSastre) {
		return new Uniforme(unSastre.parteSuperior(), unSastre.parteInferior(), unSastre.calzado());
		
	}
}
