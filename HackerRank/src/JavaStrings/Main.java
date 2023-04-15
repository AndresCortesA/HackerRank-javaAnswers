package JavaStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int sum = A.length() + B.length();
        System.out.println(sum);

        int compare = A.compareTo(B);

        if (compare > 0){
            System.out.println("Yes");
        } else if (compare < 0){
            System.out.println("No");
        } else {
            System.out.println("No");
        }

        String firtstLetterA = A.substring(0,1).toUpperCase() + A.substring(1);
        String firtstLetterB = B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.println(firtstLetterA + " " + firtstLetterB);
    }
}
