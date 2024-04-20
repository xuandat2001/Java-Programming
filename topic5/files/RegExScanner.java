package topic5.files;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExScanner {

	public static void main(String[] args) {
		
        Scanner scanner;
        String s = "I love you so much. I want to marry you";
        scanner = new Scanner(s);
        
        // useDelimiter() example
        scanner.useDelimiter("[ .]");
        while (scanner.hasNext()) {
            String token = scanner.next();
            System.out.println(token);
        }
        
        Scanner scanner1 = new Scanner(s);
        // findInLine() example
        System.out.println("\nAny 5 letter plus much : "
                + scanner1.findInLine(
                      Pattern.compile(".....much")));
        
        System.out.println("\nAny 2 letter plus rry : "
                + scanner1.findInLine(
                      Pattern.compile("..rry")));

        scanner.close();
        scanner1.close();
    }
}
