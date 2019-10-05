import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main 
{
    public static void main(String[] args) 
    {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String strA = "44";
            String strB = "jjy456456";
            bw.write(strA + "\n" + strB + "\n");
            bw.flush();
            bw.close();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}