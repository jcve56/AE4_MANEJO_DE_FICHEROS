package conciertos;

//Anotaci�n XLMRootElement 
@XmlRootElement 
public class Participante {
	
	//Atributos de la clase Participante
	private String entrada;
	private String grupo;
	
	//M�todo contructor completo y vac�o
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
	
	//M�todo toString
	@Override
	public String toString() {
		return "Participante [entrada=" + entrada + ", grupo=" + grupo + "]";
	}

}
