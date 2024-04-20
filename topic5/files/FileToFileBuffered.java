package topic5.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

//original author unknown, modified by Caspar
public class FileToFileBuffered
{
   public static void main(String[] args)
   {
      long start = System.nanoTime();
      
      final String SOURCE_FILE =  "source.txt";
      final String DEST_FILE = "dest.txt";

      // open source and destination
      try (BufferedReader reader = new BufferedReader(new FileReader(SOURCE_FILE));
         PrintStream ps = new PrintStream(new FileOutputStream(DEST_FILE)))
      {
         String line;
         // loop until end of source file
         while ((line = reader.readLine()) != null)
            ps.println(line); // copy line to destination file
      }
      // since we have a try block might as well catch here rather than throw to console
      catch (FileNotFoundException fnfe)
      {
         System.err.printf("%s: File not found\n", SOURCE_FILE);
      }
      catch (IOException ioe)
      {
         System.err.println("IOException");
      }
      FileToConsoleScanner.timeLogger(start);
   }
}
