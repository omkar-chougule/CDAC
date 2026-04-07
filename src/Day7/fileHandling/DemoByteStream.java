package Day7.fileHandling;

import java.io.*;

public class DemoByteStream {
    public static void readFile(File f){
        try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(f))){
            byte [] data = new byte[in.available()];
            while (in.read(data) != -1){
                System.out.println(new String(data));
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }

    public static void writeFile(File f){
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(f))){
            String s = "This is using byte stream";
            byte [] data = s.getBytes();
            out.write(data);
            out.flush();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }

    public static void main(String args []) {
        File f = new File("two.txt");
        writeFile(f);
        readFile(f);

    }
}
