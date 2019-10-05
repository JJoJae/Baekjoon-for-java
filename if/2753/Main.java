import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Main
 */
public class Main 
{

    public static void main(String[] args) 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try 
        {
            String strYear = br.readLine();
            int nYear = Integer.parseInt(strYear);

            if(nYear >= 1 && nYear <= 4000)
            {
                if((nYear % 4 == 0) && (nYear % 100 != 0) ||
                   (nYear % 4 == 0) && (nYear % 400 == 0))
                {
                    bw.write("1\n");
                }
                else
                {
                    bw.write("0\n");
                }
                bw.flush();
                bw.close();
            }
        } 
        catch (Exception e) 
        {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}