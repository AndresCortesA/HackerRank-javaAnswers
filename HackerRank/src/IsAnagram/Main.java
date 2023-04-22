package IsAnagram;

import java.util.Arrays;

public class Main {

    static boolean isAnagram(String a, String b) {
        //convertir las cadenas a minusculas ya que no es sensible a este cambio
        a = a.toLowerCase().replaceAll("\\s+","");
        b = b.toLowerCase().replaceAll("\\s+","");
        // Crear los arreglos de caracteres y ordenarlos
        char[] aArregos = a.toCharArray(); //toCharArray convierte un caracter en arreglo
        char[] bArregos = b.toCharArray();
        //los ordenamos de manera ascendente con sort
        Arrays.sort(aArregos);
        Arrays.sort(bArregos);

        //comparar
        return Arrays.equals(aArregos, bArregos);// true o false
    }
    public static void main(String[] args) {
        if (isAnagram("anagram","margana")){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
        String a = "anagram";
        String b = "margana";
        a = a.toLowerCase().replaceAll("\\s+","");
        b = b.toLowerCase().replaceAll("\\s+","");
        char[] aArregos = a.toCharArray();
        char[] bArregos = b.toCharArray();
        Arrays.sort(aArregos);
        Arrays.sort(bArregos);
        System.out.println(Arrays.toString(aArregos) + "\n" + Arrays.toString(bArregos) + "\n"+ isAnagram(a,b));


        /*
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean prueba = isAnagram(a, b);
        System.out.println( (prueba) ? "Anagrams" : "Not Anagrams" );
        * */


    }
}
