package JavaSubstring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String lineS = S.substring(start, end);

        System.out.println(lineS);
    }
}
