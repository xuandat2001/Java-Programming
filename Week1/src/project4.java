public class project4 {
    public static void main(String[] args) {
        double result;
        System.out.print(" Miles      Kilometers      |       Kilometers       Miles \n");

        for (int i = 1; i <= 10; i++) {
            result = i * 1.609;
            System.out.printf("  %d       %.2f    |\n",i, result);

        }
    }
}
