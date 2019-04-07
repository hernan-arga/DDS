package dominio;

import java.util.Objects;

import excepciones.MaterialInconsistente;

public class Borrador {
	Tipo tipo;
	Color colorPrimario;
	Color colorSecundario;
	Trama trama = Trama.LISA;
	Material material;

	public void definirTipo(Tipo tipoPrenda) {
		this.tipo = tipoPrenda;
	}

	public void definirColorPrimario(Color colorPrimario) {
		this.colorPrimario = colorPrimario;
	}

	public void definirColorSecundario(Color colorSecundario) {
		this.colorSecundario = colorSecundario;
	}

	public void definirTrama(Trama trama) {
		this.trama = trama;
	}

	public void definirMaterial(Material material) {
		this.material = material;
	}
	
	public Prenda crearPrenda() throws MaterialInconsistente {
		if(tipo.permiteMaterial(material)) {
			Prenda prendaLista = new Prenda(Objects.requireNonNull(tipo, "Se requiere un tipo"), 
					Objects.requireNonNull(colorPrimario, "Se requiere un color primario"), 
					Objects.requireNonNull(trama, "Se requiere una trama"), 
					Objects.requireNonNull(material, "Se requiere un material"));
			prendaLista.setColorSecundario(colorSecundario);
			return prendaLista;
		}
		throw new MaterialInconsistente("El material elegido no es compatible con el tipo de prenda");
	}

}
