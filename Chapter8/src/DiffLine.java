import java.io.*;
import java.util.*;

public class DiffLine {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("quiz2line.txt");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        while (line != null) {
            String line2 = br.readLine();
            StringTokenizer st = new StringTokenizer(line2, ":");
            String jl1 = st.nextToken();
            String jl2 = st.nextToken();
            String jl3 = st.nextToken();

            if (line.equalsIgnoreCase("1.Ibu negeri Perak"))
            {
                System.out.println(line);
                System.out.println(jl1);
            }
            if (line.equalsIgnoreCase("2.Selepas hari Rabu"))
            {
                System.out.println(line);
                System.out.println(jl2);
            }
            line = br.readLine();
        }
        br.close();
    }
}
