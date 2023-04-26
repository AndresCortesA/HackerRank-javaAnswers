package JavaStringTokens;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        //en la prueba debemos tener en cuenta los espacios en blanco como vacios, esa manera podemos usar trim()
        if(s.length()==0|| s.trim().length()==0){
            System.out.println(0);
            return;
        }

        String[] subCadenas = s.trim().split("\\s*[^A-Za-z]+\\s*");/*[^A-Za-z]+ no necesitamos realmente detectar lo que
        nos pide directamente el problema, solo necesitamos los caracteres y con esta parte no más ya cumple*/
        System.out.println(subCadenas.length);
        for (String subcadena : subCadenas) {
            System.out.println(subcadena);
        }
    }
}
