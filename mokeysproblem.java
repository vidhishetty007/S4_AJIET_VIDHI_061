import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int j = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();

        int bananaMonkeys = (m + k - 1) / k;
        int peanutMonkeys = (p + j - 1) / j;

        int monkeysLeft = n - (bananaMonkeys + peanutMonkeys);

        if(monkeysLeft < 0) {
            monkeysLeft = 0;
        }

        System.out.println("Monkeys left on the tree:" +monkeysLeft);
    }
}
