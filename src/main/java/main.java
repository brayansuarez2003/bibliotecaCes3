
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import models.libreria;
import java.io.*;
import java.util.List;

public class main {

    public main(){

    }
    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new XmlMapper();
            InputStream inputStream = new FileInputStream(new File("src\\resources\\libreria.xml"));
            TypeReference<List<libreria>> typeReference = new TypeReference<List<libreria>>(){};

            List<libreria> libros = mapper.readValue(inputStream, typeReference);
            System.out.println("cool");
            for (libreria libro:libros) {
                System.out.println(libro.getLibro());

            }
        }catch(IOException e){
            System.out.println("mi error: "+e.getMessage());
            e.printStackTrace();
        }

    }
}
