import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        double x = (p * r)/100.00;
        double y = x * t;
        System.out.printf("%.2f",y);
    }
}