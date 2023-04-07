package RecortarStrings;

    import java.util.*;
    public class ShortestSubstringContainingCharacters {

        public static int shortestSubstring(String givenString) {
            Set<Character> uniqueChars = new HashSet<>();
            for (int i = 0; i < givenString.length(); i++) {
                uniqueChars.add(givenString.charAt(i));
            }

            int left = 0;
            int right = 0;
            int shortestLength = Integer.MAX_VALUE;
            Map<Character, Integer> charCount = new HashMap<>();
            while (right < givenString.length()) {
                char currentChar = givenString.charAt(right);
                charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);
                right++;

                while (charCount.size() == uniqueChars.size()) {
                    shortestLength = Math.min(shortestLength, right - left);
                    char leftChar = givenString.charAt(left);
                    charCount.put(leftChar, charCount.get(leftChar) - 1);
                    if (charCount.get(leftChar) == 0) {
                        charCount.remove(leftChar);
                    }
                    left++;
                }
            }

            return shortestLength;
        }

        public static void main(String[] args) {
            String givenString1 = "asdfkjeghfalawefhaef";
            int expectedOutput1 = 13;
            int actualOutput1 = shortestSubstring(givenString1);
            System.out.println("Input string: " + givenString1);
            System.out.println("Expected output: " + expectedOutput1);
            System.out.println("Actual output: " + actualOutput1);
            System.out.println();

            String givenString2 = "abcde";
            int expectedOutput2 = 5;
            int actualOutput2 = shortestSubstring(givenString2);
            System.out.println("Input string: " + givenString2);
            System.out.println("Expected output: " + expectedOutput2);
            System.out.println("Actual output: " + actualOutput2);
            System.out.println();

            String givenString3 = "aaaaaa";
            int expectedOutput3 = 1;
            int actualOutput3 = shortestSubstring(givenString3);
            System.out.println("Input string: " + givenString3);
            System.out.println("Expected output: " + expectedOutput3);
            System.out.println("Actual output: " + actualOutput3);
            System.out.println();

            String givenString4 = "aaaabbbccc";
            int expectedOutput4 = 4;
            int actualOutput4 = shortestSubstring(givenString4);
            System.out.println("Input string: " + givenString4);
            System.out.println("Expected output: " + expectedOutput4);
            System.out.println("Actual output: " + actualOutput4);
            System.out.println();
        }
    }


