import java.util.*;

public class studentname {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String firstname = sc.nextLine();
        String secondname = sc.nextLine();
        int ID = sc.nextInt();
        String result;

        if (firstname.length() > secondname.length()) {
            result = secondname.charAt(secondname.length() - 1) + firstname;
            System.out.println(result);
        } else {
            result = firstname.charAt(firstname.length() - 1) + secondname;
            System.out.println(result);
        }

        String temp = Integer.toString(ID);
        int[] number = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            number[i] = temp.charAt(i) - '0';
        }
        System.out.println(result + +number[1] + +number[number.length - 2]);
    }
}
