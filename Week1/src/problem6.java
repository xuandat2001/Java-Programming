import java.util.Scanner;
import java.lang.Math;

public class problem6 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the circle1's x, y coordinates and radius: ");
        double x1 =  scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double radius1 = scanner.nextDouble();


        System.out.print("Enter the circle2's x, y coordinates and radius: ");
        double x2 =  scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double radius2 = scanner.nextDouble();

        double distance = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
        System.out.printf("%.2f   ", distance);
        double distanceRadius1 = Math.abs(radius1 - radius2);
        System.out.printf("%.2f  ", distanceRadius1);
        double distanceRadius2 = radius1 + radius2;
        System.out.printf("%.2f \n", distanceRadius2);
        if (distance <= distanceRadius1){
            System.out.print("Circle2 is inside");
        }
        else if(distance <= distanceRadius2){
            System.out.print("Circle2 is overlap");
        }
        else{
            System.out.print("two circles are not match");
        }
    }
}
