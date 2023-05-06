
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import models.libreria;
import models.Autor;
import models.Libro;
import java.io.*;
import java.util.List;



public class main {

    public main() {

    }

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new XmlMapper();
            InputStream inputStream = new FileInputStream(new File("src\\resources\\libreria.xml"));
            TypeReference<List<libreria>> typeReference = new TypeReference<List<libreria>>() {};

            List<libreria> librerias = mapper.readValue(inputStream, typeReference);

            for (libreria libro : librerias) {

                if (libro.getNombre() != null && !libro.getNombre().isEmpty()) {
                    System.out.println("Nombre de la librería: " + libro.getNombre());
                }

                List<Autor> autores = libro.getAutor();
                if (autores != null && !autores.isEmpty()) {
                    for (Autor autor : autores) {
                        if (autor.getFotoAutor() != null && !autor.getFotoAutor().isEmpty()) {
                            System.out.println("Foto del autor: " + autor.getFotoAutor());
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("mi error: " + e.getMessage());
            e.printStackTrace();
        }
    }

}

