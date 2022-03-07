package conciertos;

//Anotación XLMRootElement 
@XmlRootElement 
public class Participante {
	
	//Atributos de la clase Participante
	private String entrada;
	private String grupo;
	
	//Método contructor completo y vacío
	public Participante(String entrada, String grupo) {
		super();
		this.entrada = entrada;
		this.grupo = grupo;
	}
	public Participante() {
		super();
	}
	
	//Getters&Setters
	public String getEntrada() {
		return entrada;
	}
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	//Método toString
	@Override
	public String toString() {
		return "Participante [entrada=" + entrada + ", grupo=" + grupo + "]";
	}

}
