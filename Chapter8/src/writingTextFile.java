import java.io.*;
import java.util.*;

public class writingTextFile
{
public static void main(String[] args) throws IOException
{
    try{
        String studName,facName;
        int id;

        Scanner sc = new Scanner(System.in);

        FileWriter fw = new FileWriter("studentData.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        for(int i=0;i<2; i++)
        {
            int total = i+1;
            System.out.println("Student "+total+" Information");
            System.out.println("Enter a student name : ");
            studName = sc.next();
            System.out.println("Enter a student id : ");
            id = sc.nextInt();
            System.out.println("Enter a faculty name : ");
            facName = sc.next();

            Student stud = new Student(studName,id,facName);
            pw.println(stud.toString());
        }
        System.out.println("Your data has been saved into text file");
        pw.close();
    }
    catch(FileNotFoundException fnf)
    {
        System.out.print("File not Found!!!");
    }catch(EOFException ex)
    {
        System.out.println("End of file Error!!!");
    }catch(IOException io)
    {
        System.out.print("Wrong input!!!");
    }catch(Exception nf)
    {
        System.out.print("System ends here.");
    }
}
}
