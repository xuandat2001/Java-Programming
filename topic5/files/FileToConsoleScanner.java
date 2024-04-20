package topic5.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FileToConsoleScanner
{
   public static void main(String[] args)
   {
      final String SOURCE_FILE = "source.txt";

      // time the file read so we can compare to FileToConsoleBuffered!
      long start = System.nanoTime();

      // create scanner from file stream (can use either a Reader or InputStream)
      try (Scanner sc = new Scanner(//new File(SOURCE_FILE)))
         // an InputStream just just like System.in (look at Scanner constructors in API!)
         new FileInputStream(SOURCE_FILE)))
      {
         while (sc.hasNextLine())
            System.out.println(sc.nextLine());
      }
      
      // since we have a try block might as well catch here rather than throw to console
      catch (FileNotFoundException fnfe)
      {
         System.err.printf("%s: File not found\n", SOURCE_FILE);
      }
      catch (Exception e) 
      {
         System.err.printf("General error");
         System.exit(-1);
      }
      timeLogger(start);
   }

   public static void timeLogger(long start)
   {
      System.out.printf("I/O took %dms", TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start));
   }
}
