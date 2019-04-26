package par1.cerveceria.entidades;

import java.util.ArrayList;

public class Cervecera {

	private static final double PRECIO_BOTELLITA = 80.0;
	private static final double PRECIO_LITRO = 160.0;
	private ArrayList<Contenedor> deposito;

	// DESCOMENTAR Y COMPLETAR
	// private Refrigerador<...> refrigeradorEnvasados;
	// private Refrigerador<...> refrigeradorSueltos;
	
	
	// FALTAN ATRIBUTOS, COMPLETAR
	// ALGUNOS COMENTARIOS

	public Cervecera() {
		// completar
	}
	
	/**
	 * Guarda el barril en el refrigerador que corresponda.
	 * @param sabor
	 */
	public void agregarBarril(Sabor sabor) {
		// completar
	}

	/**
	 * Guarda el cajon en el refrigerador que corresponda
	 * @param sabor
	 */
	public void agregarCajon(Sabor sabor) {
		// completar
	}

	/**
	 * Se usa para vender botellitas. No olvides chequear el stock al terminar la venta.
	 * @param sabor
	 * @return
	 */
	public EnvaseCerveza vender(Sabor sabor) {
		EnvaseCerveza botellita = null;
		// completar
		return botellita;
	}

	/**
	 * Se usa para vender cerveza suelta en garrafas. No olvides chequear el stock al terminar la venta.
	 * @param capacidad
	 * @param sabor
	 * @return
	 */
	public EnvaseCerveza vender(Medida capacidad, Sabor sabor) {
		EnvaseCerveza envase = null;
		// completar
		return envase;
	}

	/**
	 * Lista los sabores disponibles de cerveza suelta o preenvasada
	 */
	public void listarDisponibles() {
		// completar
	}

	public double getPrecioLitro() {
		return PRECIO_LITRO;
	}

	public double getPrecioUnidad() {
		return PRECIO_BOTELLITA;
	}

	/**
	 * Lista la reposicion a partir de lo que haya vacio en deposito.
	 */
	private void listarReposicion() {
		System.out.println("-- Reposiciones --");
		if (deposito.isEmpty()) {
			System.out.println("No hay nada que reponer.");
		} else {
			// completar
		}
	}

	/**
	 * Lista la cantidad de unidades vendidas de cada sabor.
	 */
	private void listarUnidadesVendidasPorSabor() {
		System.out.println("-- Unidades vendidas por sabor --");
		// completar
	}

	public void cerrarDia() {
		System.out.println("** Cierre del dia **");
		listarReposicion();
		listarUnidadesVendidasPorSabor();
	}

}