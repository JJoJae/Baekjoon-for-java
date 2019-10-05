import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

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
            String strFirstNumber  = br.readLine();
            String strSecondNumber = br.readLine();

            if((Integer.parseInt(strFirstNumber)  >= 100 && Integer.parseInt(strFirstNumber) <= 999) ||
               (Integer.parseInt(strSecondNumber) >= 100 && Integer.parseInt(strSecondNumber) <= 999))
            {
                int nThirdNumber  = Integer.parseInt(strFirstNumber)  * (Integer.parseInt(strSecondNumber) % 10);
                int nFourthNumber = Integer.parseInt(strFirstNumber)  * ((Integer.parseInt(strSecondNumber) / 10) % 10);
                int nFifthdNumber = Integer.parseInt(strFirstNumber)  * (Integer.parseInt(strSecondNumber) / 100);
                int nSixthdNumber = (nFifthdNumber * 100) + (nFourthNumber * 10) + nThirdNumber;

                bw.write(nThirdNumber  + "\n");
                bw.write(nFourthNumber + "\n");
                bw.write(nFifthdNumber + "\n");
                bw.write(nSixthdNumber + "\n");
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