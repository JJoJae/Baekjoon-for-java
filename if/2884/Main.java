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
            String strHHMM = br.readLine();
            String arrHHMM[] = strHHMM.split(" ");
            int nHH = Integer.parseInt(arrHHMM[0]);
            int nMM = Integer.parseInt(arrHHMM[1]);

            if((nHH >= 0 && nHH <= 23) &&
               (nMM >= 0 && nMM <= 59))
            {
                if(nMM >= 45)
                {
                    bw.write(nHH + " " + (nMM - 45) + "\n");
                }
                else
                {
                    if(nHH >= 1)
                    {
                        bw.write((nHH - 1) + " " + (nMM + 15) + "\n");
                    }
                    else
                    {
                        bw.write("23 " + (nMM + 15) + "\n");
                    }
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