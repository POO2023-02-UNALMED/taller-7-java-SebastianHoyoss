package comunicacion;

import java.util.ArrayList;

public class Tesis {
	private String idea;
	private ArrayList<String> argumentos= new ArrayList<String>();
	private String conclusion;
	private String referencias;
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
	public String getIdea() {
		return idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
	public ArrayList<String> getArgumentos() {
		return this.argumentos;
	}
	public void setArgumentos(ArrayList<String> argumentos) {
		this.argumentos = argumentos;
	}
	public String getConclusion() {
		return this.conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public String getReferencias() {
		return this.referencias;
	}
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
