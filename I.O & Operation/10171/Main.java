import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main
{
    public static void main(String[] args) 
    {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try 
        {
            String strA = "\\    /\\";
            String strB = " )  ( ')";
            String strC = "(  /  )";
            String strD = " \\(__)|";
            bw.write(strA + "\n" + strB + "\n" + strC + "\n" + strD + "\n");
            bw.flush();
            bw.close();
        } catch (Exception e) 
        {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
    
}