import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Stream;

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
            String strNumber = br.readLine();
            int[] arrNumber = Stream.of(strNumber.split(" ")).mapToInt(Integer::parseInt).toArray();

            if((arrNumber[0] >= 1 && arrNumber[0] <= 100) &&
               (arrNumber[1] >= 1 && arrNumber[1] <= 100) &&
               (arrNumber[2] >= 1 && arrNumber[2] <= 100))
            {
                Arrays.sort(arrNumber);
                bw.write(Integer.toString(arrNumber[1]) + '\n');
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