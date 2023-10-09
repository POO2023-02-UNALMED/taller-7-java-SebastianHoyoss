package comunicacion;


public class Tesis extends Escrito {
	private String idea;
	public static String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen,String titulo,String autor,int paginas, String idea,String[] argumentos ,String conclusion, String referencias,String inter) {
		super(origen,titulo,autor,paginas);
		this.idea=idea;
		Tesis.argumentos=argumentos;
		this.interpretacion=inter;
		this.conclusion=conclusion;
		this.referencias=referencias;
	}
	
	public int palabrasTotales(int palabrasPorPagina) {
		return this.getPaginas()*palabrasPorPagina*5;
	}
	public String interpretacion() {
		return this.interpretacion;
	}
	public String toString() {
		return this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+this.getPaginas()+"\n"+this.getIdea()+"\n"+Tesis.getArgumentos().length+"\n"+this.getConclusion()+"\n"+this.getReferencias();
	}
	public String getIdea() {
		return idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
	public static String[] getArgumentos() {
		return argumentos;
	}
	public static void setArgumentos(String[] argumentos) {
		Tesis.argumentos = argumentos;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public String getReferencias() {
		return referencias;
	}
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	
}
