import java.util.*;

public class task1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int sarr[], spos, darr[], dpos;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();

        }
        sarr = a;
        spos = sc.nextInt();
        System.out.println("source position" + spos);
        darr = a;
        dpos = sc.nextInt();
        System.out.println("destination position" + dpos);
        int len = sc.nextInt();
        System.out.println("length :" + len);
        System.arraycopy(sarr, spos, darr, dpos, len);
        System.out.println("after the array copy method");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
