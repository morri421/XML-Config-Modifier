import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Takes a button click input and replaces the value of the xml node with the
 * value of the button.
 */
public class XMLFileModifier {

	public void changeXMLNode(String button) {

		// Looks for the local path of a configuration file
		// Should probably be refactored with try with resources
		try {
			String filepath = "C:\\Program Files (x86)\\Thomson Reuters\\Onvio Link\\OnvioManager.exe.config";
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance(); // Creates a factory that will
																						// allow me to create a parser
																						// from an XML doc
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(filepath);

			// Should be refactored to get the staff element by tag name directly
			NodeList keyList = doc.getElementsByTagName("add");
			Node Keynode = keyList.item(19); // Every config file is structured the same
			Element fstElmnt = (Element) Keynode;
			fstElmnt.setAttribute("value", button);// set the value of new edited ip here, pulls from button click
			String newNodeValue = fstElmnt.getAttribute("value");
			System.out.println(newNodeValue);

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(filepath));
			transformer.transform(source, result);

			System.out.println("Done");

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (SAXException sae) {
			sae.printStackTrace();
		}
	}
}