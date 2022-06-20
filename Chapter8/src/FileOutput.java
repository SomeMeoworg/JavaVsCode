import java.io.*;
import javax.swing.*;
public class FileOutput
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            FileWriter fw1 = new FileWriter("odd.txt");
            FileWriter fw2 = new FileWriter("even.txt");
            BufferedWriter bw1 = new BufferedWriter(fw1);
            BufferedWriter bw2 = new BufferedWriter(fw2);
            PrintWriter pw1 = new PrintWriter(bw1);
            PrintWriter pw2 = new PrintWriter(bw2);

            for (int i = 0; i < 5; i++)
            {
                String num = JOptionPane.showInputDialog("Enter a number :");
                int number = Integer.parseInt(num);

                if (number %2 == 0)
                    pw2.println(number);
                else
                    pw1.println(number);
            }
            JOptionPane.showMessageDialog(null, "Your number has been saved in a text file");

            pw1.close();
            pw2.close();
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
