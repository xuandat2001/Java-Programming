import java.util.Scanner;
public class problem1 {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter three numbers: ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int num3 = scanner.nextInt();

    if (num1 < num2 ) {
        if (num1 < num3){
            System.out.print(num1);
            if (num2 < num3) {
                System.out.print(num2);
                System.out.print(num3);
            } else {
                System.out.print(num3);
                System.out.print(num2);
            }
        } else {
            System.out.print(num3);
            System.out.print(num1);
            System.out.print(num2);
        }
    }
    else{
        if (num2 < num3){
            System.out.print(num2);
            if (num1 < num3){
                System.out.print(num1);
                System.out.print(num3);
            }
            else{
                System.out.print(num3);
                System.out.print(num1);
            }
        }
        else{
            System.out.print(num3);
            System.out.print(num2);
            System.out.print(num1);
        }
    }

    }
}
