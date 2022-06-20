import java.io.*;
import java.util.*;

public class Scoreinout
{
    public static void main(String[] args) throws IOException {
        try{
            String name;
            int score1,score2;

            FileReader reader = new FileReader("score.txt");
            BufferedReader br = new BufferedReader(reader);

            FileWriter fw = new FileWriter("scoreout.txt");
            PrintWriter out = new PrintWriter(fw);

            String line = null;

            while((line = br.readLine()) !=null)
            {
                StringTokenizer st = new StringTokenizer(line);
                name = st.nextToken();
                score1 = Integer.parseInt(st.nextToken());
                score2 = Integer.parseInt(st.nextToken());

                int sum = score1 + score2;

               out.println(name+"   "+sum);
            }
            br.close();
            out.close();
        }
        catch(FileNotFoundException fnf)
        {
            System.out.print(fnf.getMessage());
        }catch(EOFException ex)
        {
            System.out.println(ex.getMessage());
        }catch(IOException io)
        {
            System.out.print(io.getMessage());
        }catch(Exception nf)
        {
            System.out.print(nf);
        }
    }
}
