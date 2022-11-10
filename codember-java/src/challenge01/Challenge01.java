import java.io.File;
import java.net.URL;
import java.util.Scanner;

public class Challenge01 {
    public static void main(String[] args) throws Exception {
        
        URL url = Challenge01.class.getResource("input.txt");
        File input = new File(url.getPath());
        Scanner reader = new Scanner(input);

        int nLine = 0;

        while(reader.hasNextLine()) {
            nLine++; // Contador de lineas o registros
            String lineString = reader.nextLine();
            String[] lineArray = lineString.split(" ");

            // Cuando sea vacío y de tamaño 1 skipearlo
            if (lineArray[0].isEmpty() && lineArray.length == 1) continue;

            
            System.out.println("length: "+lineArray.length);

            // Concatenar array
            String o = "";
            for (String s : lineArray) {
                o += s+" ";
            }
            System.out.println(o);

            /* int fields = 0;
            for (String keyValue : lineArray) {
                //System.out.println(keyValue);
                String[] keyValueArray = keyValue.split(":");
                if (fields)
            } */

            // Limitador de lineas
            if (nLine == 8) break;
        }

        reader.close();
    }
}
