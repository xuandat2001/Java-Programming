package topic5.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;


public class TestSerializeRead
{
   // NOTE: we just throw any exceptions to the console for inspection
   public static void main(String args[]) throws Exception
   {
      // note the use of decorator pattern (ObjectInputStream decorates
      // FileInputStream)
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.dat"));

      // the warning is unavoidable (language/API design issue) but we apply
      // it only to a single line
      @SuppressWarnings("unchecked")
      List<Student> students = (List<Student>) in.readObject();

      in.close();

      for (Student student : students)
         // note implicit call to toString()
         System.out.println(student);
   }
}
