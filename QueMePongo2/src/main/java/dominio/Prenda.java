package dominio;

public class Prenda {
	Tipo tipo;
	Color colorPrimario;
	Color colorSecundario;
	Trama trama;
	Material material;

	// Esta variable esta puesta para diferenciar entre 2 prendas iguales
	// en parametros pero que son diferentes
	String nombre;

	public Prenda(Tipo tipo, Color colorPrimario, Color colorSecundario, Trama trama, Material material) {
		this.tipo = tipo;
		this.colorPrimario = colorPrimario;
		this.colorSecundario = colorSecundario;
		this.trama = trama;
		this.material = material;
	}

	public Categoria categoria() {
		return tipo.categoria();
	}

	public String getName() {
		return nombre;
	}

	public void setName(String unNombre) {
		this.nombre = unNombre;
	}
}
