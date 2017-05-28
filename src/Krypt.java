import java.io.*;

/**
 * Created by leca14 on 2016-12-16.
 */

public class Krypt {

    public static void main(String[] args) throws IOException {
        File keyFile = new File("C:\\Users\\leca14\\Documents\\key.txt");
        File inFile = new File("C:\\Users\\leca14\\Documents\\tidsplan.txt");
        File outFile = new File ("C:\\Users\\leca14\\Documents\\cripted.txt");


        try {
            FileReader fr = new FileReader(outFile);
            BufferedReader reader = new BufferedReader(fr);
            String line;
//            while ((line = reader.readLine()) != null) {
  //              System.out.println(line);
   //         }
        } catch (FileNotFoundException e1) {
            System.out.println("File not found!");
        }
        catch (IOException e2){
            System.out.println(e2);
        }

        FileReader opn = new FileReader(inFile);
        FileWriter clsd = new FileWriter(outFile);
        FileReader key = new FileReader(keyFile);
        int let = 0;
        BufferedReader line = new BufferedReader(opn);
        BufferedReader crypt = new BufferedReader(key);
        PrintWriter write = new PrintWriter(clsd);
        String row = line.readLine();
        String keyChar = crypt.readLine();
        while (row != null){
            while (keyChar.length()<row.length()) {
                keyChar += keyChar;
            }
            while (let < row.length()) {
                char m = row.charAt(let);
                char k = keyChar.charAt(let);
                char crypted = (char) (m ^ k);
                if (crypted < 32) {
                    System.out.println("There is a problem! " + let);

                }
                write.print(crypted);
                let ++;
            }
            write.print("\n");
            row = line.readLine();

            let = 0;
        }
        line.close();
        crypt.close();
        write.close();
        System.out.print("Kryptering klar");

    }

    }
