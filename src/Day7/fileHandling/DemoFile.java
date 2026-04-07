package Day7.fileHandling;

import java.io.File;
import java.io.IOException;

public class DemoFile {
    public static void main(String [] args){
        File f = new File("one.txt");
        if(f.exists())
            System.out.println("File Available");
        else {
            try {
                f.createNewFile();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("Name :" + f.getName());
        System.out.println("Path :" + f.getAbsolutePath());
        System.out.println("Length :" + f.length());
        System.out.println("Read :" + f.canRead());
        System.out.println("Write : " + f.canWrite());
        System.out.println("Execute : " + f.canExecute());
        System.out.println("Is File : " + f.isFile());
        System.out.println("Is dir :" + f.isDirectory());
    }

}
