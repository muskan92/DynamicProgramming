import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CreateHashMapOfFile {

    public static void main(String[] args) throws IOException {

        // read from the text input file
        File file = new File("D:\\Test\\abc.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        Map<String,String> map= new HashMap<String,String>();
        String st;
        while ((st = br.readLine()) != null) {
            String tempSt = st;
            String[] insertId = tempSt.split("\t");

            String oldId = insertId[3]+insertId[1];
            String newId = insertId[3]+insertId[2];

            map.put(oldId,newId);

            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "  " + entry.getValue());
            }

        }
    }

}
