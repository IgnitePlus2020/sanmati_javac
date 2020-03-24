package src.com.tgt.igniteplus;
import java.io.FileOutputStream;
import java.io.IOException;

public class writefile {
    public static void main(String[] args) {
        try
        {
            FileOutputStream ostream = new FileOutputStream("file1.txt");
            String str="Avengers Assemble";
            byte b[]=str.getBytes();//converting string into byte array
            ostream.write(b);
            ostream.close();
            System.out.println("File has been written into successfully");
        }
        catch(IOException e)
        {
            System.out.println("Some error occured");
        }
    }
}
