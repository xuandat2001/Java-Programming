package topic5.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class BinaryToTextFile
{
   public static void main(String[] args)
   {
      final String DEST_FILE = "from_binary.txt";

      // open destination file (could have used a PrintStream but use a PrintWriter instead this time)
      try (PrintWriter printWriter = new PrintWriter(new FileOutputStream(DEST_FILE)))
      {
         // PrintStream and PrintWriter have printf method :)
         printWriter.printf("%s\n%d\n%.2f\n", true, 17, 123.45);
      }
      // since we have a try block might as well catch here rather than throw to console
      catch (FileNotFoundException fnfe)
      {
         System.err.printf("%s: File creation error\n", DEST_FILE);
      }
   }
}
