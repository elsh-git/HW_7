import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class WriteToFile_singelton {

    public static void main(String[] args) throws IOException {
        GetsInputs hezzy =  GetsInputs.getInstance();
        //System.out.println(GetsInputs.info());
        Path fileName = Path.of("log.txt");
        Files.writeString(fileName, GetsInputs.info());
    }
}