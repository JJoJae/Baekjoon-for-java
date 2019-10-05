import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main
{
    public static void main(String arg[])
    {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try 
        {
            String strA = "Hello World!";
            bw.write(strA + "\n");
            bw.flush();
            bw.close();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        
    }
}