package src.com.tgt.igniteplus;

import java.io.*;

public class filecopy {
    public static void main(String[] args) {
        FileInputStream instream = null;
        FileOutputStream outstream = null;

        try
        {
            File infile =new File("file1.txt");
            File outfile =new File("file2.txt");

            instream = new FileInputStream(infile);
            outstream = new FileOutputStream(outfile);

            byte[] buffer = new byte[1024];

            int length;
            while ((length = instream.read(buffer)) > 0){
                outstream.write(buffer, 0, length);
            }

            instream.close();
            outstream.close();

            System.out.println("File copied successfully");

        }
        catch(IOException ioe)
        {
            System.out.println("Some eoor occured");
        }
    }
}
