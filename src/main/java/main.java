
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import models.libreria;
import java.io.*;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class main {

    public main(){

    }
    public static void main(String[] args) {
        try {
            File archivo = new File("src\\resources\\libreria.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(archivo);
            doc.getDocumentElement().normalize();

            String nombre = doc.getDocumentElement().getAttribute("nombre");
            String centro = doc.getDocumentElement().getAttribute("centro");
            System.out.println("Nombre: " + nombre);
            System.out.println("Centro: " + centro);

            NodeList libros = doc.getElementsByTagName("libro");
            for (int i = 0; i < libros.getLength(); i++) {
                Element libro = (Element) libros.item(i);
                String anyo = libro.getAttribute("anyo");
                System.out.println("Año: " + anyo);

                Element titulo = (Element) libro.getElementsByTagName("titulo").item(0);
                System.out.println("Título: " + titulo.getTextContent());

                Element editorial = (Element) libro.getElementsByTagName("editorial").item(0);
                System.out.println("Editorial: " + editorial.getTextContent());

                Element precio = (Element) libro.getElementsByTagName("precio").item(0);
                System.out.println("Precio: " + precio.getTextContent());

                NodeList autores = libro.getElementsByTagName("autor");
                for (int j = 0; j < autores.getLength(); j++) {
                    Element autor = (Element) autores.item(j);
                    String fotoAutor = autor.getAttribute("fotoAutor");
                    System.out.println("Foto: " + fotoAutor);

                    Element apellidoAutor = (Element) autor.getElementsByTagName("apellidoAutor").item(0);
                    System.out.println("Apellido: " + apellidoAutor.getTextContent());

                    Element nombreAutor = (Element) autor.getElementsByTagName("nombreAutor").item(0);
                    System.out.println("Nombre: " + nombreAutor.getTextContent());
                }

                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();}

    }
}
