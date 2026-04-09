package Day7.fileHandling;

import java.io.*;

public class FileReadWrite {
    public  static void writeFile(File f){
        try(BufferedWriter out = new BufferedWriter(new FileWriter(f))){
            String data  = "This is using characters";
            out.write(data);
            out.flush();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }

    public static void readFile(File f){
        try(BufferedReader in = new BufferedReader(new FileReader(f))){
            String line = "";
            while((line = in.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }

    public static void main(String [] args){
        File f = new File("three.txt");
        writeFile(f);
        readFile(f);
    }
}
