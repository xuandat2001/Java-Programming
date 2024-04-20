package topic5.files;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReadStudentInfoTextFile
{
   // for something different we will just throw any exceptions to the console
   // especially since we throw our own exception for invalid file format
   public static void main(String[] args) throws IOException
   {
	  // lec.txt
      System.out.println("Name of file to read from : ");
      // a try without a catch!
      try (Scanner sc = new Scanner(System.in); 
    	 Scanner fileSc = new Scanner(new FileReader(sc.nextLine())))
      {
         System.out.println("Name\t Address\t Age");
         // could have used Scanner but let's do another approach!
         while (fileSc.hasNextLine())
         {
            // see StreamTokenizer class as well
            StringTokenizer inReader = new StringTokenizer(fileSc.nextLine(), "\t");
            if (inReader.countTokens() != 3)
               // let the client handle it!
               throw new IOException("Invalid Input Format");
            else
            {
               String name = inReader.nextToken();
               String address = inReader.nextToken();
               // NOTE: this could fail if the file is corrupt/invalid
               int age = Integer.parseInt(inReader.nextToken());
               System.out.printf("%s\t%s\t%d\n", name, address, age);
            }
         }
      }
   }
}
