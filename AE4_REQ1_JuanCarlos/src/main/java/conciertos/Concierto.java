package conciertos;

import java.util.List;

//Anotación XMLRootElement
@XmlRootElement 
public class Concierto {
	
	//Atributos de la clase Concierto
	private String fecha;
	private String hora;
	private List<Participante> participantes;
	
	//Métodos contructores completo y vacío
	public Concierto(String fecha, String hora, List<Participante> participantes) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.participantes = participantes;
	}
	public Concierto() {
		super();
	}

	//Getters&Setters
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}

	public List<Participante> getParticipantes(String string, String string2) {
		return participantes;
	}
	public void setParticipantes(List<Participante> participantes) {
		this.participantes = participantes;
	}

	//Método toString
	@Override
	public String toString() {
		return "Concierto [fecha=" + fecha + ", hora=" + hora + ", participantes=" + participantes + "]";
	}

}
