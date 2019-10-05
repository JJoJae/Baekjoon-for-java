import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main
{
    public static void main(String arg[])
    {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try 
        {
            String strA = "강한친구 대한육군";
            bw.write(strA + "\n" + strA + "\n");
            bw.flush();
            bw.close();
        } catch (Exception e) 
        {
            //TODO: handle exception
            e.printStackTrace();
        }

    }
}