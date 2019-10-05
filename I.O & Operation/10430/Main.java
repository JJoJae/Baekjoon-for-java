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

            if((Integer.parseInt(arrA[0]) >= 2 && Integer.parseInt(arrA[0]) <= 10000) ||
               (Integer.parseInt(arrA[1]) >= 2 && Integer.parseInt(arrA[1]) <= 10000) ||
               (Integer.parseInt(arrA[2]) >= 2 && Integer.parseInt(arrA[2]) <= 10000))
            {
                int nA = Integer.parseInt(arrA[0]);
                int nB = Integer.parseInt(arrA[1]);
                int nC = Integer.parseInt(arrA[2]);
                bw.write((nA + nB) % nC + "\n");
                bw.write(((nA % nC) + (nB % nC)) % nC + "\n");
                bw.write((nA * nB) % nC + "\n");
                bw.write(((nA % nC) * (nB % nC)) % nC + "\n");
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