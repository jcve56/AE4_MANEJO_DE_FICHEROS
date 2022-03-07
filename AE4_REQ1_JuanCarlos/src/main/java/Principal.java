import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import conciertos.Concierto;


public class Principal {

	public static void main(String[] args) {
		//JAXBContext se va a encargar de recoger el objeto para convertirlo a XML.
		JAXBContext contexto;
		try {
			//Se crea una instancia sobre contexto, referenciada a la clase que queremos convertir a XML.
			contexto = JAXBContext.newInstance(Concierto.class);
		} catch (JAXBException e) {
			System.out.println("Error creando el contexto");
			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
		}
		//Marchaller va a ser un objeto que nos ayudara a serializar (convertir a XML) nuestra clase.
		Marshaller m;
		try {
			//Añadimos el contexto que queremos serializar al objeto anterior.
			m=contexto.createMarshaller();
			//Simplemente ordena/tabula el texto
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			//Creacion de un Concierto y relleno de información del mismo.
			Concierto concierto1 = new Concierto();
			concierto1.setFecha("20-oct-2018");
			concierto1.setHora("21:30");
			//Añadiendo participantes con sus datos a Concierto.
			concierto1.getParticipantes("21:30", "Las Ardillas de Dakota");
			concierto1.getParticipantes("22:15", "Fito y Fitipaldis");
			concierto1.getParticipantes("23:00", "Coldplay");
			//Devolucion de resultados en consola/pantalla y en un archivo XML llamado concierto.
			m.marshal(concierto1, System.out);
			m.marshal(concierto1, new File("concierto.xml"));
			
			System.out.println("El archivo concierto.xml ha sido creado con éxito");
		} catch (JAXBException e) {
			System.out.println("Error convertiendo el objeto a formato XML");
			e.printStackTrace();
		}
			
	}

}
