package pruebas;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import modelo.entidad.Concierto;
import modelo.entidad.Participante;

public class ObjetoAXML {
	
	public static void main (String[]args){
		
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
		
		Marshaller m;
		
		try {
			m = contexto.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			Concierto weekendFest = new Concierto();
			
			weekendFest.setNombreConcierto("Weekend Festival 2022");
			weekendFest.setCapacidad(2500);
			weekendFest.setFecha("08-septiembre-2022");
			
			Participante p1 = new Participante("Manolo","Salsa",56);
			Participante p2 = new Participante("Alex","Techno",56);
			Participante p3 = new Participante("Rosa","Rap",56);
			Participante p4 = new Participante("Maria","Ópera",56);
			Participante p5 = new Participante("Jose","Pop",56);

			weekendFest.getParticipantes().add(p1);
			weekendFest.getParticipantes().add(p2);
			weekendFest.getParticipantes().add(p3);
			weekendFest.getParticipantes().add(p4);
			weekendFest.getParticipantes().add(p5);
			
			m.marshal(weekendFest, new File("conciertoWeekendFest.xml"));
			} catch (JAXBException e) {
				System.out.println("Error al crear archivo XML");
				System.out.println(e.getMessage());
				e.printStackTrace();
				return;
			}
		}
}
