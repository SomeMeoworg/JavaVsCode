import java.io.*;
import javax.swing.*;
import java.util.*;

public class FileInputOutput2 {
    public static void main(String[] args) throws IOException {
        String inFile = JOptionPane.showInputDialog("Enter input file name : ");
        String outFile = JOptionPane.showInputDialog("Enter Output file name : ");

        try {
            FileReader reader = new FileReader(inFile);
            BufferedReader in = new BufferedReader(reader);

            FileWriter writer = new FileWriter(outFile);
            PrintWriter out = new PrintWriter(writer);

            String inData = null; float total = 0;

            while ((inData = in.readLine()) != null)
            {
                StringTokenizer st = new StringTokenizer(inData, ",");
                String name = st.nextToken();
                String sc = st.nextToken();
                float score = Float.parseFloat(sc);
                String grade = st.nextToken();

                total += score;
                out.println("Name : " + name + "Score : " + score + "Grade : " + grade);
            }
            out.println("Total score : " + total);
            in.close();
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
