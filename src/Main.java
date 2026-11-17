import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cherry pick branch");
        Scanner scan = new Scanner(System.in);
        int inp = scan.nextInt();
        System.out.println("input = " + inp);
        System.out.println("Start of program");
        int a = 169,b = 21;
        double sum,diff,mult,div;
        sum = (double) a+b;
        System.out.println("sum = " + sum);
        diff = (double) a-b;
        System.out.println("diff = " + diff);
        mult = (double) a*b;
        System.out.println("mult = " + mult);
        div = (double) a/b;
        System.out.println("div = " + div);
        System.out.println("End of program");
        double res;
        res = (double) a+b;
        System.out.println("sum = " + res);
    }
}