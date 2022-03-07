package modelo.entidad;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="participante")
public class Participante {
	
	private String nombreParticipante;
	private String tipoMusica;
	private int edad;
	
	//Métodos contructor completo y vacío
	public Participante(String nombreParticipante, String tipoMusica, int edad) {
		super();
		this.nombreParticipante = nombreParticipante;
		this.tipoMusica = tipoMusica;
		this.edad = edad;
	}
		public Participante() {
	}
		
	//Getters&Setters
	public String getNombreParticipante() {
		return nombreParticipante;
	}
	public void setNombreParticipante(String nombreParticipante) {
		this.nombreParticipante = nombreParticipante;
	}
	public String getTipoMusica() {
		return tipoMusica;
	}
	public void setTipoMusica(String tipoMusica) {
		this.tipoMusica = tipoMusica;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	//Método toString
	@Override
	public String toString() {
		return "Participante [nombreParticipante=" + nombreParticipante + ", tipoMusica=" + tipoMusica + ", edad="
				+ edad + "]";
	}
	
	
	
	
	
	
	
	

}
