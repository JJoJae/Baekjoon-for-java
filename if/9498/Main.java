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
            String strScore = br.readLine();
            int nScore = Integer.parseInt(strScore);

            if(nScore >= 0 && nScore <= 100)
            {
                if(nScore >= 90 && nScore <= 100)
                {
                    bw.write("A\n");
                }
                else if(nScore >= 80 && nScore <= 89)
                {
                    bw.write("B\n");
                }
                else if(nScore >= 70 && nScore <= 79)
                {
                    bw.write("C\n");
                }
                else if(nScore >= 60 && nScore <= 69)
                {
                    bw.write("D\n");
                }
                else
                {
                    bw.write("F\n");
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