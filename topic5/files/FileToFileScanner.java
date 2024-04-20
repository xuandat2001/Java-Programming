package topic5.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

//original author unknown, modified by Caspar
public class FileToFileScanner
{
   public static void main(String[] args)
   {
      long start = System.nanoTime();

      final String SOURCE_FILE =  "source.txt";
      final String DEST_FILE = "dest.txt";

      // open source and destination
      try (Scanner sc = new Scanner(new FileInputStream(SOURCE_FILE));
         PrintStream ps = new PrintStream(new File(DEST_FILE)))
      {
         // loop until end of source file
         while (sc.hasNextLine())
            ps.println(sc.nextLine()); // copy line to destination file
      }
      // since we have a try block might as well catch here rather than throw to console
      catch (FileNotFoundException fnfe)
      {
         System.err.printf("%s: File not found\n", SOURCE_FILE);
      }
      FileToConsoleScanner.timeLogger(start);
   }
}
