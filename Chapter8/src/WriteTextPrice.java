import java.io.*;
import java.util.Scanner;

public class WriteTextPrice {
    public static void main(String[] args)throws Exception
    {
        Scanner in = new Scanner(System.in);
        
        FileWriter fWriter = new FileWriter("Food.txt", true);
        BufferedWriter bfwriter = new BufferedWriter (fWriter);
        PrintWriter printWriter = new PrintWriter(bfwriter);

        System.out.println("Enter product : ");
        String product = in.nextLine();
        System.out.println("Enter product price : ");
        double price = in.nextDouble();

        printWriter.println(product +"  " + "  RM" +price);

        printWriter.close();
    }
}
