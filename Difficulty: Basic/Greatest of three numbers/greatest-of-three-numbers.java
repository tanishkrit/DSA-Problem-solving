import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int s = Math.max(a, b);
        int x = Math.max(s ,c);

        System.out.print(x);
    }
}