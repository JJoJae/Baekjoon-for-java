import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

public class Main 
{
    public static void main(String[] args) 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try 
        {
            String strS = br.readLine();
            String arrA[] = strS.split(" ");

            if((Integer.parseInt(arrA[0]) > 0 && Integer.parseInt(arrA[0]) < 10) ||
               (Integer.parseInt(arrA[1]) > 0 && Integer.parseInt(arrA[1]) < 10))
            {
                bw.write(Integer.parseInt(arrA[0]) - Integer.parseInt(arrA[1]) + "\n");
                bw.flush();
                bw.close();
            }
        } catch (Exception e) 
        {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
    
}