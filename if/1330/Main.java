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
            String strNumber  = br.readLine();
            String arrNumber[] = strNumber.split(" ");

            if((Integer.parseInt(arrNumber[0]) >= -10000 && Integer.parseInt(arrNumber[0]) <= 10000) ||
               (Integer.parseInt(arrNumber[1]) >= -10000 && Integer.parseInt(arrNumber[1]) <= 10000))
            {
                if(Integer.parseInt(arrNumber[0]) > Integer.parseInt(arrNumber[1]))
                {
                    bw.write(">\n");
                }
                else if(Integer.parseInt(arrNumber[0]) < Integer.parseInt(arrNumber[1]))
                {
                    bw.write("<\n");
                }
                else
                {
                    bw.write("==\n");
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