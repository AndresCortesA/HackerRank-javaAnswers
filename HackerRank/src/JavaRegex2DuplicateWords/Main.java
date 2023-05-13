package JavaRegex2DuplicateWords;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        /*
        *  una expresión regular (RegEx) que coincida con cualquier palabra repetida. usar este patron
               "\\b(\\w+)(\\b\\W+\\b\\1\\b)*".
        * Completa el segundo argumento de Pattern.compile para que la expresión regular compilada, no distinga entre
            mayúsculas y minúsculas. usar Pattern.CASE_INSENSITIVE como valor.

        * Escribe los dos argumentos necesarios para replaceAll de manera que cada palabra repetida se reemplace por
            la primera aparición de esa palabra en la oración. Puedes usar $1 como reemplazo.
        *
        * */


        String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
