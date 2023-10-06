package comunicacion;
import java.util.ArrayList; 
public class Alfabeto {
	private ArrayList<String> letras= new ArrayList<String>();
	private String interpretacion;
	
	
	public int cantidadLetras() {
		return 1;
	}
	public String interpretacion() {
		return "";
	}
	public String toString() {
		return "";
	}
	public ArrayList<String> getLetras() {
		return this.letras;
	}
	public void setLetras(ArrayList<String> letras) {
		this.letras = letras;
	}
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
