import java.util.Scanner;
public class problem2 {
    public static void main(String[] args){
        int num;
        while (true){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter your number: ");
        num = scanner.nextInt();
            if (num > 0) {
                if (num % 5 == 0 && num % 6 == 0) {
                    System.out.print(num + " is divisible by both 5 and 6");
                } else if (num % 5 == 0 || num % 6 == 0) {
                    System.out.print(num + " is divisible by 5 or 6 but not both");
                } else if (num % 5 != 0 && num % 6 != 0) {
                    System.out.print(num + " is neither divisible by 5 nor 6");
                }
            }
            else{
                System.out.print("Good bye");
                break;
            }
        }
    }
}
