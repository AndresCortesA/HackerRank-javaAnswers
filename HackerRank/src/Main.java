import java.util.*;

public class Main {

    public static List<String> funWithAnagrams(List<String> text) {
        Map<String, String> map = new LinkedHashMap<>();
        for (String str : text) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, str);
            }
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

            List<String> text = Arrays.asList("poke","pkoe","okpe","ekop");
            List<String> result = funWithAnagrams(text);
            System.out.println(result); // [code, frame, framer]


    }
}