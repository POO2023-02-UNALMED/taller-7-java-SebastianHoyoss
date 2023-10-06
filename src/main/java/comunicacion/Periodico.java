package comunicacion;

public class Periodico {
	private String fecha;
	private String primicia;
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
	public String getFecha() {
		return this.fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getPrimicia() {
		return this.primicia;
	}
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
