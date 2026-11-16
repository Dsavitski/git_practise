import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inp = scan.nextInt();
        System.out.println("input = " + inp);
        int a = 125,b = 5;
        double sum,diff;
        sum = (double) a+b;
        System.out.println("sum = " + sum);
        diff = (double) a-b;
        System.out.println("diff = " + diff);

    }
}