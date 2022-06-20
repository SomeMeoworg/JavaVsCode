import java.io.*;
import java.util.*;

public class number2column {
    public static void main(String[] args) throws Exception {
        FileReader fw = new FileReader("num2goals.txt");
        BufferedReader br = new BufferedReader(fw);

        String line = null;
        System.out.println("Output after column1 + column2");

        while((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            String name = st.nextToken();
            int c1 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());

            int sum = c1+c2;
            System.out.println(name + " " + sum);
        }
        br.close();
    }
}
