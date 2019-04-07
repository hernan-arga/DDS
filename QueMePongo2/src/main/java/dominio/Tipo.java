package dominio;

import java.util.Arrays;
import java.util.List;

public class Tipo {

	public static final Tipo ZAPATO = new Tipo(Categoria.CALZADO, Arrays.asList(Material.CUERO));
	public static final Tipo REMERA = new Tipo(Categoria.PARTE_SUPERIOR, Arrays.asList(Material.ALGODON, Material.LANA));
	public static final Tipo PANTALON = new Tipo(Categoria.PARTE_INFERIOR, Arrays.asList(Material.JEAN));

	// List<Material> materialesValidados = new ArrayList<>();
	List<Material> materialesValidados;
	Categoria categoria;

	public Tipo(Categoria categoria, List<Material> materiales) {
		this.categoria = categoria;
		this.materialesValidados = materiales;
	}

	public boolean permiteMaterial(Material unMaterial) {
		if (materialesValidados.contains(unMaterial)) {
			return true;
		}
		return false;
	}

	public Categoria categoria() {
		return this.categoria;
	}

}
