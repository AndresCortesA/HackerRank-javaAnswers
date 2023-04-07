package UltimasDosLetras;

public class InvertirDosLetras {
    public static String lastLetters(String word) {
    String lastTwoChars = word.substring(word.length() - 2);
    String reversed = new StringBuilder(lastTwoChars).reverse().toString();
    return reversed.charAt(0) + " " + reversed.charAt(1);
}

    public static void main(String[] args) {
        String word = "bat";
        String result = lastLetters(word);
        System.out.println(result); // Output: t a
    }



}
