/**
 * Created by leca14 on 2016-12-16.
 */
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class fileWrite {
    public static void main(String[] args) throws IOException {

        File keyFile = new File("C:\\Users\\leca14\\Documents\\key.txt");
        File inFile = new File("C:\\Users\\leca14\\Documents\\tidsplan.txt");


        try {
            BufferedReader reader = new BufferedReader(new FileReader(inFile));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

            }
        }
            catch(FileNotFoundException e1) {
                    System.out.println("File not found!");
            }

       /* FileWriter fw = new FileWriter(fileWrite, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter utFil = new PrintWriter(bw);
        String msg;
        Scanner in = new Scanner(System.in);
        msg = in.nextLine();
        utFil.println(msg);

        utFil.close(); {
            System.out.println("File closed!"); */


    }

}



