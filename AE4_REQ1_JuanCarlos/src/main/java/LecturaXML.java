import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class LecturaXML {

	public static void main(String[] args) {
		
		//Instancia para la lectura de documentos XML
		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		DocumentBuilder analizador;
		//NODO Documento
		Document dom;
		//NODO Raíz de Documento
		Node document;
		
		try {
			//Lectura de XML y paso a memoria del mismo
			analizador = fabrica.newDocumentBuilder();
			//Deserializar: Pasar de NODO texto a modelo arbol DOM
			dom = analizador.parse("Concierto.xml");
			document = dom.getDocumentElement();
			System.out.println(document.getTextContent());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
