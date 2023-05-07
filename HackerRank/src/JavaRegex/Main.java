package JavaRegex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    class MyRegex{
        static String pattern;

        static{
            // Expresión regular que nos ayude a valirdar una direccion IP en el rango establecido
            //Solo necesitamos validar que la Ip en cada campo este acompañado de 1 o 3 digitos después del punto
           pattern = "^(\\b(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\b\\.){3}(\\b(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\b)$";
        }
    }

    public static void main(String[] args) {

        String[] ips = {
               "259.259.259.259",

                "266.266.266.266",

               "255.255.255.255",

                "555.555.555.555",

                "666.666.666.666",

                "249.249.249.249",

                "249.249.249.256"
        };

        for (String ip : ips) {
            boolean isValid = Pattern.matches(MyRegex.pattern, ip);
            System.out.println(isValid);
        }

    }



}
