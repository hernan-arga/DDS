package dominio;

public class Prenda {
	Tipo tipo;
	Color colorPrimario;
	Color colorSecundario;
	Trama trama;
	Material material;

	public Prenda(Tipo tipo, Color colorPrimario, Trama trama, Material material) {
		this.tipo = tipo;
		this.colorPrimario = colorPrimario;
		this.trama = trama;
		this.material = material;
	}

	public void setColorSecundario(Color colorSecundario) {
		this.colorSecundario = colorSecundario;
	}

	public Categoria categoria() {
		return tipo.categoria();
	}
}
