package modelo.entidad;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="concierto")
@XmlType(propOrder = {
		"nombreConcierto",
	    "capacidad",
	    "fecha",
	    "participantes"})
public class Concierto {
	
	private String nombreConcierto;
	private int capacidad;
	private String fecha;
	private List<Participante> participantes;
	
	//Métodos constructores completo y vacio
	public Concierto(String nombreConcierto, int capacidad, String fecha, List<Participante> participantes) {
		super();
		this.nombreConcierto = nombreConcierto;
		this.capacidad = capacidad;
		this.fecha = fecha;
		this.participantes = participantes;
	}	
		public Concierto() {
	}
		
	//Getters&Setters
	public String getNombreConcierto() {
		return nombreConcierto;
	}
	public void setNombreConcierto(String nombreConcierto) {
		this.nombreConcierto = nombreConcierto;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public List<Participante> getParticipantes() {
		return participantes;
	}
	public void setParticipantes(List<Participante> participantes) {
		this.participantes = participantes;
	}

	//Método toString
	@Override
	public String toString() {
		return "Concierto [nombreConcierto=" + nombreConcierto + ", capacidad=" + capacidad + ", fecha=" + fecha
				+ ", participantes=" + participantes + "]";
	}	
}
