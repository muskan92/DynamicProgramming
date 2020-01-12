import java.io.BufferedReader;
        import java.io.BufferedWriter;
        import java.io.File;
        import java.io.FileReader;
        import java.io.FileWriter;
        import java.io.IOException;

public class CreateInsertScript {

    public static void main(String[] args) throws IOException {
        String str = "INSERT INTO [dbo].[MessageMapping] ([SymbolicName],[EventCode],[OldMessageID],[NewMessageID]) VALUES (xSNx,xECx,xOMIx ,xNMIx);";

        // read from the text input file
        File file = new File("D:\\Test\\abc.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        FileWriter writer = new FileWriter("D:\\Test\\abcWrite.txt");
        BufferedWriter bw = new BufferedWriter(writer);

        String st;
        while ((st = br.readLine()) != null) {
            String tempSt = st;
            String resultStr = str;
            String[] insertData = tempSt.split("\t");
            resultStr = resultStr.replace("xSNx", "'" + insertData[0] + "'").replace("xECx", "'" + insertData[3] + "'")
                    .replace("xOMIx", insertData[1]).replace("xNMIx", insertData[2]);
            bw.write(resultStr);
            bw.write("\n");
            System.out.println(resultStr);

        }
        bw.close();
    }

}