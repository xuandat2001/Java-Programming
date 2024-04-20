package topic5.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileToConsoleNotBuffered
{
   public static void main(String[] args) throws IOException // from reader.readLine()
   {
      final String SOURCE_FILE = "source.txt";
      long start = System.nanoTime();

      // use unbuffered InputStream instead of Scanner
      try (InputStream stream = new FileInputStream(SOURCE_FILE))
      {
         int next;
         while ((next = stream.read()) != -1)
            System.out.print((char) next);
      }
      // since we have a try block might as well catch here rather than throw to console
      catch (FileNotFoundException fnfe)
      {
         System.err.printf("%s: File not found\n", SOURCE_FILE);
      }
      FileToConsoleScanner.timeLogger(start);
   }
}
