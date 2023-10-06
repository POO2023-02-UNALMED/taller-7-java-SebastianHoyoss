package comunicacion;

public class Libro extends Escrito{
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	

	public int palabrasTotales() {
		return 1;
	}
	public String interpretacion() {
		return "";
	}
	public String toString() {
		return "";
	}
	public String getCo_autor() {
		return this.co_autor;
	}
	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}
	public String getEditorial() {
		return this.editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getEdicion() {
		return this.edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
